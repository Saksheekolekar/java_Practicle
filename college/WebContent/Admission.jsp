<%@page import="com.sun.xml.internal.rngom.ast.builder.Include"%>
<%@ include file="header.jsp"  %>
<%@ include file="menu.jsp"  %>
    <table border="1" width="100%" height="60%" bgcolor="cyan">
       <tr>
          <td width="20%">
             Login <br>
             User:
             <input type="text">
             
             <td width="80%"> Admission Form<br>
     <form method="post" action="Admission1.jsp">
        Name:
         <input type="text" name="t1"> <br>
        Marks:
         <input type="text" name="t2"> <br>
        userName:
         <input type="text" name="t3"> <br>
        password:
         <input type="text" name="t4"> <br>
        <input type="submit" value="Submit"> 
         
     </form>
            
              
       </tr>
    </table>
<%@ include file="footer.jsp"  %>
 