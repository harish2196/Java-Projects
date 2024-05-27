 <%
 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
 response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
 response.setHeader("Expires", "0"); // Proxies.
if(session.getAttribute("uname")==null){
 response.sendRedirect("login.jsp");	
}
%> 


<!DOCTYPE html>
<html>
<head>
    <title>Simple Form</title>
</head>
<style>
.button {
  display: inline-block;
  padding: 10px 20px;
  background-color: #007bff;
  color: #fff; 
  text-decoration: none; 
  border: none; 
  border-radius: 5px; 
  cursor: pointer; 
}

.button:hover {
  background-color: #0056b3; 
}

</style>
<body>
    <h2>Simple Form Example</h2>
    <form action="submitForm.jsp" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email"><br><br>
        <input type="submit" value="Submit">
    </form>
    
   <button type="button" class="btn btn-dark" onclick="window.location.href='http://localhost:8080/ProductServlet/login.jsp'">Log out</button>
     
</body>
</html>
