<%-- 
    Document   : login
    Created on : Apr 8, 2023, 2:08:49 PM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>econ - Login</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>

        <div class="container-fluid">
            <div class="row justify-content-center">
                <div class="col-6 mt-5">
                    <h1 class="text-center">Admin Login</h1>
                    <form action="Test" method="post">
                        <div class="mb-3 mt-5">
                            <label class="form-label" name="email">Username</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="mb-5">
                            <label class="form-label" name="password">Password</label>
                            <input type="password" class="form-control">
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-success d-grid fw-bold">Login</button>
                        </div>
                        <div class="mt-3 text-center">
                            <a href="index.jsp" class="link-primary">Go Back</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
