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
	background-color: #ffcc00;
}

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
	background-color: blueviolet;
}
</style>
</head>
<body>
	<h3>Details</h3>
	<table>
		<tr>
			<th>Name <i class='bx bx-at'></i></th>
			<th>Email <i class='bx bx-envelope'></i></th>
			<th>Phone Number <i class='bx bx-phone'></i></th>
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
			<td>
				<form action="DemoServ" method="post">
					<input type="hidden" name="action" value="update"> <input
						type="hidden" name="id" value="<%=formData.getId()%>"> <input
						type="text" name="name" value="<%=formData.getName()%>">
			</td>
			<td><input type="text" name="email"
				value="<%=formData.getEmail()%>"></td>
			<td><input type="text" name="phonenumber"
				value="<%=formData.getPhonenumber()%>"></td>
			<td>
				<button type="submit" class="update-button">Update</button>
				</form>
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
