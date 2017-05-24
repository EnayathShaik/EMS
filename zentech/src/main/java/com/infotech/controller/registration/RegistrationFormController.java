package com.infotech.controller.registration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.CommonFormBean;
import com.infotech.model.UserAdditionalDetailModel;
import com.infotech.model.UserEmergencyDetailModel;
import com.infotech.model.UserLastCompanyDetailModel;
import com.infotech.model.UserModel;
import com.infotech.model.UserPersonalDetailModel;
import com.infotech.services.registration.LastCompanyDetailsService;
import com.infotech.services.registration.UserEducationQualificationDetailService;
import com.infotech.services.registration.UserEmergencyDetailService;
import com.infotech.services.registration.UserExperienceDetailService;
import com.infotech.services.registration.UserFamilyDetailService;
import com.infotech.services.registration.UserPersonalDetailService;


@Controller
public class RegistrationFormController {
	
	@Autowired
	private UserPersonalDetailService userPersonalDetailServices;
	@Autowired
	private UserFamilyDetailService userFamilyDetailService;
	@Autowired
	private UserEducationQualificationDetailService educationQualificationDetailService;
	@Autowired
	private UserExperienceDetailService userExperienceDetailService;
	
	@Autowired
	private UserEmergencyDetailService emergencyDetailService;
	
	@Autowired
	private LastCompanyDetailsService lastCompanyDetailsService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	    binder.registerCustomEditor(double.class, new CustomNumberEditor(Double.class,false));
	    binder.registerCustomEditor(float.class, new CustomNumberEditor(Float.class,false));
	    binder.registerCustomEditor(long.class, new CustomNumberEditor(Long.class,false));
	    binder.registerCustomEditor(int.class, new CustomNumberEditor(Integer.class,false));
	}
    
	
	
	@RequestMapping(value= "/user-info",method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody Map<String,Object> userinfo(UserModel userDetails,HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		userDetails.setUserID((long)1);
		System.out.println(userDetails.toString());
		userPersonalDetailServices.addUserDetail(userDetails);
		Map<String,Object> resp = new HashMap<String,Object>();
		resp.put("succcess", "true");
		return resp;		

	}
	@RequestMapping(value= "/personal-info",method=RequestMethod.POST,consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody Map<String,Object> newJoiningRequest(@ModelAttribute("joiningUserDetails")UserPersonalDetailModel userDetails,HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		userDetails.setUserID((long)1); // set default id 
		UserPersonalDetailModel userDetailModel =userPersonalDetailServices.getUserPersonalDetailByUserID(userDetails.getUserID());		
		/* check if already exists */
		if(userDetailModel.getUserPersonalDetailID() != null)
			userDetails.setUserPersonalDetailID(userDetailModel.getUserPersonalDetailID());		
		System.out.println(userDetails);
		userPersonalDetailServices.addUserPersonalDetail(userDetails);
		Map<String,Object> resp = new HashMap<String,Object>();
		resp.put("succcess", "true");
		return resp;		

	}
	
	@RequestMapping(value= "/family-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody CommonFormBean familyDetailsSave( CommonFormBean listFamilyDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		System.out.println(listFamilyDetails);
		userFamilyDetailService.addFamilyDetail(listFamilyDetails.getListFamilyModel());
		return listFamilyDetails;

	}
	
	@RequestMapping(value= "/education-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody CommonFormBean educationDetailsSave( CommonFormBean commonFormBean,
			HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		System.out.println(commonFormBean);
		educationQualificationDetailService.addEducationDetails(commonFormBean.getListEducationModel());
		return commonFormBean;

	}
	
	@RequestMapping(value= "/experience-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody CommonFormBean experienceDetailsSave( CommonFormBean commonFormBean,
			HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		System.out.println(commonFormBean);
		userExperienceDetailService.addUserExperienceDetails(commonFormBean.getListExperienceModel());
		return commonFormBean;

	}
	@RequestMapping(value= "/emergency-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody UserEmergencyDetailModel emergencyDetailsSave( UserEmergencyDetailModel emergencyDetailModel,
			HttpSession session, HttpServletRequest request,HttpServletResponse response,BindingResult result) {
		System.out.println(emergencyDetailModel);
		//userExperienceDetailService.addUserExperienceDetails(commonFormBean.getListExperienceModel());
		emergencyDetailService.addEmergencyDetail(emergencyDetailModel);
		
		return emergencyDetailModel;

	}
	
	@RequestMapping(value= "/reference-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody UserAdditionalDetailModel referenceDetailsSave(@ModelAttribute("joiningUserDetails") UserAdditionalDetailModel userAdditionalDetailModel,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
				System.out.println(userAdditionalDetailModel);
				userPersonalDetailServices.addUserAdditionalDetail(userAdditionalDetailModel);
		return userAdditionalDetailModel;

	}
	@RequestMapping(value= "/past-position-details-info" ,method={RequestMethod.POST},consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces="application/json")
	private @ResponseBody UserLastCompanyDetailModel pastPositionDetailsSave(@ModelAttribute("joiningUserDetails") UserLastCompanyDetailModel userLastCompanyDetailModel ,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		System.out.println(userLastCompanyDetailModel);
		lastCompanyDetailsService.addUserLastCompanyDetail(userLastCompanyDetailModel);
		return userLastCompanyDetailModel;

	}
	
	
	
	@RequestMapping(value= "/attachments-details-info" ,method={RequestMethod.GET})
	private ModelAndView AttachmentsDetailsSave(@ModelAttribute("joiningUserDetails") UserPersonalDetailModel userDetails,
			HttpSession session, HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView();
		System.out.println("HEllo................");
		String message = "Login";
		model.setViewName("joiningforms/docattachments");
		model.addObject("message", message);
		return model;

	}
	
	


}
