<%-- 
    Document   : department
    Created on : Apr 8, 2023, 11:46:27 PM
    Author     : Thilini
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.webapp.entity.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.webapp.ejb.DepartmentSessionBeanRemote"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>econ - Department</title>
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
                            <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-left: 710px;">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                    <li class="nav-item">
                                        <a class="nav-link hov fw-bold" href="home.jsp">Home</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="worker.jsp">Workers</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="manager.jsp">Managers</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov text-primary fw-bold" href="department.jsp">Department</a>
                                    </li>
                                    <li class="nav-item ms-3">
                                        <a class="nav-link hov fw-bold" href="index.jsp">Log Out</a>
                                    </li>

                                </ul>

                            </div>
                        </div>
                    </nav>
                </div>

                <div class="col-12 mt-5 text-center">
                    <h1>Register Department</h1>
                </div>

                <div class="col-12 mt-3">
                    <div class="row justify-content-center">
                        <div class="col-4">
                            <div class="row">
                                <form action="/registerDepartment" method="post">
                                <div class="col-12 mt-3">
                                    <input type="text" class="form-control" placeholder="Name" aria-label="Name" name="name">
                                </div>
                                <div class="col-12 mt-5 d-grid">
                                    <button type="submit" class="btn btn-success fw-bold" style="border-radius: 20px;">Register</button>
                                </div>
                                    </form>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-12 text-center" style="margin-top: 100px;">
                    <h1>Department Details</h1>
                </div>

                <div class="col-12 mt-5">
                    <div class="row justify-content-center">

                        <div class="col-6">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Search here......." aria-label="Search here......." aria-describedby="button-addon2">
                                <button class="btn btn-outline-success fw-bold" type="button" id="button-addon2">Search</button>
                            </div>
                        </div>

                        <div class="col-10 mt-5">
                            <table class="table table-success table-striped">
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                </tr>
                                   <%
                                    try {
                            InitialContext ic = new InitialContext();
                            DepartmentSessionBeanRemote dep = (DepartmentSessionBeanRemote) ic.lookup("com.webapp.ejb.DepartmentSessionBeanRemote");
                            List<Department> departments = dep.getAllDepartment();
                            pageContext.setAttribute("departments", departments);
                                   %>
                                <tr>
                                    <c:forEach var="departments" items="${departments}">
                                    <td>${departments.id}</td>
                                    <td>${departments.name}</td>
                                    </c:forEach>
                                    </tr>
                                     <%
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    %>
                                
                            </table>
                        </div>

                    </div>
                </div>

            </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
