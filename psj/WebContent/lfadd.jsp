<%@ page language="java"%>
<html>
<body>
<form method="post" action="lfadd.jsp">
enter  number:
<input type="te" name="t1">
<input type="submit" value="add"></form>
</body>
</html>
<%
String s=request.getParameter("t1");
int f=0,l;
if(s!=null)
{
	int n=Integer.parseInt(s);
	l=n%10;
	while(n!=0)
	{
		f=n%10;
		n=n/10;
	}
	out.print("<font color=red>additon="+(f+l));
	
}
else
	out.print("must enter number");
%>