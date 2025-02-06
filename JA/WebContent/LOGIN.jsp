<!DOCTYPE html>
  <%@ page import="java.sql.*" %> 
 <%@ page import="java.io.*" %> 
 <%@ page session="true" %> 
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="LOGIN.jsp" method="post">
        <input type="text" id="loginId" name="loginId" placeholder="login id"required><br><br>
        <input type="password" id="password" name="password" placeholder=" password"required><br><br> 
        <input type="submit" value="Login">
    </form>
</body>
</html>
<%

response.setContentType("text/html");

ResultSet rs=null;
String li = request.getParameter("loginId");
String password = request.getParameter("password");
if(li!=null && password!=null)
{
 try {
	 Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/sakshi","postgres","root");
    PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
    ps.setString(1, li);
    ps.setString(2, password);
    
    rs = ps.executeQuery();
    
    
    if (rs.next())
    {
        out.println("<html><body>");
        out.println("<h2>Login successful!</h2>");
        out.println("</body></html>");
        response.sendRedirect("customer.jsp");
    }
    else 
    {
        out.println("<html><body>");
        out.println("<h2>Login failed. Invalid Loginid or password.</h2>");
        out.println("</body></html>");
    }
} catch (Exception e)
 {
    e.printStackTrace();
 }
}
%>