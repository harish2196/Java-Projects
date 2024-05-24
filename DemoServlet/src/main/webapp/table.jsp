<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.chainsys.servlet.FormData"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<style>
body {
	padding: 20px;
	margin: 15px;
	background-color: burlywood;
}

table {
	width: 100%;
	margin-top:4%;
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
	background-color: gray;
}

.delete-form {
	display: inline;
}

.delete-button {
	background-color: #ff5c5c;
	color: white;
	border: none;
	padding: 8px 16px;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s;
}

.delete-button:hover {
	background-color: rgb(255, 173, 228);
}

.delete-btn {
	background-color: rgb(42, 165, 95);
	color: white;
	border: none;
	padding: 8px 16px;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s;
}

.delete-btn:hover {
	background-color: brown;
}

input[type="text"], input[type="submit"] {
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	background-color:transparent;
	margin-right: 10px;
	transition: all 0.3s ease;
}

input[type="text"]:focus, input[type="submit"]:hover {
	border-color: dodgerblue;
	box-shadow: 0 0 5px rgba(0, 0, 255, 0.3);
}

input[type="submit"] {
	background-color: dodgerblue;
	color: #fff;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
	background-color: #007bff;
}
</style>
</head>
<body>
	<h3>Details</h3>
	<form action="SearchData" method="post">
		<input type="text" name="name" placeholder="Search name"> 
		<input type="submit" value="Search">

	</form>
	<table>
		<tr>
			<th>Name <i class='bx bx-at'></i></th>
			<th>Email <i class='bx bx-envelope'></i></th>
			<th>Phone Number <i class='bx bx-phone'></i></th>
			<th></th>
			<th></th>
		</tr>
		<%
		ArrayList<FormData> formList = (ArrayList<FormData>) request.getAttribute("allFormDataList");
		for (FormData formData : formList) {
		%>
		<tr>
			<td><%=formData.getName()%></td>
			<td><%=formData.getEmail()%></td>
			<td><%=formData.getPhonenumber()%></td>
			<td>
				<form action="DemoServ" method="post">
					<input type="hidden" name="action" value="delete"> <input
						type="hidden" name="id" value="<%=formData.getId()%>">
					<button type="submit" class="delete-button">Delete</button>
				</form>
			</td>
			<td><input type="hidden" name="action" value="edit"> <input
				type="hidden" name="id" value="<%=formData.getId()%>">
				<button type="submit" class="delete-btn"
					onclick="location.href='update.jsp?id=<%=formData.getId() %>'">Update</button>
			</td>

		</tr>

		<%
		}
		%>
	</table>

	<div class="submit">
		<a href="http://localhost:8080/DemoServlet/">Add More</a>
	</div>
</body>
</html>
