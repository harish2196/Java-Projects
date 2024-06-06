<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.chainsys.demo.User"%>
<%@page import="com.chainsys.demo.QueryManager"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Permission Details</title>
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
        .dropdown-container {
            position: absolute;
            top: 20px;
            right: 20px;
        }
    </style>
</head>
<body>
    <h1>User Permission Details</h1>
    <form action="PermissionManager" method="get">
        <div class="dropdown-container">
            <select id="statusDropdown" onchange="changeStatus()">
                <option value="None">None</option>
                <option value="Permission">Permission</option>
                <option value="Leave">Leave</option>
            </select>
        </div>
        <table>
            <tr>
                <th>Name</th>
                <th>Date</th>
                <th>Start Time</th>
                <th>End Time</th>
                <th>Status</th>
                <th>Permission Count</th>
                <th>Actions</th>
            </tr>
            <% 
            ArrayList<User> permissionCountList = (ArrayList<User>) request.getAttribute("permissionCountList");
            if (permissionCountList != null && !permissionCountList.isEmpty()) { 
                for (User user : permissionCountList) {
            %>
                <tr>
                    <td><%= user.getName() %></td>
                    <td><%= user.getDate() %></td>
                    <td><%= user.getStart_time() %></td>
                    <td><%= user.getEnd_time() %></td>
                    <td><%= user.getStatus() %></td>
                    <td><%= user.getPermission() %></td>
                    <td>
                        <button onclick="acceptRequest(this)">Accept</button>
                        <button onclick="rejectRequest(this)">Reject</button>
                    </td>
                </tr>
            <% 
                }
            } else { 
            %>
                <tr>
                    <td colspan="7">No permission data found.</td>
                </tr>
            <% } %>
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

        function changeStatus() {
            var dropdown = document.getElementById("statusDropdown");
            var selectedValue = dropdown.value;

            // Perform operations based on the selected value
            switch (selectedValue) {
                case "None":
                    // Perform operations for "None" option
                    break;
                case "Permission":
                    // Perform operations for "Permission" option
                    break;
                case "Leave":
                    // Perform operations for "Leave" option
                    break;
                default:
                    // Default case
                    break;
            }
        }
    </script>
</body>
</html>
