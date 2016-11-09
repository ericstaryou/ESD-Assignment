<%-- 
    Document   : index
    Created on : Nov 1, 2016, 1:13:18 PM
    Author     : BobbyAP
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Dashboard</title>
    </head>
    <body>
        <h1>This is expected to serve as a proper Web  Page</h1>
        <form method="POST" action="UserService.do">
        <p />
            View a table <br />
            <input type="radio" name="tbl" value="Outstanding">Check Outstanding Balance<br />
            <input type="radio" name="tbl" value="Payment">Make Payment<br />
            <input type="radio" name="tbl" value="Submitclaim">Submit-A-Claim<br /> 
            <input type="radio" name="tbl" value="List">List Claims-Payments<br />
            <input type=submit value="Action"> <br />
        </form> 
    </body>
</html>
