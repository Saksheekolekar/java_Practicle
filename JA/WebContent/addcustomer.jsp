<!DOCTYPE html>
<html>
<head>
    <title>Add Customer</title>
</head>
<body>
    <h2>Add Customer</h2>
    <form action="addcustomer.jsp" method="post">
        
        <input type="text" id="firstName" name="firstName"placeholder="first name" required>
        <input type="text" id="lastName" name="lastName"placeholder="last name" required><br><br>
   
        <input type="text" id="street" name="street"placeholder="street">
        <input type="text" id="address" name="address"placeholder="address"><br><br>
        

        <input type="text" id="city" name="city"placeholder="city">
        <input type="text" id="state" name="state"placeholder="state"><br><br>
        
        <input type="email" id="email" name="email"placeholder="email">
        <input type="tel" id="phone" name="phone"placeholder="Phone"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
<%
		// Get the product information from the form
		String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String s = request.getParameter("street");
		String a = request.getParameter("address");
		String c = request.getParameter("city");
		String e = request.getParameter("email");
		String state = request.getParameter("state");
		String p = request.getParameter("phone");
		if(fname!=null && lname!=null && s!=null && a!=null && c!=null && state!=null
				&& e!=null && p!=null)
		{
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		session.setAttribute("s", s);
		session.setAttribute("a", a);
		session.setAttribute("c", c);
		session.setAttribute("e", e);
		session.setAttribute("state", state);
		session.setAttribute("p", p);
		
		 response.sendRedirect("record.jsp");
		}
	%>
</html>
