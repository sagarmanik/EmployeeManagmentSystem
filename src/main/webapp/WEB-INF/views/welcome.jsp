<%@ page session="false" %>
<html>
<head>
    <title>Welcome</title>
    <meta http-equiv="refresh" content="2;URL=${pageContext.request.contextPath}/employee" />
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f5f7fa;
        }

        .welcome-container {
            text-align: center;
        }

        h2 {
            color: #2c3e50;
        }
    </style>
</head>
<body>
    <div class="welcome-container">
        <h2>Welcome, ${username}!</h2>
        <p>Redirecting to Employee List...</p>
    </div>
</body>
</html>
