<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Sign Up</title>
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
    <h1 class="text-3xl font-extra bold mb-6 text-gray-800">Patient Sign Up</h1>
    <p class="text-gray-700 mb-6 text-lg">Create your account</p>

    <form action="SignUp" method="POST" class="flex flex-col gap-4">
        <input type="text" name="fullName" placeholder="Full Name" required class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="email" name="email" placeholder="Email" required class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="password" name="password" placeholder="Password" required class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="text" id="phoneNumber" name="phoneNumber" placeholder="Phone Number" class="p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="text" id="specialization" name="specialization" placeholder="Specialization" class="mt-1 p-3 border border-gray-300 rounded-lg w-full focus:outline-none focus:ring-2 focus:ring-blue-500">
        <input type="text" id="role" name="role" placeholder="Role" class="mt-1 p-3 border border-gray-300 rounded-lg w-full focus:outline-none focus:ring-2 focus:ring-blue-500">
        <button type="submit" class="bg-green-600 hover:bg-green-700 text-white font-semibold py-3 px-6 rounded-lg shadow-md transition duration-300">Sign Up</button>
    </form>

    <p class="mt-4 text-gray-600">Already have an account? <a href="patient-login.jsp" class="text-blue-500 hover:underline">Login</a></p>
</div>
</body>
</html>
