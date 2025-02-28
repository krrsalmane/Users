<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Login</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background-image: url('image/engin-akyurt-_HN4ZNgXH5w-unsplash.jpg');
            background-size: cover;
            background-position: center;
        }
    </style>
</head>
<body class="flex items-center justify-center h-screen bg-gray-900 bg-opacity-50">
<div class="bg-white bg-opacity-60 p-10 rounded-2xl shadow-2xl text-center max-w-md">
    <h1 class="text-3xl font-extrabold mb-6 text-gray-800">Patient Login</h1>
    <p class="text-gray-700 mb-6 text-lg">Sign in or create an account</p>

    <form action="login" method="POST" class="flex flex-col gap-4">
        <input type="email" name="email" placeholder="Email" required class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="password" name="password" placeholder="Password" required class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <button type="submit" class="bg-blue-600 hover:bg-blue-700 text-white font-semibold py-3 px-6 rounded-lg shadow-md transition duration-300">Login</button>
    </form>

    <p class="mt-4 text-gray-600">Don't have an account? <a href="signup.jsp" class="text-blue-500 hover:underline">Sign up</a></p>
</div>
</body>
</html>
