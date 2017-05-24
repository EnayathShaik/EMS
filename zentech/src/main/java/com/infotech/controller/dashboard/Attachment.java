package com.infotech.controller.dashboard;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.dao.AD_AttachmentDao;
import com.infotech.entity.AD_Attachment;
import com.infotech.model.UserPersonalDetailModel;

public class Attachment {

	@Autowired
	AD_AttachmentDao ad_AttachmentDao;

	@RequestMapping(value = "/attachment-file", method = { RequestMethod.GET })
	private ModelAndView loginPageRequest(@ModelAttribute("joiningUserDetails") UserPersonalDetailModel userDetails,
			HttpSession session, HttpServletRequest request, HttpServletResponse response) {

		List<AD_Attachment> attach = new ArrayList<AD_Attachment>();
		
		InputStream inputStream = null; // input stream of the upload file

		Part filePart;
		try {
			filePart = request.getPart("photo");
			if (filePart != null) {
	            // prints out some information for debugging
	            System.out.println(filePart.getName());
	            System.out.println(filePart.getSize());
	            System.out.println(filePart.getContentType());
	             
	            // obtains input stream of the upload file
	            inputStream = filePart.getInputStream();
	        }
		} catch (IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("joiningforms/docattachments");
		return model;
        
		
		/*if (ad_Attach.getFileName() != null && !ad_Attach.getFileName().equals("")) {
			Filedownload.save(ad_Attach.getMedia(), "application/file", ad_Attach.getFileName());
			String filePath = ((HttpServletRequest) Executions.getCurrent().getNativeRequest()).getSession()
					.getServletContext().getRealPath("/");
			System.out.println("File Path - " + filePath + "=FILE NAME =" + ad_Attach.getFileName());

			File f = new File(filePath + "attachment" + File.separator);
			if (f.mkdir()) {
				FileOutputStream fileOuputStream;
				fileOuputStream = new FileOutputStream(f.getPath() + "\\" + ad_Attach.getFileName());
				fileOuputStream.write(ad_Attach.getMedia());
				fileOuputStream.close();
			}
		}
*/
	}
}
