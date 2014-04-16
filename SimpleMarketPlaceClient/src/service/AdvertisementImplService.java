
package service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdvertisementImplService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8081/SimpleMarketPlace/services/Advertisement?wsdl")
public class AdvertisementImplService
    extends Service
{

    private final static URL ADVERTISEMENTIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(service.AdvertisementImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = service.AdvertisementImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8081/SimpleMarketPlace/services/Advertisement?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8081/SimpleMarketPlace/services/Advertisement?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ADVERTISEMENTIMPLSERVICE_WSDL_LOCATION = url;
    }

    public AdvertisementImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdvertisementImplService() {
        super(ADVERTISEMENTIMPLSERVICE_WSDL_LOCATION, new QName("http://service/", "AdvertisementImplService"));
    }

    /**
     * 
     * @return
     *     returns Advertisement
     */
    @WebEndpoint(name = "AdvertisementImplPort")
    public Advertisement getAdvertisementImplPort() {
        return super.getPort(new QName("http://service/", "AdvertisementImplPort"), Advertisement.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Advertisement
     */
    @WebEndpoint(name = "AdvertisementImplPort")
    public Advertisement getAdvertisementImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "AdvertisementImplPort"), Advertisement.class, features);
    }

}
