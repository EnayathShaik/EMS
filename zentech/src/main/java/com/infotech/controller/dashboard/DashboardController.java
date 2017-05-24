package com.infotech.controller.dashboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.entity.User;
import com.infotech.model.UserPersonalDetailModel;
import com.infotech.services.registration.UserPersonalDetailService;


@Controller
public class DashboardController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserPersonalDetailService userPersonalDetailServices;
	
	@RequestMapping(value= "/login" ,method={RequestMethod.GET})
	private ModelAndView loginPageRequest(@ModelAttribute("joiningUserDetails") UserPersonalDetailModel userDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {		
		ModelAndView model = new ModelAndView();	
		model.setViewName("login/joininglogin");
		
		return model;

	}
	
	
	@RequestMapping(value = "/logout"  ,method={RequestMethod.GET})
	public ModelAndView logoutPage(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		HttpSession session = request.getSession();
		session.invalidate();
		logger.info("logout...Successfully");
		modelAndView.setViewName("login/joininglogin");
		return modelAndView;

	}
	
	
	
	@RequestMapping(value= "/index" ,method={RequestMethod.GET})
	private ModelAndView dashboardPageRequest(@ModelAttribute("joiningUserDetails") UserPersonalDetailModel userDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		User user=userPersonalDetailServices.getUserDetailsById((long)1);
		
		ModelAndView model = new ModelAndView();
		model.addObject("userInfo", user);
		logger.info(user.getUserName());
		//System.out.println(user.getUserName());
		model.setViewName("dashboard/dashboard");
		
		System.out.println("------ ALL DETAILS------");
		int setNextActive = 0;
		if(user.getUserPersonalDetails().size() == 0)
			setNextActive = 1;
		else if(user.getFamilyDetails().size() == 0)
			setNextActive = 2;
		else if(user.getEducationQualificationDetail().size() == 0)
			setNextActive = 3;
		else if(user.getUserExperienceDetail().size() == 0)
			setNextActive = 4;
		else if(user.getLastCompanyDetail().size() == 0)
			setNextActive = 5;
		else if(user.getUserAdditionalDetail().size() == 0)
			setNextActive = 6;
		else if(user.getUserEmergencyDetail().size() == 0)
			setNextActive = 7;
		model.addObject("active", setNextActive);
		
		logger.info("getUserPersonalDetails :"+user.getUserPersonalDetails());
		logger.info("getFamilyDetails :"+user.getFamilyDetails());
		logger.info("getEducationQualificationDetail :"+user.getEducationQualificationDetail());
		logger.info("getUserExperienceDetail :"+user.getUserExperienceDetail());
		logger.info("getLastCompanyDetail :"+user.getLastCompanyDetail());
		logger.info("getUserAdditionalDetail :"+user.getUserAdditionalDetail());
		logger.info("getUserEmergencyDetail :"+user.getUserEmergencyDetail());
		
		return model;

	}
	
	
	
}
