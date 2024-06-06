<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>

body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    padding: 20px;
}

.form-container {
    max-width: 400px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.dropdown-container {
    position: relative;
}


select {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #f9f9f9;
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    cursor: pointer;
}


button {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}


button:hover {
    background-color: #0056b3;
}


select::-ms-expand {
    display: none;
}

</style>

		<form action="Permission" method="post">
			<div class="dropdown-container">
			<input type="hidden" name="action" value="thisorthat" >
            <select name="options" >
                <option value="None">None</option>
                <option value="permission" >Permission</option>
                <option value="Leave" >Leave</option>
            </select>
            <button >ok</button>
        </div>
			
		</form>


</body>
</html>