<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Doctor Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background-image: url('image/engin-akyurt-_HN4ZNgXH5w-unsplash.jpg');
            background-size: cover;
            background-position: center;
        }
    </style>
</head>
<body class="flex items-center justify-center min-h-screen bg-gray-900 bg-opacity-50">
<div class="bg-white bg-opacity-60 p-10 rounded-2xl shadow-2xl text-center max-w-md">
    <h1 class="text-3xl font-extra bold mb-6 text-gray-800">Doctor Dashboard</h1>
    <p class="text-gray-700 mb-6 text-lg">Welcome, Dr. ${sessionScope.doctorName}</p>

    <div class="flex flex-col gap-6">

        <a href="logout" class="block bg-red-600 hover:bg-red-700 text-white font-semibold py-3 px-6 rounded-lg shadow-md transition duration-300">Log out</a>
    </div>
</div>
</body>
</html>
