<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Employee List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }

        .welcome-message {
            font-size: 20px;
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 20px;
        }

        h2 {
            color: #2c3e50;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #2980b9;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e1f5fe;
        }
    </style>
</head>
<body>

<div class="welcome-message"> Welcome to the EmployeSystem ${username}</div>

<h2>Registered Employees</h2>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>DOB</th>
            <th>Gender</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="emp" items="${employees}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.dob}</td>
                <td>${emp.gender}</td>
                <td>${emp.address}</td>
                <td>${emp.city}</td>
                <td>${emp.state}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
