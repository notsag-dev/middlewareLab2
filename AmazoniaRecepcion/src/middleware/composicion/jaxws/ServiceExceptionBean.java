
package middleware.composicion.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.4
 * Sun Nov 15 22:16:03 UYST 2015
 * Generated source version: 3.1.4
 */

@XmlRootElement(name = "ServiceException", namespace = "http://rpc.xml.javax/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceException", namespace = "http://rpc.xml.javax/", propOrder = {"linkedCause", "message"})

public class ServiceExceptionBean {

    private java.lang.Throwable linkedCause;
    private java.lang.String message;

    public java.lang.Throwable getLinkedCause() {
        return this.linkedCause;
    }

    public void setLinkedCause(java.lang.Throwable newLinkedCause)  {
        this.linkedCause = newLinkedCause;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}

