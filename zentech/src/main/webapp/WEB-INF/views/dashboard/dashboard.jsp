<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Payment</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />"  rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.min.css" />"  rel="stylesheet">
    <link href="<c:url value="/resources/css/jquery-ui.min.css"/>"  rel="stylesheet">
    <link href="<c:url value="/resources/css/jquery-ui.structure.min.css"/>"  rel="stylesheet">
    <link href="<c:url value="/resources/css/animate.css"/>"  rel="stylesheet">
    <link href="<c:url value="/resources/css/tutorial.css"/>"  rel="stylesheet">
    <link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>

<body class="employee-background">


    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="resources/images/logo.png" class="img-responsive logo" alt="Zentech Logo" title="Zentech Info Solutions" width="150"></a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown active">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">
                      Masters <span class="caret"></span>
                    </a>
                        <ul class="dropdown-menu" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Modules</a></li>
                    <li><a href="#about">Transactions</a></li>
                    <li><a href="#">Utilities</a></li>
                    <li><a href="#">Reports</a></li>
                    <li><a href="#">Employee ID</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true">
                      Mr. Admin <span class="fa fa-cog fa-spin"></span>
                    </a>
                        <ul class="dropdown-menu" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
                            <li><a href="#"><i class="fa fa-plus new-employee-color"></i> New Employee</a></li>
                            <li><a href="#"><i class="fa fa-file-text attendance-color"></i> Attendance Sheet</a></li>
                            <li><a href="#"><i class="fa fa-inr payslip-color"></i> View Payslip</a></li>
                            <li><a href="#"><i class="fa fa-refresh refresh-color"></i> Refresh</a></li>
                            <li><a  href="./logout"><i class="fa fa-sign-out sign-out-color"></i> Logout</a></li>
                        </ul>
                    </li>


                </ul>
            </div>
            <!--/.nav-collapse -->
        </div>
    </nav>

    <!-- main body -->
    <div class="container  top-random">

        <!-- random search -->
        <div class="row">
            <a href="#search" class="search-btn" data-toggle="modal" data-target="#search"><i class="fa fa-search"></i></a>
            <div class="col-md-2 hidden-xs"></div>
            <div class="col-md-8 col-xs-12">

                <!-- search modal -->
                <!-- Modal -->
                <div id="search" class="modal fade" role="dialog">
                    <div class="modal-dialog">
                        <!-- Modal content-->
                        <div class="modal-content">
                            <div class="modal-body">
                                <div class="input-group">
                                    <input type="text" class="form-control" style="height: 46px;" placeholder="Search for...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default btn-lg" type="button"><i class="fa fa-search"></i></button>
                                    </span>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
            <div class="col-md-2 hidden-xs"></div>
        </div>
        <!-- random search ends -->

        <!-- main working -->
        <div class="row">

            <!-- form steps -->
            <div class="col-md-2 hidden-xs"></div>
            <div class="col-md-8 col-xs-12">
                <div class="stepwizard">
                    <div class="stepwizard-row setup-panel">
                        <div class="stepwizard-step">
                            <a href="#step-1" class="btn btn-primary btn-circle">1</a>
                            <p>Step 1</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-2" class="btn btn-default btn-circle">2</a>
                            <p>Step 2</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-3" class="btn btn-default btn-circle">3</a>
                            <p>Step 3</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-4" class="btn btn-default btn-circle">4</a>
                            <p>Step 4</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-5" class="btn btn-default btn-circle">5</a>
                            <p>Step 5</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-6" class="btn btn-default btn-circle">6</a>
                            <p>Step 6</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-7" class="btn btn-default btn-circle">7</a>
                            <p>Step 7</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-8" class="btn btn-default btn-circle">8</a>
                            <p>Step 8</p>
                        </div>
                        <div class="stepwizard-step">
                            <a href="#step-9" class="btn btn-default btn-circle">9</a>
                            <p>Step 9</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-2 hidden-xs"></div>
            <div class="col-md-2 hidden-xs"></div>
            <div class="col-md-8 col-xs-12">
                		
                    <div class="row setup-content" id="step-1">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                            <div class="col-md-12">
                            <form action="user-info" method="Post"  id="empFormID" name="empFormID" role="form" data-toggle="validator">
                                <h3> Employee Information</h3>
                                <div class="form-group">
                                    <label class="control-label">Name</label>
                                    <input type="text" required="required" name="userName" class="form-control" placeholder="Enter Name" value="${userInfo.userName }"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Employee Father's Name</label>
                                    <input type="text" required="required" name="fatherName" class="form-control" placeholder="Enter Father's Name" value="${userInfo.employeeFatherName }"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Designation</label>
                                    <input type="text" required="required" name="designation" class="form-control" placeholder="Enter Your Designation" value="${userInfo.designation }"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Date of Joining</label>
                                    <input type="date"  name="dateOfJoining" required="required" data-date-format="MM/DD/YYYY" class="form-control" value="${userInfo.dateOfJoining }"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Address</label>
                                    <textarea required="required"  name="address" class="form-control" placeholder="Enter your address">${userInfo.address}</textarea>
                                </div>
                                
                                 <!-- <input type="submit" class="btn btn-primary nextBtn pull-right" type="button" value="Next"> -->
                                <button class="btn btn-primary nextBtn pull-right" type="button" >Next</button>
                                </form>
                            </div>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                   
                    <div class="row setup-content" id="step-2">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	 <form action="personal-info" method="Post"  
										       id="empPersonalDetails" name="empPersonalDetails" role="form" data-toggle="validator">
                            <div class="col-md-12">
                                <h3> Personal Data Form</h3>
                                <div class="form-group">
                                    <label class="control-label">Full Name</label>
                                    <input type="text" name="userName" required="required" class="form-control" placeholder="Enter Company Name"  value="${userInfo.userPersonalDetails[0].userName}"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Date of Birth</label>
                                    <input type="date" name="dateOfBirth" required="required" class="form-control" value="${userInfo.userPersonalDetails[0].dateOfBirth}"/>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Weight</label>
                                        <input type="number" name="weight" required="required" min="0" class="form-control" placeholder="Enter Your Weight"  value="${userInfo.userPersonalDetails[0].weight}"/>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Height</label>
                                        <input type="number" name="hight" required="required" min="0"  class="form-control" placeholder="Enter Your Height"  value="${userInfo.userPersonalDetails[0].hight}"/>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Postal Address</label>
                                        <textarea required="required" name="postalAddress" class="form-control" placeholder="Enter your address">${userInfo.userPersonalDetails[0].postalAddress}</textarea>
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Permanent Address</label>
                                        <textarea required="required" name="permanentAddress" class="form-control" placeholder="Enter your address">${userInfo.userPersonalDetails[0].permanentAddress}</textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Contact</label>
                                    <input type="text" required="required" name="contact" class="form-control" placeholder="Enter Your Number" value="${userInfo.userPersonalDetails[0].contact}">
                                </div>
                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-3">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmFamilyDetails" id="frmFamilyDetails" action="family-details-info" method="post">
                            <div class="col-md-12">
                                <h3> Family Details</h3>
                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                            <th>Name</th>
                                            <th>Age</th>
                                            <th>Sex</th>
                                            <th>Relation</th>
                                            <th>Occupation</th>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[0].memberName" value="${userInfo.familyDetails[0].memberName}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[0].age" value="${userInfo.familyDetails[0].age}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[0].sex" value="${userInfo.familyDetails[0].sex}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[0].relation" value="${userInfo.familyDetails[0].relation}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[0].occupation" value="${userInfo.familyDetails[0].occupation}">
                                                    <input type="hidden" name="listFamilyModel[0].userFamilyDetailID" value="${userInfo.familyDetails[0].userFamilyDetailID}"/>
                                                </td>
                                            </tr>
