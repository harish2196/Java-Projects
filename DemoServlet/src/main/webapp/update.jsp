<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #7197aa;
        background-repeat: no-repeat;
        background-size: cover;
    
    }
.container {
    width: 50%; 
    margin: 0 auto; 
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

h2 {
    text-align: center;
}

label {
    display: block;
    font-weight: bold;
}

input[type="text"],
input[type="number"] {
    width: 95%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
}

input[type="submit"] {
    width: 100%;
    padding: 10px;
    border: none;
    border-radius: 5px;
    background-color: #007bff; 
    color: #fff;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #0056b3; 
}

.btn {
    display: inline-block;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    background-color: #007bff; 
    color: #fff;
    text-align: center;
    text-decoration: none;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

.btn:hover {
    background-color: #0056b3; 
}

</style>
</head>
<body>

<div class="container">
    <form action="DemoServ" method="post">
        <h2>UPDATE</h2>
        <input type="hidden" name="id" value="<%= request.getParameter("id") %>">
        
        <label for="name">Name</label>
        <input type="text" id="name" placeholder="Your name" name="name"  required>            
        
        <br><br>
        <label for="email">Email</label>
        <input type="text" id="mobileNumber" name="email" placeholder="Enter email"  required>     
      
        <br><br>
        <label for="number">Phone Number:</label>
        <input type="number" id="location" placeholder="Enter PhoneNumber" name="phonenumber"  required>
        
        <br><br>
         <input type="hidden" name="action" value="update">
         <input type="hidden" name="id" value= "<%= request.getParameter("id")%>">
         <button type="submit" class="btn"> Update</button>
    </form>
</div>

</body>
</html>
