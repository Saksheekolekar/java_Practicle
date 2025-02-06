<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home Screen</title>
    <style>
        * {
            box-sizing: border-box;
        }
        
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }
        
        header {
            background-color: #666699;
            color: #fff;
           
			
			padding: 20px;
			text-align: center;
        }
        
       h1 {
            margin: 0;
            font-size: 36px;
            text-transform: uppercase;
            letter-spacing: 4px;
            text-shadow: 2px 2px #555;
            align-items: center;
        }
        
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: calc(100vh - 150px);
            position: relative;
            background-image: url("44.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
        
        .image-container {
            position: relative;
            width: 100%;
            height: 500px;
            overflow: hidden;
        }
        
      
        
        .button-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            margin-top: 50px;
            opacity: 0.8;
        }
        
        .button {
            display: block;
            width: 200px;
            height: 100px;
            margin-bottom: 20px;
            font-size: 24px;
            font-weight: bold;
            color:#33001a;  
            background-color:  #e6f3ff;
            border: 2px solid #555;
            border-radius: 10px;
            cursor: pointer;
            transition: background-color 0.3s ease-in-out;
        }
        
        .button:hover {
            background-color: #555;
        }
        
        footer {
            background-color:#29293d;
            color:white;
            padding: 10px;
            text-align: center;
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <h1>ONLINE PRODUCT EXCHANGE SYSTEM(olpx)</h1>
    </header>
    <div class="container">
        <div class="button-container">
           
            <button class="button" onclick="window.location.href = 'alogin.jsp';">User Registration</button>
				<button class="button" onclick="window.location.href = 'register.jsp';">User Login</button>
				<button class="button" onclick="window.location.href = 'login.jsp';">Admin Login</button>
				<button class="button" onclick="window.location.href = 'about.jsp';">About US</button>
        </div>
    </div>
    <footer>
        <p></p>
    </footer>
</body>
</html>
