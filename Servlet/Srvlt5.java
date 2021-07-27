package Servlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(
    name="Srvlt5",
    description="Servlet with Annotation",
    urlPatterns={"/Srvlt5"}
    )
public class Srvlt5 extends HttpServlet{

protected void doGet(HttpServletRequest request, HttpServletResponse response)    throws ServletException, IOException
 {
        HttpSession session = request.getSession();
        String attributeName="SessionAttribute";
        String attributeValue="Initial Value";
        session.setAttribute(attributeName, attributeValue);
        attributeValue="New Value";
        session.setAttribute(attributeName, attributeValue);
        session.removeAttribute(attributeName);
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
{
        doGet(req, resp);
}
}