<tr>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[1].memberName" value="${userInfo.familyDetails[1].memberName}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[1].age" value="${userInfo.familyDetails[1].age}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[1].sex" value="${userInfo.familyDetails[1].sex}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[1].relation" value="${userInfo.familyDetails[1].relation}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[1].occupation" value="${userInfo.familyDetails[1].occupation}">
                                                    <input type="hidden" name="listFamilyModel[1].userFamilyDetailID" value="${userInfo.familyDetails[1].userFamilyDetailID}"/>
                                                </td>
                                            </tr>
<tr>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[2].memberName" value="${userInfo.familyDetails[2].memberName}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[2].age" value="${userInfo.familyDetails[2].age}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[2].sex" value="${userInfo.familyDetails[2].sex}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[2].relation" value="${userInfo.familyDetails[2].relation}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[2].occupation" value="${userInfo.familyDetails[2].occupation}">
                                                    <input type="hidden" name="listFamilyModel[2].userFamilyDetailID" value="${userInfo.familyDetails[2].userFamilyDetailID}"/>
                                                </td>
                                            </tr>
<tr>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[3].memberName" value="${userInfo.familyDetails[3].memberName}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[3].age" value="${userInfo.familyDetails[3].age}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[3].sex" value="${userInfo.familyDetails[3].sex}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[3].relation" value="${userInfo.familyDetails[3].relation}">
                                                </td>
                                                <td>
                                                    <input type="text" class="form-control" name="listFamilyModel[3].occupation" value="${userInfo.familyDetails[3].occupation}">
                                                    <input type="hidden" name="listFamilyModel[3].userFamilyDetailID" value="${userInfo.familyDetails[3].userFamilyDetailID}"/>
                                                </td>
                                            </tr>
											
																					
                                        </tbody>
                                    </table>
                                </div>
                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-4">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmEduDetails" id="frmEduDetails" action="education-details-info" method="post">
                            <div class="col-md-12">
                                <h3> Education Qualification</h3>
                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                            <th>Qualification</th>
                                            <th>University</th>
                                            <th>Year of Passing</th>
                                            <th>Marks</th>
                                            <th>Major Subject</th>
                                        </thead>
                                        <tbody>
                                            <tr>
												<td>
													<input type="text" class="form-control" name="listEducationModel[0].qualification" value="${userInfo.educationQualificationDetail[0].qualification}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[0].university" value="${userInfo.educationQualificationDetail[0].university}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[0].yearOfPass" value="${userInfo.educationQualificationDetail[0].yearOfPass}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[0].marksInPercentage" value="${userInfo.educationQualificationDetail[0].marksInPercentage}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[0].majorSubject" value="${userInfo.educationQualificationDetail[0].majorSubject}">
													<input type="hidden" name="listEducationModel[0].userEducationDetailID" value="${userInfo.educationQualificationDetail[0].userEducationDetailID}"/>
													<input type="hidden" name="listEducationModel[0].userID" value="1"/>
												</td>
											</tr>
											<tr>
												<td>
													<input type="text" class="form-control" name="listEducationModel[1].qualification" value="${userInfo.educationQualificationDetail[1].qualification}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[1].university" value="${userInfo.educationQualificationDetail[1].university}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[1].yearOfPass" value="${userInfo.educationQualificationDetail[1].yearOfPass}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[1].marksInPercentage" value="${userInfo.educationQualificationDetail[1].marksInPercentage}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[1].majorSubject" value="${userInfo.educationQualificationDetail[1].majorSubject}">
													<input type="hidden" name="listEducationModel[1].userEducationDetailID" value="${userInfo.educationQualificationDetail[1].userEducationDetailID}"/>
													<input type="hidden" name="listEducationModel[1].userID" value="1"/>
												</td>
											</tr>
											<tr>
												<td>
													<input type="text" class="form-control" name="listEducationModel[2].qualification" value="${userInfo.educationQualificationDetail[2].qualification}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[2].university" value="${userInfo.educationQualificationDetail[2].university}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[2].yearOfPass" value="${userInfo.educationQualificationDetail[2].yearOfPass}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[2].marksInPercentage" value="${userInfo.educationQualificationDetail[2].marksInPercentage}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[2].majorSubject" value="${userInfo.educationQualificationDetail[2].majorSubject}">
													<input type="hidden" name="listEducationModel[2].userEducationDetailID" value="${userInfo.educationQualificationDetail[2].userEducationDetailID}"/>
													<input type="hidden" name="listEducationModel[2].userID" value="1"/>
												</td>
											</tr>
											<tr>
												<td>
													<input type="text" class="form-control" name="listEducationModel[3].qualification" value="${userInfo.educationQualificationDetail[3].qualification}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[3].university" value="${userInfo.educationQualificationDetail[3].university}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[3].yearOfPass" value="${userInfo.educationQualificationDetail[3].yearOfPass}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[3].marksInPercentage" value="${userInfo.educationQualificationDetail[3].marksInPercentage}">
												</td>
												<td>
													<input type="text" class="form-control" name="listEducationModel[3].majorSubject" value="${userInfo.educationQualificationDetail[3].majorSubject}">
													<input type="hidden" name="listEducationModel[3].userEducationDetailID" value="${userInfo.educationQualificationDetail[3].userEducationDetailID}"/>
													<input type="hidden" name="listEducationModel[3].userID" value="1"/>
												</td>
											</tr>
                                        </tbody>
                                    </table>
                                </div>


                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-5">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmExpDetails" id="frmExpDetails" action="experience-details-info" method="post">
                            <div class="col-md-12">
                                <h3> Experience</h3>

                                <div class="table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                            <th>Organization</th>
                                            <th>Period From</th>
                                            <th>Period To</th>
                                            <th>Designation Last Held</th>
                                            <th>Designation At Joining</th>
                                            <th>responsibilities</th>
                                            <th>Designation of Immediate Superior</th>
                                            <th>Gross Salary Drawn</th>
                                            <th>Reason For Leaving</th>
                                        </thead>
                                        <tbody>
                                           <tr>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].oganization" value="${userInfo.userExperienceDetail[0].oganization}">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[0].joinFrom" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[0].joinFrom}" />">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[0].joinTo" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[0].joinFrom}" />">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].designationStart" value="${userInfo.userExperienceDetail[0].designationStart}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].designationEnd" value="${userInfo.userExperienceDetail[0].designationEnd}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].jobResponsibility" value="${userInfo.userExperienceDetail[0].jobResponsibility}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].designationOfImmediateSuperior" value="${userInfo.userExperienceDetail[0].designationOfImmediateSuperior}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].grossSalaryDrawn" value="${userInfo.userExperienceDetail[0].grossSalaryDrawn}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[0].reasonForLeaving" value="${userInfo.userExperienceDetail[0].reasonForLeaving}">
		<input type="hidden" name="listExperienceModel[0].userExperianceDetailID" value="${userInfo.userExperienceDetail[0].userExperianceDetailID}"/>
		<input type="hidden" name="listExperienceModel[0].userID" value="1"/>
	</td>
