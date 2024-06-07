<%@page import="com.chainsys.demo.User"%>
<%@page import="com.chainsys.demo.QueryManager"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
    <h1>Employee Details</h1>
    <form action="LeaveCount" method="get">
        <table>
            <tr>
                <th>Employee Code</th>
                <th>Name</th>
                <th>From Date</th>
                <th>To Date</th>
                <th>Leave_Type</th>
                <th>Leave_count</th>
              <th>Status</th>
              <th>Buttons</th>
            </tr>
            <% 
            ArrayList<User> userList = (ArrayList<User>) request.getAttribute("userList");
            
            if (userList == null || userList.isEmpty()) { 
            %>
                <tr>
                    <td colspan="7">No user found for the provided employee code.</td>
                </tr>
            <% } else { 
                for (User user : userList) {
            %>
                <tr>
                    <td><%= user.getEmpCode() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getFromDate() %></td>
                    <td><%= user.getToDate() %></td>
                    <td><%= user.getLeaveType() %></td>
                    <td><%= user.getTotal_days() %></td>
                    <td><%= user.getStatus() %>
                      <td name="status">
    <form action="LeaveCount" method="get">
        <input type="hidden" name="action" value="Accepted">
        <button type="submit">Accept</button>
    </form>
    <form action="LeaveCount" method="get">
        <input type="hidden" name="action" value="Rejected">
        <button type="submit">Reject</button>
    </form>
</td>
                </tr>
            <% 
                }
            } 
            %>
        </table>
        <input type="submit" value="Submit">
    </form>
      <script>
        function acceptRequest(acceptButton) {
            var rejectButton = acceptButton.nextElementSibling;
            rejectButton.style.display = 'none';
            acceptButton.disabled = true;
          
        }

        function rejectRequest(rejectButton) {
            var acceptButton = rejectButton.previousElementSibling;
            acceptButton.style.display = 'none';
            rejectButton.disabled = true;
            
        }
    </script>
</body>
</html>
