package com.infotech.configuration;
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infotech.entity.User;
import com.infotech.model.UserModel;
 
/*@author Raju Singh
 *  
 * 	class CustomPortalUserDetailsService 
 *  
*/
@Service("customPortalUserDetailsService")
public class CustomPortalUserDetailsService implements UserDetailsService{

	private Logger logger = LoggerFactory.getLogger(CustomPortalUserDetailsService.class);
	
	@PersistenceContext
	private EntityManager entityManager;
  
	@Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
		
		UserModel employeeUser=new UserModel();
              
        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.userName=?1", User.class);
		query.setParameter(1, userName);
		try {
			List<User> userList= (List<User>) query.getResultList();
			User user = userList.get(0);
			employeeUser.setUserName(user.getUserName());
			employeeUser.setPassword(user.getPassword());
		} catch (Exception e) {
			
		} 
		
			
        return new org.springframework.security.core.userdetails.User(userName, employeeUser.getPassword(), 
                 true, true, true, true, getGrantedAuthorities(employeeUser));
    }
 
     
    private List<GrantedAuthority> getGrantedAuthorities(UserModel portalUser){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
                  authorities.add(new SimpleGrantedAuthority("ROLE_EMPLOYEE"));
           return authorities;
        

    }
     
}