</tr>
<tr>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].oganization" value="${userInfo.userExperienceDetail[1].oganization}">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[1].joinFrom" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[1].joinFrom}" />">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[1].joinTo" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[1].joinTo}" />">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].designationStart" value="${userInfo.userExperienceDetail[1].designationStart}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].designationEnd" value="${userInfo.userExperienceDetail[1].designationEnd}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].jobResponsibility" value="${userInfo.userExperienceDetail[1].jobResponsibility}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].designationOfImmediateSuperior" value="${userInfo.userExperienceDetail[1].designationOfImmediateSuperior}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].grossSalaryDrawn" value="${userInfo.userExperienceDetail[1].grossSalaryDrawn}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[1].reasonForLeaving" value="${userInfo.userExperienceDetail[1].reasonForLeaving}">
		<input type="hidden" name="listExperienceModel[1].userExperianceDetailID" value="${userInfo.userExperienceDetail[1].userExperianceDetailID}"/>
		<input type="hidden" name="listExperienceModel[1].userID" value="1"/>
	</td>
</tr>
<tr>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].oganization" value="${userInfo.userExperienceDetail[2].oganization}">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[2].joinFrom" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[2].joinFrom}" />">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[2].joinTo" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[2].joinTo}" />">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].designationStart" value="${userInfo.userExperienceDetail[2].designationStart}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].designationEnd" value="${userInfo.userExperienceDetail[2].designationEnd}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].jobResponsibility" value="${userInfo.userExperienceDetail[2].jobResponsibility}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].designationOfImmediateSuperior" value="${userInfo.userExperienceDetail[2].designationOfImmediateSuperior}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].grossSalaryDrawn" value="${userInfo.userExperienceDetail[2].grossSalaryDrawn}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[2].reasonForLeaving" value="${userInfo.userExperienceDetail[2].reasonForLeaving}">
		<input type="hidden" name="listExperienceModel[2].userExperianceDetailID" value="${userInfo.userExperienceDetail[2].userExperianceDetailID}"/>
		<input type="hidden" name="listExperienceModel[2].userID" value="1"/>
	</td>
