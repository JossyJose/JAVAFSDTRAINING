package Servlt;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
@WebListener
public class Srvlt4 implements HttpSessionAttributeListener {
/**
 * Default constructor. 
 */
public Srvlt4() 
{
}

public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
    System.out.println("Attribute has been added");
    String attributeName = httpSessionBindingEvent.getName();
    Object attributeValue = httpSessionBindingEvent.getValue();
    System.out.println("Attribute Name ::" + attributeName);
    System.out.println("Attribute Value ::" + attributeValue.toString());
}
public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent)
 {
        System.out.println("Attribute has been Removed");
        String attributeName = httpSessionBindingEvent.getName();
        Object attributeValue = httpSessionBindingEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());
}
public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) 
{
        System.out.println("Attribute has been Replaced");
        String attributeName = httpSessionBindingEvent.getName();
        Object attributeValue = httpSessionBindingEvent.getValue();
        System.out.println("Attribute Name ::" + attributeName);
        System.out.println("Attribute Value ::" + attributeValue.toString());       
}                                                                                   
}