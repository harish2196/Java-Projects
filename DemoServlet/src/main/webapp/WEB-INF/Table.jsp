<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chainsys.servlet.FormData" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Form Data</title>
    <style>
       table {
            width: 100%;
            border-collapse: collapse;
        }

        th {
            background-color: firebrick;
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        td {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
 .delete-button {
            background-color: #ff5c5c; 
            color: white; 
            border: none; 
            padding: 10px 20px; 
            text-align: center; 
            text-decoration: none; 
            display: inline-block;
            font-size: 16px;
            border-radius: 5px; 
            cursor: pointer; 
            transition: background-color 0.3s; 
        }

    </style>
</head>
<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
           
        </tr>
        <% 
      
        ArrayList<FormData> formList = (ArrayList<FormData>) request.getAttribute("formData");
        
        for (FormData formData : formList) { 
        %>
            <tr>
                <td><%= formData.getName() %></td>
                <td><%= formData.getEmail() %></td>
                <td><%= formData.getPhonenumber() %></td>
               
                <td>
                 <form action="DemoServ" method="post">
                    <input type="hidden" name="name" value="<%= formData.getName() %>">
                    <input type="hidden" name="email" value="<%= formData.getEmail() %>">
                     <input type="hidden" name="email" value="<%= formData.getPhonenumber() %>">
             
                </td>
            </tr>
        <% } %>
    </table>
    <div class="submit">
        <a href="http://localhost:8080/DemoServlet/">Add More</a>
    </div>
</body>
</html>