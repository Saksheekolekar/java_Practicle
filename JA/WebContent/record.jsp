<%@ page import="java.sql.*" %>

<%
String driver = "org.postgresql.Driver";
String url = "jdbc:postgresql://localhost/sakshi";
String username = "postgres";
String password = "root";

Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
// Get the form data

String fname = (String)session.getAttribute("fname");
String lname =(String)session.getAttribute("lname");
String street =(String)session.getAttribute("s");
String address = (String)session.getAttribute("a");
String city =(String)session.getAttribute("c");
String state = (String)session.getAttribute("state");
String email = (String)session.getAttribute("e");
String phone = (String)session.getAttribute("p");

try {
  // Connect to the database
    Class.forName(driver);
    conn = DriverManager.getConnection(url, username, password);

    // Insert the data into the database
    String sql = "INSERT INTO customers (fname, lname, s, a, c,state,e,p) VALUES (?,?,?, ?, ?, ?, ?,?)";
    pstmt = conn.prepareStatement(sql);
    pstmt.setString(1, fname);
    pstmt.setString(2, lname);
    pstmt.setString(3, street);
    pstmt.setString(4, address);
    pstmt.setString(5, city);
    pstmt.setString(6, state);
    pstmt.setString(7, email);
    pstmt.setString(8, phone);
     int k=pstmt.executeUpdate();
if(k>=1)
{
    
    response.sendRedirect("customer.jsp");
}
    
} catch (Exception e) {
    out.println("<h2>Error adding product: " + e.getMessage() + "</h2>");
} finally {
    try { if (rs != null) rs.close(); } catch (SQLException e) { /* ignored */ }
    try { if (pstmt != null) pstmt.close(); } catch (SQLException e) { /* ignored */ }
    try { if (conn != null) conn.close(); } catch (SQLException e) { /* ignored */ }

}

%>
