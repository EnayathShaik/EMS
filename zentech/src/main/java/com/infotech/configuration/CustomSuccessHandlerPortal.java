package com.infotech.configuration;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/*@author Raju Singh
 *  
 * 	class CustomSuccessHandlerPortal 
 *  
*/
@Component
public class CustomSuccessHandlerPortal extends SimpleUrlAuthenticationSuccessHandler {
	
	private Logger logger = LoggerFactory.getLogger(CustomSuccessHandlerPortal.class);
 
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    
 
    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException {
         
        String targetUrl = determineTargetUrl(authentication);
        if (response.isCommitted()) {
        	logger.info("handle: Can't redirect");
            return;
        }
         redirectStrategy.sendRedirect(request, response, targetUrl);
    }
 
    /*
     * This method extracts the roles of currently logged-in user and returns
     * appropriate URL according to his/her role.
     */
    protected String determineTargetUrl(Authentication authentication) {
        String url = "";
        url = "/index";

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<String>(); 
        for (GrantedAuthority a : authorities) {
            roles.add(a.getAuthority());
        }
        
        return url;
    }
    
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
 
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
    
    
    
    
    
    
    
 
}