<%
if(session.getAttribute("name")==null){
 response.sendRedirect("login.jsp");	
}
%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Form</title>
</head>
<body>
    <h2>Simple Form Example</h2>
    <form action="submitForm.jsp" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
