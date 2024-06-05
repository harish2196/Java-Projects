<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Permission Form</title>
    <style>
        body {
            margin: 0%;
            padding: 0;
            background-image: url("images/a20.png");
            background-size: 50% 100%;
            background-repeat: no-repeat;
            width: 100%;
            height: 93.7vh; 
        }

        .form-container {
            background-color: white;
            padding: 20px;   
            margin-left: 35%;
            margin-top: 3%;
            border: none;
            border-radius: 10px;
            box-shadow: 10px 20px 15px rgba(12, 10, 10, 0.1);
            width: 300px;
        }

        .form-container label {
            margin-bottom: 20px;
        }

        .form-container input[type="text"],
        .form-container input[type="date"],
        .form-container input[type="time"],
        .form-container textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 20px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        .form-container input[type="submit"] {
            background-color:  rgb(59, 43, 230);
            color: white;
            padding: 10px 20px;
            border: none;
            width: 100%;
            text-align: center;
            border-radius: 5px;
            cursor: pointer;
        }

        .form-container input[type="submit"]:hover {
            background-color: darkolivegreen;
        }
    </style>
</head>
<body>
    <div class="photo">
        <div class="form-container">
            <form action="PermissionManager" method="post" onsubmit="return validateTimes()">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>

                <label for="date">Date:</label>
                <input type="date" id="date" name="date" required>
                
                <label for="start_time">Start Time:</label>
                <input type="time" id="start_time" name="start_time" required>

                <label for="end_time">End Time:</label>
                <input type="time" id="end_time" name="end_time" required>

                <label for="reason">Reason:</label>
                <textarea id="reason" name="reason" rows="4" required></textarea>
    
                <input type="submit" value="Submit">
                
            </form>
    

    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
    <script>
        function validateTimes() {
            const startTime = document.getElementById('start_time').value;
            const endTime = document.getElementById('end_time').value;

            const start = new Date(`1970-01-01T${startTime}:00`);
            const end = new Date(`1970-01-01T${endTime}:00`);

            const diff = end - start;
            const twoHours = 2 * 60 * 60 * 1000;

            if (diff > twoHours) {
                swal("Error", "End time must be no more than two hours greater than start time.", "error");
                return false; 
            }

            return true; 
        }
    </script>
</body>
</html>
