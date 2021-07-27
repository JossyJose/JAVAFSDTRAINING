package Servlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
@WebFilter(
    filterName="DisplayInitParam",
    urlPatterns={"/Srvlt3","/HelloWorld"},
    initParams={
    @WebInitParam(name="FilterParam1",value="FilterParamValue1"),
    @WebInitParam(name="FilterParam2",value="FilterParamValue2")
    }
)
public class Srvlt3 implements Filter {
    private FilterConfig filterConfig=null;
   
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter  initialized...");
        this.filterConfig = filterConfig;
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
FilterChain filterChain) throws IOException, ServletException
 {
        Enumeration<String> initParams= filterConfig.getInitParameterNames();
        StringBuffer buffer = new StringBuffer();
        while(initParams.hasMoreElements())
        {
            String initParamName = initParams.nextElement();
            String initParamValue =filterConfig.getInitParameter(initParamName);
            buffer.append(initParamName+"::" + initParamValue);
            buffer.append(" <br/> ") ;
        }   
        PrintWriter writer = response.getWriter();
        writer.println(buffer.toString());
    }
    @Override
    public void destroy() {
        System.out.println("Filter  Destroyed..");
    }
}