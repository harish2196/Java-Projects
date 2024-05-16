<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chainsys.servlet.FormData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
<style>
body{
margin:0;
padding:0;
background-color:#a1517c;
}
    table {
        border-collapse: collapse;
        width: 100%;
    }

   th, td {
    border: 1px solid #dddddd;
    padding: 8px;
    text-align: center;
}

th {
    background-color: #f2f2f2;
}

tr:nth-child(even) {
    background-color: #f9f9f9; 
}

tr:hover {
    background-color: #f5f5f5;
}
.submit {
    margin-top: 20px; 
}

.submit a {
    display: inline-block;
    padding: 10px 20px;
    background-color: #4CAF50;
    color: white;
    text-decoration: none;
    border-radius: 5px;
    transition: background-color 0.3s;
}

.submit a:hover {
    background-color: #45a049; 
}

</style>
</head>
<body>
    <% ArrayList<FormData> formList = (ArrayList<FormData>) request.getAttribute("formList"); %>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>DOB</th>
            <th>Password</th>
        </tr>
        <% for (FormData formData : formList) { %>
            <tr>
                <td><%= formData.getName() %></td>
                <td><%= formData.getEmail() %></td>
                <td><%= formData.getDob() %></td>
                <td><%= formData.getPassword() %></td>
            </tr>
        <% } %>
    </table>
       <div class="submit">
          <a href="http://localhost:8080/DemoServlet/">Add More</a>
        </div>
</body>
</html>
