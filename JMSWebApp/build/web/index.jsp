<%-- 
    Document   : index
    Created on : Mar 11, 2023, 1:24:10 AM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Messaging services</h1>
        <form action="SendQueueMessage" method="POST">
            Message:<input type="text" name="message"/>
            <input type="submit" value="send"/>
        </form>
    </body>
</html>
