<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="A Components Mix Bootstarp 3 Admin Dashboard Template">
      <meta name="author" content="Westilian">
      <title>Zentech</title>
      
     
      <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css" />">
      <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/animate.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/waves.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/layout.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/components.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/plugins.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/common-styles.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/pages.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>">
      <link rel="stylesheet" href="<c:url value="/resources/css/matmix-iconfont.css"/>">
      <link href="http://fonts.googleapis.com/css?family=Roboto:400,300,400italic,500,500italic" rel="stylesheet" type="text/css">
      <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet" type="text/css">
      <!----------- Drag and Drop-------------->
      <link href="<c:url value="/resources/css/dragdrop.css"/>">
      <!----------- END Drag and Drop-------------->
      <script src="resources/js/jquery-2.1.4.min.js"></script>
   </head>
   <body>
      <div class="page-container list-menu-view">
         <div class="page-wrap">
            <!--Leftbar Start Here -->
            <div class="left-aside desktop-view">
               <div class="aside-branding profile_bg" style="height:auto; padding:12px; background-color: #2C7BA9;">
                  <a href="index.html" class="large-logo" style="text-decoration:none;">
                     <img src="resources/images/avatar/profilepics.jpg" alt="My Profile" style="width:50px; height:50px; border-radius:100%;">
                     <div style="margin-top:10px; color:#fff;">Raju Singh</div>
                     <div style="color:#fff;">raju.singh@gmail.com</div>
                  </a>
                  <span class="aside-pin waves-effect"><i class="fa fa-thumb-tack"></i></span>
                  <span class="aside-close waves-effect"><i class="fa fa-times"></i></span>
               </div>
               <div class="left-navigation">
                  <ul class="list-accordion">
                     <li>
                        <a href="#" class="waves-effect active"><span class="nav-icon"><i class="fa fa-home"></i></span><span class="nav-label">My Account</span> </a>
                        <ul>
                           <li><a href="#">View profile</a></li>
                           <li><a href="#">Settings</a></li>
                        </ul>
                  </ul>
               </div>
            </div>
            <div class="page-content">
               <!--Topbar Start Here -->
               <header class="top-bar s3-fixed-header forum-header pad_t10" style="min-height: 42px;">
                 

					<div class="row">
					    <div class="col-md2">
											<ul class="top_nav pull-left"
												style="list-style-type: none; padding: 0; margin: 0;">
												<li>
													<div class="top_nav_item">
														<span class="leftbar-action-mobile waves-effect"
															style="top: 7px; width: 28px; height: 28px;"> <i
															class="fa fa-bars"
															style="font-size: 13px; width: 28px; height: 28px; line-height: 29px;"></i>
														</span> <span class="leftbar-action desktop waves-effect"
															style="top: 7px; width: 28px; height: 28px;"> <i
															class="fa fa-bars"
															style="font-size: 13px; width: 28px; height: 28px; line-height: 29px;"></i>
														</span>
													</div>
												</li>
											</ul>
				        </div>
					    <div class="col-md-5">
							<h2 class="forum-title">Zentech Group of Companies</h2>
							<p class="forum-sub-title mrg_b0">(Corporate Office)</p>
						</div>
						<div class="col-md-5">
							<img src="resources/images/zentech.png" alt="zentech logo"
								style="width: 60px; height: 80px; border-radius: 100%;">
						</div>
						
					</div>
				</header>
               
               <div class="main-container">
					<div class="forum-container" style="margin:0;">
						<div class="forum-list">
								
									
								<div class="forum-list">
									<ul class="nav nav-tabs">
										<li class="active"><a href="<c:url value="/org-newjoining"/>">Home</a></li>
										<li><a href="<c:url value="/family-details-info"/>">Family Details</a></li>
										<li><a href="<c:url value="/education-details-info"/>">Education Qualification</a></li>
										<li><a href="<c:url value="/experience-details-info"/>">Experience</a></li>
										<li><a href="<c:url value="/reference-details-info"/>">Reference and Other Details</a></li>
										<li><a href="<c:url value="/emergency-details-info"/>">Emergency Details</a></li>
										<li><a href="<c:url value="/attachments-details-info"/>">Attachments</a></li>
									</ul>
								</div>
										<div class="col-md-12">

										
											<div class="form-group col-md-6">
              								<label> <i class=" fa fa-user"></i>  Name <span class="aestrik">*</span> </label>
              								<input type="text" class="form-control"  placeholder="Enter Name" id="username"/>
           								   </div>
            
								            <div class="form-group col-md-6">
								              <label><i class="fa fa-key" aria-hidden="true"></i> Father Name <span class="aestrik">*</span> </label>
								              <input type="text" class="form-control" id="fatherID" placeholder="Enter Father Name"/>
								            </div>
								            
								             <div class="form-group col-md-6">
              								<label> <i class=" fa fa-user"></i>  Designation <span class="aestrik">*</span> </label>
              								<input type="text" class="form-control"  placeholder="Enter Designation" id="designationID"/>
           								   </div>
            
								            							            
								             <div class="form-group col-md-6">
              								<label> <i class=" fa fa-user"></i>  Date of Joining <span class="aestrik">*</span> </label>
              								<input type="date" class="form-control"  placeholder="Select Date Of Joining" id="datejoiningID"/>
           								   </div>
           								   
           								   <div class="form-group col-md-12">
								              <label><i class="fa fa-home" aria-hidden="true"></i> Address <span class="aestrik">*</span> </label>
								              <textarea class="form-control" id="addressID" rows="2"  maxlength="100"></textarea>
								           </div>

 											           								   
           								    										
											PERSONAL DATA FORM
											
											<div class="form-group col-md-12">
              								<label> <i class=" fa fa-user"></i> Full  Name <span class="aestrik">*</span> </label>
              								<input type="text" class="form-control"  placeholder="Enter Full Name" id="fullNameID"/>
           								   </div>
           								   
           								   <div class="form-group col-md-4">
              								<label> Date Of Birth <span class="aestrik">*</span> </label>
              								<input type="date" class="form-control"  placeholder="Enter Date Of Birth" id="dateOfBirthID"/>
           								   </div>
           								   
           								   <div class="form-group col-md-4">
              								<label>  Weight <span class="aestrik">*</span> </label>
              								<input type="text" class="form-control"  placeholder="Enter Weight" id="WeightID"/>
           								   </div>
           								   
           								   <div class="form-group col-md-4">
              								<label>  Height <span class="aestrik">*</span> </label>
              								<input type="text" class="form-control"  placeholder="Enter Height" id="HeightID"/>
           								   </div>
											

                                            <div class="form-group col-md-12">
								              <label><i class="fa fa-home" aria-hidden="true"></i> Postal Address <span class="aestrik">*</span> </label>
								              <textarea class="form-control" id="postaladdressID" rows="2"  maxlength="100"></textarea>
								           </div>
								           
								           <div class="form-group col-md-12">
								              <label><i  class="fa fa-home"  aria-hidden="true"></i> Permanent Address <span class="aestrik">*</span> </label>
								              <textarea class="form-control" id="parmanentaddressID" rows="2"  maxlength="100"></textarea>
								           </div>


											<div class="forum-form-body clearfix">

												<div class="forum-form-btn">
													<!-- <button class="btn btn-info">Submit</button> -->
													<a href="<c:url value="/family-details-info"/>" class="btn btn-info">Submit</a>
													<button class="btn btn-info topic-close">Cancel</button>
												</div>
											</div>


										</div>
										</div>
									</div>
								</div>
							</div>
						   
						</div>
						
					</div>
				
        
	 
	 
      <script src='resources/js/general.js'></script>
      <!------------ Drag And Drop --------------->
      <script src='resources/js/dragdrop.js'></script>
      <script src='resources/js/dragdrop.min.js'></script>
      <!------------ END Drag And Drop --------------->
      <script src="resources/js/jquery-1.11.2.min.js"></script>
      <script src="resources/js/jquery-migrate-1.2.1.min.js"></script>
      <!--Load Mask-->
      <script src="resources/js/jquery.loadmask.js"></script>
      <script src="resources/js/jRespond.min.js"></script>
      <script src="resources/js/bootstrap.min.js"></script>
      <script src="resources/js/nav-accordion.js"></script>
      <script src="resources/js/hoverintent.js"></script>
      <!--Materialize Effect-->
      <script src="resources/js/waves.js"></script>
      <!--iCheck-->
      <script src="resources/js/icheck.js"></script>
      <!--Select2-->
      <script src="resources/js/select2.js"></script>
      <!--jquery.mentionsInput-->
      <script src="resources/js/underscore.js"></script>
      <script src="resources/js/jquery.elastic.js"></script>
      <script src="resources/js/jquery.events.input.js"></script>
      <script src="resources/js/jquery.mentionsInput.js"></script>
      <!--Text Editor-->
      <script src="resources/js/summernote.min.js"></script>
      <!--CHARTS-->
      <script src="resources/js/chart/sparkline/jquery.sparkline.js"></script>
      <script src="resources/js/chart/easypie/jquery.easypiechart.min.js"></script>
      <!--Smart Resize-->
      <script src="resources/js/smart-resize.js"></script>
      <!--Forms Plugins-->
      <script src="resources/js/jquery.tagsinput.js"></script>
      <script src="resources/js/jquery.mask.js"></script>
      <script src="resources/js/jquery.bootstrap-touchspin.js"></script>
      <script src="resources/js/bootstrap-filestyle.js"></script>
      <script src="resources/js/selectize.js"></script>
      <script src="resources/js/bootstrap-datepicker.js"></script>
      <script src="resources/js/moment.js"></script>
      <script src="resources/js/daterangepicker.js"></script>
      <!--Layout Initialize-->
      <script src="resources/js/layout.init.js"></script>
      <!--Template Plugins Initialize-->
      <script src="resources/js/matmix.init.js"></script>
      <!--High Resolution Ready-->
      <script src="resources/js/retina.min.js"></script>
   </body>
</html>