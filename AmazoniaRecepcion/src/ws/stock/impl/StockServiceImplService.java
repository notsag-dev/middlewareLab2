package ws.stock.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2015-11-14T15:04:34.799-02:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "StockServiceImplService", 
                  wsdlLocation = "http://localhost:8080/AmazoniaStockService/services/stockservice?wsdl",
                  targetNamespace = "http://impl.stock.ws/") 
public class StockServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.stock.ws/", "StockServiceImplService");
    public final static QName StockServiceImplPort = new QName("http://impl.stock.ws/", "StockServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/AmazoniaStockService/services/stockservice?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(StockServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/AmazoniaStockService/services/stockservice?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public StockServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public StockServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StockServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public StockServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public StockServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public StockServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns StockServiceApi
     */
    @WebEndpoint(name = "StockServiceImplPort")
    public StockServiceApi getStockServiceImplPort() {
        return super.getPort(StockServiceImplPort, StockServiceApi.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StockServiceApi
     */
    @WebEndpoint(name = "StockServiceImplPort")
    public StockServiceApi getStockServiceImplPort(WebServiceFeature... features) {
        return super.getPort(StockServiceImplPort, StockServiceApi.class, features);
    }

}
