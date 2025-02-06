
 <%@ page import="java.sql.*" %> 
 <%@ page import="java.io.*" %> 
 <%@ page session="true" %> 
<html>
<head>
	<title>Customer Details</title>
	<style type="text/css">
		table {
			border-collapse: collapse;
			width: 80%;
			margin: 20px auto;
		}

		th, td {
			border: 1px solid #ddd;
			padding: 10px;
			text-align: left;
		}

		th {
			background-color: #f2f2f2;
			font-weight: bold;
		}

		button {
			background-color: #007bff;
			color: #fff;
			border: none;
			padding: 10px 20px;
			border-radius: 3px;
			cursor: pointer;
			transition: background-color 0.3s ease;
		}

		button:hover {
			background-color: #0056b3;
		}
	</style>
</head>
<body>
    <h2>Customer List</h2>
    <button onclick="location.href='addcustomer.jsp'">Add Customer</button>
    <br><br>
 <%
 response.setContentType("text/html");
 	try 
 	{
 		Class.forName("org.postgresql.Driver");
 		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
 		Statement st=con.createStatement();
 		ResultSet r=st.executeQuery("select * from customers");
 		out.println("<table border=2>");
 		out.println("<tr><th>First name<th>Last name<th>street<th>Address<th>City<th>State<th>Email<th>Phone<th>Action</tr>");
 		while(r.next())
 		{
 			
 			out.println("<tr>");
 			out.println("<td>"+r.getString(2));
 			out.println("<td>"+r.getString(3));
 			out.println("<td>"+r.getString(4));
 			out.println("<td>"+r.getString(5));
 			out.println("<td>"+r.getString(6));
 			out.println("<td>"+r.getString(7));
 			out.println("<td>"+r.getString(8));
 			out.println("<td>"+r.getString(9));
 			out.println("<td>");
 			out.println("<button>"+"edit");
 			out.println("</button>");
            out.println("<button>"+"delete");
 			out.println("</button>");
 			out.println("</tr>");
 		}
 		out.println("</table>");
 	} catch (Exception e)
 	{
 		out.println("error="+e);
 	}
 	
 %>
    <script>
        function deleteRow(button) {
            var row = button.parentNode.parentNode;
            row.parentNode.removeChild(row);
        }
        
        function updateRow(button) {
            var row = button.parentNode.parentNode;
            // Implement update logic here
            // You could show a form or prompt for editing and update the row's content
        }
    </script>
</body>
</html>
