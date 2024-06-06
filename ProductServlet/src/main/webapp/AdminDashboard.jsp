<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            display: flex;
            height: 100vh;
        }

        .sidebar {
            width: 250px;
            background: linear-gradient(180deg, #6ab04c, #badc58);
            color: white;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px 0;
        }

        .sidebar img {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            margin-bottom: 20px;
        }

        .sidebar h2 {
            margin-bottom: 40px;
        }

        .sidebar nav ul {
            list-style: none;
            padding: 0;
            width: 100%;
        }

        .sidebar nav ul li {
            width: 100%;
        }

        .sidebar nav ul li a {
            text-decoration: none;
            color: white;
            padding: 15px;
            display: flex;
            align-items: center;
            justify-content: center;
            border-radius: 10px;
            margin: 5px 0;
            transition: background 0.3s;
        }

        .sidebar nav ul li a:hover {
            background: rgba(0, 0, 0, 0.1);
        }

        .sidebar nav ul li a i {
            margin-right: 10px;
        }

        .main-content {
            flex: 1;
            padding: 20px;
            background-color: #f1f2f6;
        }

        .header {
            display: flex;
            justify-content: flex-end;
            align-items: center;
            margin-bottom: 20px;
        }

        .header img {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            margin-right: 10px;
        }

        .header span {
            font-size: 18px;
        }

        .cards {
            display: flex;
            justify-content: space-between;
        }

        .card {
            background: linear-gradient(180deg, #6ab04c, #ccf05d);
            width: 25%;
            padding: 20px;
            border-radius: 10px;
            margin-top: 5%;
            color: white;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s;
        }

        .card:hover {
            transform: translateY(-5px);
        }

        .card i {
            font-size: 40px;
            margin-bottom: 10px;
        }

        .card h3 {
            margin: 10px 0;
        }
    </style>
</head>
<body>
    <div class="sidebar">
        <img src="images/a5.avif" alt="User">
        <h2>Admin</h2>
        <nav>
            <ul>
                <li><a href="#"><i class="fas fa-home"></i> Dashboard</a></li>
                <li><a href="#"><i class="fas fa-user"></i> Profile</a></li>
                <li><a href="switch.jsp"><i class="fas fa-envelope"></i> Messages</a></li>
                <li><a href="#"><i class="fas fa-cogs"></i> Settings</a></li>
                <li><a href="#"><i class="fas fa-sign-out-alt"></i> Logout</a></li>
            </ul>
        </nav>
    </div>
    <div class="main-content">
        <div class="header">
            <img src="images/a5.avif" alt="User">
            <span>Welcome back, Admin</span>
        </div>
        <div class="cards">
            <div class="card">
                <i class="fas fa-cube"></i>
                <h3>View Employee Details</h3>
                <p>5</p>
            </div>
            <div class="card">
                <i class="fas fa-users"></i>
                <h3>Update Employee Details</h3>
                <p>3</p>
            </div>
            <div class="card">
                <i class="fas fa-book"></i>
                <h3>Payroll</h3>
                <p>5</p>
            </div>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
</body>
</html>
