<%-- 
    Document   : Home
    Created on : Apr 8, 2023, 2:55:46 PM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>econ - Home</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <nav class="navbar navbar-expand-lg bg-body-tertiary">
                        <div class="container-fluid">
                            <a class="navbar-brand text-success fs-2 fw-bold" href="#">econ</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-left: 730px;">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                    <li class="nav-item">
                                        <a class="nav-link hov text-primary fw-bold" href="home.jsp">Home</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="worker.jsp">Workers</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="manager.jsp">Managers</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="department.jsp">Department</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="index.jsp">Log Out</a>
                                    </li>

                                </ul>

                            </div>
                        </div>
                    </nav>
                </div>
                <!--                <div class="col-12" style="background-image: url('images/t-shirts-shop.jpg'); background-size: cover; background-repeat: no-repeat;">
                                    
                                </div>-->
            </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
