import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class set2b extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get client information
        String remoteAddr = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");
        
        // Get server information
        ServletContext context = getServletContext();
        String osName = System.getProperty("os.name");
        Enumeration<String> servletNames = context.getServletNames();
        
        // Display client and server information
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request Information</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Client Information:</h1>");
        out.println("<p>IP Address: " + remoteAddr + "</p>");
        out.println("<p>User Agent: " + userAgent + "</p>");
        out.println("<h1>Server Information:</h1>");
        out.println("<p>Operating System: " + osName + "</p>");
        out.println("<p>Loaded Servlets:</p>");
        out.println("<ul>");
        while (servletNames.hasMoreElements()) {
            out.println("<li>" + servletNames.nextElement() + "</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
