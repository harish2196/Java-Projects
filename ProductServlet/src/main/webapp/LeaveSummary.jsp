<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Leave Summary</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .leave-form {
            max-width: 300px;
            margin: 50px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .leave-form p {
            margin: 0 0 10px;
        }
        .leave-form input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .leave-form input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="leave-form">
        <form action="LeaveCount" method="post">
            <p>Total Leave Days: <%= request.getAttribute("totalLeaveDays") %></p>
            <input type="submit" value="View">
        </form>
    </div>
</body>
</html>
