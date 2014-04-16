
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Advertisement", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Advertisement {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.AdCart>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItemsFromCart", targetNamespace = "http://service/", className = "service.GetItemsFromCart")
    @ResponseWrapper(localName = "getItemsFromCartResponse", targetNamespace = "http://service/", className = "service.GetItemsFromCartResponse")
    public List<AdCart> getItemsFromCart(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeAdFrmCart", targetNamespace = "http://service/", className = "service.RemoveAdFrmCart")
    @ResponseWrapper(localName = "removeAdFrmCartResponse", targetNamespace = "http://service/", className = "service.RemoveAdFrmCartResponse")
    public void removeAdFrmCart(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<service.Advertisement_Type>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllAds", targetNamespace = "http://service/", className = "service.GetAllAds")
    @ResponseWrapper(localName = "getAllAdsResponse", targetNamespace = "http://service/", className = "service.GetAllAdsResponse")
    public List<Advertisement_Type> getAllAds();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addAdToCart", targetNamespace = "http://service/", className = "service.AddAdToCart")
    @ResponseWrapper(localName = "addAdToCartResponse", targetNamespace = "http://service/", className = "service.AddAdToCartResponse")
    public void addAdToCart(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "orderAd", targetNamespace = "http://service/", className = "service.OrderAd")
    @ResponseWrapper(localName = "orderAdResponse", targetNamespace = "http://service/", className = "service.OrderAdResponse")
    public void orderAd(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "postAd", targetNamespace = "http://service/", className = "service.PostAd")
    @ResponseWrapper(localName = "postAdResponse", targetNamespace = "http://service/", className = "service.PostAdResponse")
    public void postAd(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     */
    @WebMethod(operationName = "SignUp")
    @RequestWrapper(localName = "SignUp", targetNamespace = "http://service/", className = "service.SignUp")
    @ResponseWrapper(localName = "SignUpResponse", targetNamespace = "http://service/", className = "service.SignUpResponse")
    public void signUp(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

}
