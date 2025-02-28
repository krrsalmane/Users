<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Medical Portal</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        body {
            background-image: url('image/engin-akyurt-z9Bbk7o8MNU-unsplash.jpg');
            background-size: cover;
            background-position: center;
        }
    </style>
</head>
<body class="flex items-center justify-center h-screen bg-gray-900 bg-opacity-50">
<div class="bg-white bg-opacity-60 p-10 rounded-2xl shadow-2xl text-center max-w-md">
    <h1 class="text-3xl font-extra bold mb-6 text-gray-800">Welcome to the Medical Portal</h1>
    <p class="text-gray-700 mb-6 text-lg">Please select your role to continue:</p>

    <div class="flex flex-col gap-6">
        <form action="SignUp.jsp" method="post" class="flex flex-col gap-4">
            <button type="submit" class="w-full bg-blue-600 hover:bg-blue-700 text-white font-semibold py-3 px-6 rounded-lg shadow-md transition duration-300">I am a Patient</button>
        </form>
        <form action="doctorsignup.jsp">
            <button type="submit" class="w-full bg-green-600 hover:bg-green-700 text-white font-semibold py-3 px-6 rounded-lg shadow-md transition duration-300">I am a Doctor</button>
        </form>
    </div>
</div>
</body>
</html>