</tr>
<tr>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].oganization" value="${userInfo.userExperienceDetail[3].oganization}">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[3].joinFrom" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[3].joinFrom}" />">
	</td>
	<td>
		<input type="date" class="form-control" name="listExperienceModel[3].joinTo" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${userInfo.userExperienceDetail[3].joinTo}" />">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].designationStart" value="${userInfo.userExperienceDetail[3].designationStart}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].designationEnd" value="${userInfo.userExperienceDetail[3].designationEnd}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].jobResponsibility" value="${userInfo.userExperienceDetail[3].jobResponsibility}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].designationOfImmediateSuperior" value="${userInfo.userExperienceDetail[3].designationOfImmediateSuperior}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].grossSalaryDrawn" value="${userInfo.userExperienceDetail[3].grossSalaryDrawn}">
	</td>
	<td>
		<input type="text" class="form-control" name="listExperienceModel[3].reasonForLeaving" value="${userInfo.userExperienceDetail[3].reasonForLeaving}">
		<input type="hidden" name="listExperienceModel[3].userExperianceDetailID" value="${userInfo.userExperienceDetail[3].userExperianceDetailID}"/>
		<input type="hidden" name="listExperienceModel[3].userID" value="1"/>
	</td>
</tr>

                                        </tbody>
                                    </table>
                                </div>


                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-6">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmpastcomp" id="frmpastcomp" action="past-position-details-info" method="post">
                        	<input type="hidden" name="userID" value="1"/>
                        	<input type="hidden" name="userLastCompanyDetailID" value="${userInfo.lastCompanyDetail[0].userLastCompanyDetailID}"/>
                            <div class="col-md-12">
                                <h3> Last Position Held</h3>
                                <h5>Reporting To:</h5>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Name</label>
                                        <input type="text" required="required" name="reportingName" class="form-control" value="${userInfo.lastCompanyDetail[0].reportingName}" placeholder="Enter Name">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Designation</label>
                                        <input type="text" required="required" name="designation" class="form-control" value="${userInfo.lastCompanyDetail[0].designation}" placeholder="Enter Designation">
                                    </div>
                                </div>
                                <div class="col-xs-12">
                                    <div class="form-group">
                                        <label class="control-label">Total Gross Salary</label>
                                        <input type="text" required="required" name="grossSalary" class="form-control" value="${userInfo.lastCompanyDetail[0].grossSalary}" placeholder="Enter Salary">
                                    </div>
                                </div>
                                <h5>Cash Benefits:</h5>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Basic</label>
                                        <input type="text" required="required" name="cashBasic" class="form-control" value="${userInfo.lastCompanyDetail[0].cashBasic}" placeholder="Enter Basic Amount">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">DA</label>
                                        <input type="text" required="required" name="cashDA" class="form-control" value="${userInfo.lastCompanyDetail[0].cashDA}" placeholder="Enter DA">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">HRA</label>
                                        <input type="text" required="required" name="cashHRA" class="form-control" value="${userInfo.lastCompanyDetail[0].cashHRA}" placeholder="Enter HRA">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">LTA</label>
                                        <input type="text" required="required"  name="cashLTA" class="form-control" value="${userInfo.lastCompanyDetail[0].cashLTA}" placeholder="Enter LTA">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Medical</label>
                                        <input type="text" required="required"  name="cashMedical" class="form-control" value="${userInfo.lastCompanyDetail[0].cashMedical}" placeholder="Enter Medical">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Conveyance</label>
                                        <input type="text" required="required" name="cashConveyance" class="form-control" value="${userInfo.lastCompanyDetail[0].cashConveyance}" placeholder="Enter Conveyance">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Other</label>
                                        <input type="text" required="required" name="cashOther" class="form-control" value="${userInfo.lastCompanyDetail[0].cashOther}" placeholder="Enter Other">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Total</label>
                                        <input type="text" required="required" name="cashTotal" class="form-control" value="${userInfo.lastCompanyDetail[0].cashTotal}" placeholder="Enter Total">
                                    </div>
                                </div>

                                <h5>Non Cash Benefits:</h5>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">PF</label>
                                        <input type="text" required="required" name="nonCashPF" class="form-control" value="${userInfo.lastCompanyDetail[0].nonCashPF}" placeholder="Enter PF">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">SF</label>
                                        <input type="text" required="required" name="nonCashSF" class="form-control" value="${userInfo.lastCompanyDetail[0].nonCashSF}" placeholder="Enter SF">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Gratuity</label>
                                        <input type="text" required="required" name="nonCashGratuity" class="form-control" value="${userInfo.lastCompanyDetail[0].nonCashGratuity}" placeholder="Enter Gratuity">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Other</label>
                                        <input type="text" required="required" name="nonCashOther" class="form-control" value="${userInfo.lastCompanyDetail[0].nonCashOther}" placeholder="Enter Other">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Total</label>
                                        <input type="text" required="required" name="nonCashTotal" class="form-control" value="${userInfo.lastCompanyDetail[0].nonCashTotal}" placeholder="Enter Total">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Reference Name - 1</label>
                                        <input type="text" required="required" name="referenceName1" class="form-control" value="${userInfo.lastCompanyDetail[0].referenceName1}" placeholder="Enter reference Details">
                                    </div>
                                </div>
                                <div class="col-xs-6">
                                    <div class="form-group">
                                        <label class="control-label">Reference Name - 2</label>
                                        <input type="text" required="required" name="referenceName2" class="form-control" value="${userInfo.lastCompanyDetail[0].referenceName2}" placeholder="Enter reference Details">
                                    </div>
                                </div>

                                <div class="col-xs-12">
                                    <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                    <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                                </div>

                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-7">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmAddInfo" id="frmAddInfo" action="reference-details-info" method="post">
                        	<input type="hidden" name="userID" value="1"/>
                        	<input type="hidden" name="userAdditionalDetailID" value="${userInfo.userAdditionalDetail[0].userAdditionalDetailID}"/>
                            <div class="col-md-12">
                                <h3> Additional Information</h3>
                                <div class="form-group">
                                    <label class="control-label">Language's Known</label>
                                    <input type="text" required="required" class="form-control" name="languageKnow" value="${userInfo.userAdditionalDetail[0].languageKnow}" placeholder="Enter Languages Known">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Your Hobbies</label>
                                    <input type="text" required="required" class="form-control" name="hobbies" value="${userInfo.userAdditionalDetail[0].hobbies}" placeholder="Enter Your Hobbies">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Your Interest's</label>
                                    <input type="text" required="required" class="form-control" name="interest" value="${userInfo.userAdditionalDetail[0].interest}" placeholder="Enter Your Interest's">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Are You Related to Any of Our Employees</label>
                                    <c:set var="isYchecked" value=""/>
                                    	<c:set var="isNchecked" value=""/>
                                    	<c:if test="${userInfo.userAdditionalDetail[0].employeeKnow eq 'Y'}">
                                    		<c:set var="isYchecked" value="checked='checked'"/>
                                    	</c:if>           
                                    	 <c:if test="${userInfo.userAdditionalDetail[0].employeeKnow eq 'N'}">
                                    		<c:set var="isNchecked" value="checked='checked'"/>
                                    	</c:if>
                                    <label class="radio-inline">                                    	                   
                                    	<input type="radio" ${isYchecked} name="employeeKnow" value="Y">Yes</label>                                        
                                    <label class="radio-inline">
                                        <input type="radio" ${isNchecked} name="employeeKnow" value="N">No</label>
                                    <label class="radio-inline">
                                        <input type="text" class="form-control" name="employeeName" value="${userInfo.userAdditionalDetail[0].employeeName}" placeholder="If Yes than Name">
                                    </label>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Membership of any Professional Institution/ Association</label>
                                    <input type="text" required="required" name="institutionMembership" value="${userInfo.userAdditionalDetail[0].institutionMembership}" class="form-control" placeholder="Enter Name">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Any Specialized Training/Training Program attended</label>
                                    <input type="text" required="required" name="specializedTraining" value="${userInfo.userAdditionalDetail[0].specializedTraining}" class="form-control" placeholder="Enter Name">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Any Other information/Suggestion</label>
                                    <input type="text" required="required" name="otherInfoSuggestion" value="${userInfo.userAdditionalDetail[0].otherInfoSuggestion}" class="form-control" placeholder="Enter Name">
                                </div>
                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                    <div class="row setup-content" id="step-8">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                        	<form name="frmEmergency" id="frmEmergency" action="emergency-details-info" method="post">
                        	<input type="hidden" name="userID" value="1"/>
                        	<input type="hidden" name="userEmergencyDetailID" value="${userInfo.userEmergencyDetail[0].userEmergencyDetailID}"/>
                            <div class="col-md-12">
                                <h3> Emergency Details</h3>
                                <div class="form-group">
                                    <label class="control-label">Blood Group</label>
                                    <input type="text" required="required" name="bloodGroup" class="form-control" value="${userInfo.userEmergencyDetail[0].bloodGroup}" placeholder="Enter Your Blood Group">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Allergic To</label>
                                    <input type="text" required="required" name="allergicTo" class="form-control" value="${userInfo.userEmergencyDetail[0].allergicTo}" placeholder="Enter Allergic To">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Blood Pressure</label>
                                    <input type="text" required="required" name="bloodPressure" class="form-control" value="${userInfo.userEmergencyDetail[0].bloodPressure}" placeholder="Enter Blood Pressure">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Eye Sight</label>

                                    <label class="radio-inline">
                                        <input type="text" class="form-control" name="eyeSightLeft" placeholder="Left Eye" value="${userInfo.userEmergencyDetail[0].eyeSightLeft}">
                                    </label>
                                    <label class="radio-inline">
                                        <input type="text" class="form-control" name="eyeSightRight" placeholder="Right Eye" value="${userInfo.userEmergencyDetail[0].eyeSightRight}">
                                    </label>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Any Major Illness</label>
                                    <textarea required="required" class="form-control" name="anyMajorIllness" placeholder="Enter Your Illness Details" value="">${userInfo.userEmergencyDetail[0].anyMajorIllness}</textarea>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Contact Person in case of Emergency</label>
                                    <input type="text" required="required" class="form-control" name="contactPersonInCaseOfEmergency" placeholder="Enter Contact Person Details" value="${userInfo.userEmergencyDetail[0].contactPersonInCaseOfEmergency}">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Address</label>
                                    <textarea required="required" class="form-control" name="emergencyAddress" placeholder="Enter Your Address">${userInfo.userEmergencyDetail[0].emergencyAddress}</textarea>
                                </div>
                                <button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                <button class="btn btn-primary nextBtn pull-right" type="button">Next</button>
                            </div>
                            </form>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>

                    <div class="row setup-content" id="step-9">
                        <div class="col-md-2 hidden-xs"></div>
                        <div class="col-md-offset-3 col-xs-12">
                            <div class="col-md-12">
                                <h3> Attachments</h3>
                                <h5>Please Attach:</h5>

                                <div class="form-group">
                                    <label class="control-label">Photocopies of all relevant certificates / degree mark sheets etc as zip</label>
                                    <input type="file" required="required" name="certificatesDoc">
                                </div>


                                <div class="form-group">
                                    <label class="control-label">Proof of Birth</label>
                                    <input type="file" required="required" name="birthCertificates">
                                </div>


                                <div class="form-group">
                                    <label class="control-label">Experience Certificate from Previous employer</label>
                                    <input type="file" required="required" name="experienceCertificates">
                                </div>

                                <div class="form-group">
                                    <label class="control-label">Relieving letter from previous employer</label>
                                    <input type="file" required="required" name="relievingLetter">
                                </div>

                                <div class="form-group">
                                    <label class="control-label">Photocopy of Passport</label>
                                    <input type="file" required="required" name="passportDocument">
                                </div>

                                <div class="form-group">
                                    <label class="control-label">PAN No</label>
                                    <input type="file" required="required" name="panCardDocument">
                                </div>

                                <h5>DECLARATION</h5>
                                <p><strong>
                                    I DECLARE THAT THE INFORMATION GIVEN, HEREIN ABOVE, IS TRUE & CORRECT TO THE BEST OF MY KNOWLEDGE & BELIEF & NOTHING MATERIAL HAS BEEN CONCEALED. I UNDERSTAND THAT THE ABOVE INFORMATION IN FOUND FALSE OR INCORRECT, AT ANY TIME DURING THE COURSE OF MY EMPLOYMENT, MY SERVICES WILL BE TERMINATED FORTHWITH WITHOUT ANY NOTICE OR COMPENSATION.                                    
                                    </strong></p>

                                <div class="col-xs-6">
                                    <p>Date
                                        <span><hr class="border-declaration"></span>
                                    </p>
                                </div>
                                <div class="col-xs-6">
                                    <p>Place
                                        <span><hr class="border-declaration"></span>
                                    </p>
                                </div>
                                <div class="col-xs-6">
                                    <p>Signature of Applicant
                                        <span><hr class="border-declaration"></span>
                                    </p>
                                </div>

                                <div class="col-xs-12">
                            		<button class="btn btn-primary prevBtn pull-left" type="button">Previous</button>
                                    <button class="btn btn-success pull-right" type="submit">Submit</button>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-2 hidden-xs"></div>
                    </div>
                
            </div>
            <div class="col-md-2 hidden-xs"></div>
            <!-- form steps ends -->

        </div>

    </div>
    <!-- main body ends -->

    <!-- /.container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="resources/js/jquery-2.2.4.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/jquery-ui.min.js"></script>
    <script src="resources/js/tutorial.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.9/validator.js"></script>
    <!-- form script -->
    <script>
        $(document).ready(function() {
            var navListItems = $('div.setup-panel div a'),
                allWells = $('.setup-content'),
                allNextBtn = $('.nextBtn'),
                allPrevBtn = $('.prevBtn');

            allWells.hide();

            navListItems.click(function(e) {
                e.preventDefault();
                var $target = $($(this).attr('href')),
                    $item = $(this);

                if (!$item.hasClass('disabled')) {
                    navListItems.removeClass('btn-primary').addClass('btn-default');
                    $item.addClass('btn-primary');
                    allWells.hide();
                    $target.show();
                    $target.find('input:eq(0)').focus();
                }
            });

            allPrevBtn.click(function() {
                var curStep = $(this).closest(".setup-content"),
                    curStepBtn = curStep.attr("id"),
                    prevStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().prev().children("a");

                prevStepWizard.removeAttr('disabled').trigger('click');
            });

            allNextBtn.click(function() {
            	console.log("index:"+$(this).index());
                var curStep = $(this).closest(".setup-content"),
                    curStepBtn = curStep.attr("id"),
                    nextStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().next().children("a"),
                    curInputs = curStep.find("input[type='text'],input[type='url']"),
                    isValid = true;
				//alert(curStepBtn);
                //$(".form-group").removeClass("has-error");
                for (var i = 0; i < curInputs.length; i++) {
                	console.log(curInputs[i]+":"+curInputs[i].validity.valid);
                    if (!curInputs[i].validity.valid) {
                        isValid = false;
                        $(curInputs[i]).closest(".form-group").addClass("has-error");
                    }
                }
                var form = $(this).closest("form");    
            	var formName = $(form).attr("id");
                if ($(form).validator('validate').has('.has-error').length === 0){
                	
                	
                	
                	//console.log($(form).validator('validate'))	;
                	var formData = form.serialize();        
                	//console.log(JSON.stringify(form.serializeArray()))
                	 $.ajax({
                         type: 'post',
                         url: form.attr("action"),
                         data:  formData,
                         contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                        // dataType: "json",
                        // accept:"json",
                         success: function (data) {
                        	// console.log("data");
                            // console.log(data);
                             nextStepWizard.removeAttr('disabled').trigger('click');
                             document.location.reload();
                         }
                     });   
                	
                }    
            });
 			$(".btn-circle:eq(${active})").trigger("click");
 			/*$.each(".btn-circle",function(key,value){
 				console.log(key);
 				console.log(value);
 			})*/
            //$('div.setup-panel div a.btn-primary').trigger('click');
            //$('div.setup-panel div a.btn-default:eq(2)').trigger('click');
        });
       // alert("${active}");
        $.fn.serializeObject = function() {
        	var o = {};
        	var a = this.serializeArray();
        	$.each(a, function() {
        		if (o[this.name]) {
        			if (!o[this.name].push) {
        				o[this.name] = [o[this.name]];
        			}
        			o[this.name].push(this.value || '');
        		} else {
        			o[this.name] = this.value || '';
        		}
        	});
        	return o;
        };

    </script>

	<%-- <script type="text/javascript">
			function signOutAjax() {	
				document.location.href="<%=request.getContextPath()%>/logout";
			}
	</script> --%>
</body>

</html>