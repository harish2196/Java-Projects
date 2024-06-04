<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Leave Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 0;
            margin: 0;
            height: 100vh;
            background-image: url("images/a18.avif");
            background-size: cover;
            
        }
        .leave-form {
            background-color: lightgray;
            padding: 20px;
            border-radius: 8px;
            border: none;  
            box-shadow: 0 0 18px rgba(11, 0, 0, 0.1);
             width: 700px;
            margin-left: 55%;
        }
        .leave-form h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        .leave-form label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }
        .leave-form input[type="text"], .leave-form input[type="date"], .leave-form select, .leave-form textarea {
            width: 100%;
            padding:7.5px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            transition: border-color 0.3s, box-shadow 0.3s;
        }
        .leave-form input[type="text"]:hover, .leave-form input[type="date"]:hover, .leave-form select:hover, .leave-form textarea:hover {
            border-color: #007BFF;
            box-shadow: 0 0 8px rgba(0, 123, 255, 0.3);
        }
        .leave-form input[type="text"]:focus, .leave-form input[type="date"]:focus, .leave-form select:focus, .leave-form textarea:focus {
            border-color: #007BFF;
            box-shadow: 0 0 8px rgba(0, 123, 255, 0.3);
            outline: none;
        }
        .leave-form button {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            border: none;
            border-radius: 4px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s, box-shadow 0.3s;
        }
        .leave-form button:hover {
            background-color: #0056b3;
            box-shadow: 0 4px 8px rgba(0, 123, 255, 0.3);
        }
    </style>
</head>
<body>
    <form class="leave-form" action="EmployeeLeave" method="post" onsubmit="return validateDates()">
        <h2>Leave Application</h2>
       <!--  <label for="empId">Employee ID</label>
        <input type="text" id="empId" name="empId" required> -->
        
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>
        
        <label for="fromDate">From Date</label>
        <input type="date" id="fromDate" name="fromDate" required>
        
        <label for="toDate">To Date</label>
        <input type="date" id="toDate" name="toDate" required>
        
        <label for="leaveType">Leave Type</label>
        <select id="leaveType" name="leaveType" required>
            <option value="sick">Medical Leave</option>
            <option value="casual">Casual Leave</option>           
        </select>
        
        <label for="reason">Reason</label>
        <textarea id="reason" name="reason" rows="4" required></textarea>
        
        <button type="submit">Submit</button>
    </form>
    <script>
        function validateDates() {
            var fromDate = document.getElementById("fromDate").value;
            var toDate = document.getElementById("toDate").value;

            if (toDate <= fromDate) {
                alert("To date must be greater than From date");
                return false;
            }

            return true;
        }
    </script>
</body>
</html>
