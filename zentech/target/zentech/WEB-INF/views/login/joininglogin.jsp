<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Payment</title>

    <!-- Bootstrap -->
     
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/jquery-ui.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/jquery-ui.structure.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/aos.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-background">

    <div class="container">
        <div class="row login-form-position">
            <div class="col-md-4 col-sm-4 hidden-xs"></div>
            <div class="col-md-4 col-sm-4 col-xs-12" data-aos="zoom-in">
                <div align="center" class="logo-background">
                    <img src="resources/images/logo.png" class="img-responsive" alt="Zentech Logo" width="110">
                </div>
                <form class="form-background">
                    <div class="form-group">
                        <label><i class="fa fa-user"></i> User ID</label>
                        <input type="text" class="form-control" placeholder="Enter your User ID" required>
                    </div>

                    <div class="form-group">
                        <label><i class="fa fa-users"></i> Role</label>
                        <select class="form-control">
                            <option>Lorem</option>
                            <option>Lorem</option>
                            <option>Lorem</option>
                            <option>Lorem</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label><i class="fa fa-lock"></i> Password</label>
                        <input type="password" class="form-control" placeholder="Enter your Password" required>
                    </div>

                    <a href="./index" class="btn btn-success" style="width: 100%">Proceed</a>
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="">Remember Me</label>
                    </div>
                    <div class="text-center">
                        <a href="#" title="Recover Password">Forgot Password ?</a>
                    </div>

                </form>
            </div>
            <div class="col-md-4 col-sm-4 hidden-xs"></div>
        </div>
    </div>




    <!-- /.container -->


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="resources/js/jquery-2.2.4.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/aos.js"></script>
    <script src="resources/js/jquery-ui.min.js"></script>
    <script>
        AOS.init();

    </script>
</body>

</html>
