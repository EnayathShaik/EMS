package com.infotech.controller.registration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.UserEmergencyDetailModel;

@Controller
public class UserEmergencyController {
	
	@RequestMapping(value= "/emergency-details-info" ,method={RequestMethod.GET})
	private ModelAndView emergencyDetails(@ModelAttribute("emergencyRecords") UserEmergencyDetailModel userDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		System.out.println("emergency-details-info................");
		userDetails.setUserID(1L);
		model.setViewName("joiningforms/emergencydetails");
		return model;

	}
	
	
	@RequestMapping(value= "/emergency-records" ,method={RequestMethod.POST})
	private ModelAndView emergencyDetailsSave(@ModelAttribute("emergencyRecords") UserEmergencyDetailModel userDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		System.out.println("emergency-details-info................");
        System.out.println("Emengeny Contact..............."+userDetails.getEmergencyNumber());
		model.setViewName("joiningforms/emergencydetails");
		return model;

	}

}
