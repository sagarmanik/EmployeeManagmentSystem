<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Register Employee</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .register-container {
            background-color: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        h2 {
            text-align: center;
            color: #2c3e50;
            margin-bottom: 30px;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        form:label {
            margin-top: 10px;
            margin-bottom: 5px;
            font-weight: bold;
            color: #34495e;
        }

        input[type="text"],
        input[type="password"],
        input[type="date"] {
            padding: 10px;
            border-radius: 6px;
            border: 1px solid #ccc;
            font-size: 16px;
            width: 100%;
            margin-bottom: 15px;
        }

        input[type="submit"] {
            background-color: #3498db;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            margin-bottom: 15px;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        .login-link {
            display: block;
            text-align: center;
            padding: 12px;
            background-color: #2ecc71;
            color: white;
            text-decoration: none;
            border-radius: 6px;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        .login-link:hover {
            background-color: #27ae60;
        }
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Employee Registration</h2>

        <form:form action="${pageContext.request.contextPath}/register" method="POST" modelAttribute="employee">

            <form:label path="name">Name:</form:label>
            <form:input path="name" />

            <form:label path="dob">Date of Birth:</form:label>
            <form:input path="dob" />

            <form:label path="gender">Gender:</form:label>
            <form:input path="gender" />

            <form:label path="address">Address:</form:label>
            <form:input path="address" />

            <form:label path="city">City:</form:label>
            <form:input path="city" />

            <form:label path="state">State:</form:label>
            <form:input path="state" />

            <form:label path="loginId">Login ID:</form:label>
            <form:input path="loginId" />

            <form:label path="password">Password:</form:label>
            <form:password path="password" />

            <input type="submit" value="Register" />
        </form:form>

        <a href="${pageContext.request.contextPath}/login" class="login-link">Already Registered? Login Here</a>
    </div>
</body>
</html>