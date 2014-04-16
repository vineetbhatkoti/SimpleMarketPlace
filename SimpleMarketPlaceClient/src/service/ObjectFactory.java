
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveAdFrmCart_QNAME = new QName("http://service/", "removeAdFrmCart");
    private final static QName _GetAllAdsResponse_QNAME = new QName("http://service/", "getAllAdsResponse");
    private final static QName _OrderAd_QNAME = new QName("http://service/", "orderAd");
    private final static QName _PostAdResponse_QNAME = new QName("http://service/", "postAdResponse");
    private final static QName _GetItemsFromCartResponse_QNAME = new QName("http://service/", "getItemsFromCartResponse");
    private final static QName _SignUp_QNAME = new QName("http://service/", "SignUp");
    private final static QName _OrderAdResponse_QNAME = new QName("http://service/", "orderAdResponse");
    private final static QName _RemoveAdFrmCartResponse_QNAME = new QName("http://service/", "removeAdFrmCartResponse");
    private final static QName _PostAd_QNAME = new QName("http://service/", "postAd");
    private final static QName _AddAdToCartResponse_QNAME = new QName("http://service/", "addAdToCartResponse");
    private final static QName _GetItemsFromCart_QNAME = new QName("http://service/", "getItemsFromCart");
    private final static QName _SignUpResponse_QNAME = new QName("http://service/", "SignUpResponse");
    private final static QName _GetAllAds_QNAME = new QName("http://service/", "getAllAds");
    private final static QName _AddAdToCart_QNAME = new QName("http://service/", "addAdToCart");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAdToCart }
     * 
     */
    public AddAdToCart createAddAdToCart() {
        return new AddAdToCart();
    }

    /**
     * Create an instance of {@link PostAdResponse }
     * 
     */
    public PostAdResponse createPostAdResponse() {
        return new PostAdResponse();
    }

    /**
     * Create an instance of {@link SignUpResponse }
     * 
     */
    public SignUpResponse createSignUpResponse() {
        return new SignUpResponse();
    }

    /**
     * Create an instance of {@link GetItemsFromCart }
     * 
     */
    public GetItemsFromCart createGetItemsFromCart() {
        return new GetItemsFromCart();
    }

    /**
     * Create an instance of {@link GetItemsFromCartResponse }
     * 
     */
    public GetItemsFromCartResponse createGetItemsFromCartResponse() {
        return new GetItemsFromCartResponse();
    }

    /**
     * Create an instance of {@link Advertisement_Type }
     * 
     */
    public Advertisement_Type createAdvertisement_Type() {
        return new Advertisement_Type();
    }

    /**
     * Create an instance of {@link OrderAdResponse }
     * 
     */
    public OrderAdResponse createOrderAdResponse() {
        return new OrderAdResponse();
    }

    /**
     * Create an instance of {@link OrderAd }
     * 
     */
    public OrderAd createOrderAd() {
        return new OrderAd();
    }

    /**
     * Create an instance of {@link SignUp }
     * 
     */
    public SignUp createSignUp() {
        return new SignUp();
    }

    /**
     * Create an instance of {@link RemoveAdFrmCart }
     * 
     */
    public RemoveAdFrmCart createRemoveAdFrmCart() {
        return new RemoveAdFrmCart();
    }

    /**
     * Create an instance of {@link GetAllAds }
     * 
     */
    public GetAllAds createGetAllAds() {
        return new GetAllAds();
    }

    /**
     * Create an instance of {@link AddAdToCartResponse }
     * 
     */
    public AddAdToCartResponse createAddAdToCartResponse() {
        return new AddAdToCartResponse();
    }

    /**
     * Create an instance of {@link AdCart }
     * 
     */
    public AdCart createAdCart() {
        return new AdCart();
    }

    /**
     * Create an instance of {@link GetAllAdsResponse }
     * 
     */
    public GetAllAdsResponse createGetAllAdsResponse() {
        return new GetAllAdsResponse();
    }

    /**
     * Create an instance of {@link PostAd }
     * 
     */
    public PostAd createPostAd() {
        return new PostAd();
    }

    /**
     * Create an instance of {@link RemoveAdFrmCartResponse }
     * 
     */
    public RemoveAdFrmCartResponse createRemoveAdFrmCartResponse() {
        return new RemoveAdFrmCartResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdFrmCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "removeAdFrmCart")
    public JAXBElement<RemoveAdFrmCart> createRemoveAdFrmCart(RemoveAdFrmCart value) {
        return new JAXBElement<RemoveAdFrmCart>(_RemoveAdFrmCart_QNAME, RemoveAdFrmCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllAdsResponse")
    public JAXBElement<GetAllAdsResponse> createGetAllAdsResponse(GetAllAdsResponse value) {
        return new JAXBElement<GetAllAdsResponse>(_GetAllAdsResponse_QNAME, GetAllAdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "orderAd")
    public JAXBElement<OrderAd> createOrderAd(OrderAd value) {
        return new JAXBElement<OrderAd>(_OrderAd_QNAME, OrderAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "postAdResponse")
    public JAXBElement<PostAdResponse> createPostAdResponse(PostAdResponse value) {
        return new JAXBElement<PostAdResponse>(_PostAdResponse_QNAME, PostAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsFromCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsFromCartResponse")
    public JAXBElement<GetItemsFromCartResponse> createGetItemsFromCartResponse(GetItemsFromCartResponse value) {
        return new JAXBElement<GetItemsFromCartResponse>(_GetItemsFromCartResponse_QNAME, GetItemsFromCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SignUp")
    public JAXBElement<SignUp> createSignUp(SignUp value) {
        return new JAXBElement<SignUp>(_SignUp_QNAME, SignUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderAdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "orderAdResponse")
    public JAXBElement<OrderAdResponse> createOrderAdResponse(OrderAdResponse value) {
        return new JAXBElement<OrderAdResponse>(_OrderAdResponse_QNAME, OrderAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdFrmCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "removeAdFrmCartResponse")
    public JAXBElement<RemoveAdFrmCartResponse> createRemoveAdFrmCartResponse(RemoveAdFrmCartResponse value) {
        return new JAXBElement<RemoveAdFrmCartResponse>(_RemoveAdFrmCartResponse_QNAME, RemoveAdFrmCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostAd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "postAd")
    public JAXBElement<PostAd> createPostAd(PostAd value) {
        return new JAXBElement<PostAd>(_PostAd_QNAME, PostAd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdToCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addAdToCartResponse")
    public JAXBElement<AddAdToCartResponse> createAddAdToCartResponse(AddAdToCartResponse value) {
        return new JAXBElement<AddAdToCartResponse>(_AddAdToCartResponse_QNAME, AddAdToCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemsFromCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getItemsFromCart")
    public JAXBElement<GetItemsFromCart> createGetItemsFromCart(GetItemsFromCart value) {
        return new JAXBElement<GetItemsFromCart>(_GetItemsFromCart_QNAME, GetItemsFromCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SignUpResponse")
    public JAXBElement<SignUpResponse> createSignUpResponse(SignUpResponse value) {
        return new JAXBElement<SignUpResponse>(_SignUpResponse_QNAME, SignUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllAds")
    public JAXBElement<GetAllAds> createGetAllAds(GetAllAds value) {
        return new JAXBElement<GetAllAds>(_GetAllAds_QNAME, GetAllAds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdToCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addAdToCart")
    public JAXBElement<AddAdToCart> createAddAdToCart(AddAdToCart value) {
        return new JAXBElement<AddAdToCart>(_AddAdToCart_QNAME, AddAdToCart.class, null, value);
    }

}
