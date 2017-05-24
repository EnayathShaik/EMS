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
      <!-- Bootstrap styles -->
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<!-- Generic page styles -->
	<link rel="stylesheet" href="/resources/css/style.css">
	<!-- blueimp Gallery styles -->
	<link rel="stylesheet" href="//blueimp.github.io/Gallery/css/blueimp-gallery.min.css">
	<!-- CSS to style the file input field as button and adjust the Bootstrap progress bars -->
	<link rel="stylesheet" href="/resources/css/jquery.fileupload.css">
	<link rel="stylesheet" href="/resources/css/jquery.fileupload-ui.css">
	<!-- CSS adjustments for browsers with JavaScript disabled -->
	<link rel="stylesheet" href="/resources/css/jquery.fileupload-noscript.css">
	<link rel="stylesheet" href="/resources/css/jquery.fileupload-ui-noscript.css">
	<style>
	/* Hide Angular JS elements before initializing */
	.ng-cloak {
    display: none;
	}
	</style>
   </head>
   <body>
	<div class="page-container list-menu-view">
		<div class="page-wrap">
			<!--Leftbar Start Here -->
			<div class="left-aside desktop-view">
				<div class="aside-branding profile_bg"
					style="height: auto; padding: 12px; background-color: #2C7BA9;">
					<a href="index.html" class="large-logo"
						style="text-decoration: none;"> <img
						src="resources/images/avatar/profilepics.jpg" alt="My Profile"
						style="width: 50px; height: 50px; border-radius: 100%;">
						<div style="margin-top: 10px; color: #fff;">Raju Singh</div>
						<div style="color: #fff;">raju.singh@gmail.com</div>
					</a> <span class="aside-pin waves-effect"><i
						class="fa fa-thumb-tack"></i></span> <span
						class="aside-close waves-effect"><i class="fa fa-times"></i></span>
				</div>
				<div class="left-navigation">
					<ul class="list-accordion">
						<li><a href="#" class="waves-effect active"><span
								class="nav-icon"><i class="fa fa-home"></i></span><span
								class="nav-label">My Account</span> </a>
							<ul>
								<li><a href="#">View profile</a></li>
								<li><a href="#">Settings</a></li>
							</ul>
					</ul>
				</div>
			</div>
			<div class="page-content">
				<!--Topbar Start Here -->
				<header class="top-bar s3-fixed-header forum-header pad_t10"
					style="min-height: 42px;">


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
					<div class="forum-container" style="margin: 0;">
						<div class="forum-list">


							<div class="forum-list">
								<ul class="nav nav-tabs">
									<li class="active"><a
										href="<c:url value="/org-newjoining"/>">Home</a></li>
									<li><a href="<c:url value="/family-details-info"/>">Family
											Details</a></li>
									<li><a href="<c:url value="/education-details-info"/>">Education
											Qualification</a></li>
									<li><a href="<c:url value="/experience-details-info"/>">Experience</a></li>
									<li><a href="<c:url value="/reference-details-info"/>">Reference
											and Other Details</a></li>
									<li><a href="<c:url value="/emergency-details-info"/>">Emergency
											Details</a></li>
									<li><a href="<c:url value="/attachments-details-info"/>">Attachments</a></li>
								</ul>
							</div>
							<div class="col-md-12">



								<form id="fileupload" action="//jquery-file-upload.appspot.com/"
									method="POST" enctype="multipart/form-data" data-ng-app="demo"
									data-ng-controller="DemoFileUploadController"
									data-file-upload="options"
									data-ng-class="{'fileupload-processing': processing() || loadingFiles}">
									<!-- Redirect browsers with JavaScript disabled to the origin page -->
									<noscript>
										<input type="hidden" name="redirect"
											value="https://blueimp.github.io/jQuery-File-Upload/">
									</noscript>
									<!-- The fileupload-buttonbar contains buttons to add/delete files and start/cancel the upload -->
									<div class="row fileupload-buttonbar">
										<div class="col-lg-7">
											<!-- The fileinput-button span is used to style the file input field as button -->
											<span class="btn btn-success fileinput-button"
												data-ng-class="{disabled: disabled}"> <i
												class="glyphicon glyphicon-plus"></i> <span>Add
													files...</span> <input type="file" name="files[]" multiple
												data-ng-disabled="disabled">
											</span>
											<button type="button" class="btn btn-primary start"
												data-ng-click="submit()">
												<i class="glyphicon glyphicon-upload"></i> <span>Start
													upload</span>
											</button>
											<button type="button" class="btn btn-warning cancel"
												data-ng-click="cancel()">
												<i class="glyphicon glyphicon-ban-circle"></i> <span>Cancel
													upload</span>
											</button>
											<!-- The global file processing state -->
											<span class="fileupload-process"></span>
										</div>
										<!-- The global progress state -->
										<div class="col-lg-5 fade" data-ng-class="{in: active()}">
											<!-- The global progress bar -->
											<div class="progress progress-striped active"
												data-file-upload-progress="progress()">
												<div class="progress-bar progress-bar-success"
													data-ng-style="{width: num + '%'}"></div>
											</div>
											<!-- The extended global progress state -->
											<div class="progress-extended">&nbsp;</div>
										</div>
									</div>
									<!-- The table listing the files available for upload/download -->
									<table class="table table-striped files ng-cloak">
										<tr data-ng-repeat="file in queue"
											data-ng-class="{'processing': file.$processing()}">
											<td data-ng-switch data-on="!!file.thumbnailUrl">
												<div class="preview" data-ng-switch-when="true">
													<a data-ng-href="{{file.url}}" title="{{file.name}}"
														download="{{file.name}}" data-gallery><img
														data-ng-src="{{file.thumbnailUrl}}" alt=""></a>
												</div>
												<div class="preview" data-ng-switch-default
													data-file-upload-preview="file"></div>
											</td>
											<td>
												<p class="name" data-ng-switch data-on="!!file.url">
													<span data-ng-switch-when="true" data-ng-switch
														data-on="!!file.thumbnailUrl"> <a
														data-ng-switch-when="true" data-ng-href="{{file.url}}"
														title="{{file.name}}" download="{{file.name}}"
														data-gallery>{{file.name}}</a> <a data-ng-switch-default
														data-ng-href="{{file.url}}" title="{{file.name}}"
														download="{{file.name}}">{{file.name}}</a>
													</span> <span data-ng-switch-default>{{file.name}}</span>
												</p> <strong data-ng-show="file.error" class="error text-danger">{{file.error}}</strong>
											</td>
											<td>
												<p class="size">{{file.size | formatFileSize}}</p>
												<div class="progress progress-striped active fade"
													data-ng-class="{pending: 'in'}[file.$state()]"
													data-file-upload-progress="file.$progress()">
													<div class="progress-bar progress-bar-success"
														data-ng-style="{width: num + '%'}"></div>
												</div>
											</td>
											<td>
												<button type="button" class="btn btn-primary start"
													data-ng-click="file.$submit()"
													data-ng-hide="!file.$submit || options.autoUpload"
													data-ng-disabled="file.$state() == 'pending' || file.$state() == 'rejected'">
													<i class="glyphicon glyphicon-upload"></i> <span>Start</span>
												</button>
												<button type="button" class="btn btn-warning cancel"
													data-ng-click="file.$cancel()" data-ng-hide="!file.$cancel">
													<i class="glyphicon glyphicon-ban-circle"></i> <span>Cancel</span>
												</button>
												<button data-ng-controller="FileDestroyController"
													type="button" class="btn btn-danger destroy"
													data-ng-click="file.$destroy()"
													data-ng-hide="!file.$destroy">
													<i class="glyphicon glyphicon-trash"></i> <span>Delete</span>
												</button>
											</td>
										</tr>
									</table>
								</form>
								<br>
								<div class="panel panel-default">
									<div class="panel-heading">
										<h3 class="panel-title">Notes :</h3>
									</div>
									<div class="panel-body">
										<ul>
											<li><strong>The maximum file size for uploads
													in this is 999 KB.</li>
											<li>Only image files (<strong>JPG, GIF, PNG</strong>)
												are allowed.
											</li>
											<li>You can <strong>drag &amp; drop</strong> files from
												your desktop on this webpage.
											</li>
										</ul>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>



	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	 <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
      <!-- The jQuery UI widget factory, can be omitted if jQuery UI is already included -->
     <script src="resources/js/vendor/jquery.ui.widget.js"></script>
	<!-- The Load Image plugin is included for the preview images and image resizing functionality -->
	<script src="//blueimp.github.io/JavaScript-Load-Image/js/load-image.all.min.js"></script>
	<!-- The Canvas to Blob plugin is included for image resizing functionality -->
	<script src="//blueimp.github.io/JavaScript-Canvas-to-Blob/js/canvas-to-blob.min.js"></script>
	<!-- blueimp Gallery script -->
	<script src="//blueimp.github.io/Gallery/js/jquery.blueimp-gallery.min.js"></script>
	<!-- The Iframe Transport is required for browsers without support for XHR file uploads -->
	<script src="resources/js/jquery.iframe-transport.js"></script>
	<!-- The basic File Upload plugin -->
	<script src="resources/js/jquery.fileupload.js"></script>
	<!-- The File Upload processing plugin -->
	<script src="resources/js/jquery.fileupload-process.js"></script>
	<!-- The File Upload image preview & resize plugin -->
	<script src="resources/js/jquery.fileupload-image.js"></script>
	<!-- The File Upload audio preview plugin -->
	<script src="resources/js/jquery.fileupload-audio.js"></script>
	<!-- The File Upload video preview plugin -->
	<script src="resources/js/jquery.fileupload-video.js"></script>
	<!-- The File Upload validation plugin -->
	<script src="resources/js/jquery.fileupload-validate.js"></script>
	<!-- The File Upload Angular JS module -->
	<script src="resources/js/jquery.fileupload-angular.js"></script>
	<!-- The main application script -->
	<script src="resources/js/app.js"></script>
	 
      <script src='resources/js/general.js'></script>
      <!------------ Drag And Drop --------------->
      <script src='resources/js/dragdrop.js'></script>
      <script src='resources/js/dragdrop.min.js'></script>
      
      
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