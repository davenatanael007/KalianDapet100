
package com.flashsale.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flashsale.services package. 
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

    private final static QName _AddTicketDB_QNAME = new QName("http://services.flashsale.com/", "addTicketDB");
    private final static QName _AddTicketDBResponse_QNAME = new QName("http://services.flashsale.com/", "addTicketDBResponse");
    private final static QName _CekLogin_QNAME = new QName("http://services.flashsale.com/", "cekLogin");
    private final static QName _CekLoginResponse_QNAME = new QName("http://services.flashsale.com/", "cekLoginResponse");
    private final static QName _CekRegister_QNAME = new QName("http://services.flashsale.com/", "cekRegister");
    private final static QName _CekRegisterResponse_QNAME = new QName("http://services.flashsale.com/", "cekRegisterResponse");
    private final static QName _CekStock_QNAME = new QName("http://services.flashsale.com/", "cekStock");
    private final static QName _CekStockResponse_QNAME = new QName("http://services.flashsale.com/", "cekStockResponse");
    private final static QName _CountSubtotal_QNAME = new QName("http://services.flashsale.com/", "countSubtotal");
    private final static QName _CountSubtotalResponse_QNAME = new QName("http://services.flashsale.com/", "countSubtotalResponse");
    private final static QName _GetTicketByID_QNAME = new QName("http://services.flashsale.com/", "getTicketByID");
    private final static QName _GetTicketByIDResponse_QNAME = new QName("http://services.flashsale.com/", "getTicketByIDResponse");
    private final static QName _Hello_QNAME = new QName("http://services.flashsale.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services.flashsale.com/", "helloResponse");
    private final static QName _Login_QNAME = new QName("http://services.flashsale.com/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://services.flashsale.com/", "loginResponse");
    private final static QName _PurchaseTicket_QNAME = new QName("http://services.flashsale.com/", "purchaseTicket");
    private final static QName _PurchaseTicketResponse_QNAME = new QName("http://services.flashsale.com/", "purchaseTicketResponse");
    private final static QName _RegisterDB_QNAME = new QName("http://services.flashsale.com/", "registerDB");
    private final static QName _RegisterDBResponse_QNAME = new QName("http://services.flashsale.com/", "registerDBResponse");
    private final static QName _SearchTicket_QNAME = new QName("http://services.flashsale.com/", "searchTicket");
    private final static QName _SearchTicketResponse_QNAME = new QName("http://services.flashsale.com/", "searchTicketResponse");
    private final static QName _UpdateStockPurchase_QNAME = new QName("http://services.flashsale.com/", "updateStockPurchase");
    private final static QName _UpdateStockPurchaseResponse_QNAME = new QName("http://services.flashsale.com/", "updateStockPurchaseResponse");
    private final static QName _ViewListTicket_QNAME = new QName("http://services.flashsale.com/", "viewListTicket");
    private final static QName _ViewListTicketResponse_QNAME = new QName("http://services.flashsale.com/", "viewListTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flashsale.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddTicketDB }
     * 
     */
    public AddTicketDB createAddTicketDB() {
        return new AddTicketDB();
    }

    /**
     * Create an instance of {@link AddTicketDBResponse }
     * 
     */
    public AddTicketDBResponse createAddTicketDBResponse() {
        return new AddTicketDBResponse();
    }

    /**
     * Create an instance of {@link CekLogin }
     * 
     */
    public CekLogin createCekLogin() {
        return new CekLogin();
    }

    /**
     * Create an instance of {@link CekLoginResponse }
     * 
     */
    public CekLoginResponse createCekLoginResponse() {
        return new CekLoginResponse();
    }

    /**
     * Create an instance of {@link CekRegister }
     * 
     */
    public CekRegister createCekRegister() {
        return new CekRegister();
    }

    /**
     * Create an instance of {@link CekRegisterResponse }
     * 
     */
    public CekRegisterResponse createCekRegisterResponse() {
        return new CekRegisterResponse();
    }

    /**
     * Create an instance of {@link CekStock }
     * 
     */
    public CekStock createCekStock() {
        return new CekStock();
    }

    /**
     * Create an instance of {@link CekStockResponse }
     * 
     */
    public CekStockResponse createCekStockResponse() {
        return new CekStockResponse();
    }

    /**
     * Create an instance of {@link CountSubtotal }
     * 
     */
    public CountSubtotal createCountSubtotal() {
        return new CountSubtotal();
    }

    /**
     * Create an instance of {@link CountSubtotalResponse }
     * 
     */
    public CountSubtotalResponse createCountSubtotalResponse() {
        return new CountSubtotalResponse();
    }

    /**
     * Create an instance of {@link GetTicketByID }
     * 
     */
    public GetTicketByID createGetTicketByID() {
        return new GetTicketByID();
    }

    /**
     * Create an instance of {@link GetTicketByIDResponse }
     * 
     */
    public GetTicketByIDResponse createGetTicketByIDResponse() {
        return new GetTicketByIDResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link PurchaseTicket }
     * 
     */
    public PurchaseTicket createPurchaseTicket() {
        return new PurchaseTicket();
    }

    /**
     * Create an instance of {@link PurchaseTicketResponse }
     * 
     */
    public PurchaseTicketResponse createPurchaseTicketResponse() {
        return new PurchaseTicketResponse();
    }

    /**
     * Create an instance of {@link RegisterDB }
     * 
     */
    public RegisterDB createRegisterDB() {
        return new RegisterDB();
    }

    /**
     * Create an instance of {@link RegisterDBResponse }
     * 
     */
    public RegisterDBResponse createRegisterDBResponse() {
        return new RegisterDBResponse();
    }

    /**
     * Create an instance of {@link SearchTicket }
     * 
     */
    public SearchTicket createSearchTicket() {
        return new SearchTicket();
    }

    /**
     * Create an instance of {@link SearchTicketResponse }
     * 
     */
    public SearchTicketResponse createSearchTicketResponse() {
        return new SearchTicketResponse();
    }

    /**
     * Create an instance of {@link UpdateStockPurchase }
     * 
     */
    public UpdateStockPurchase createUpdateStockPurchase() {
        return new UpdateStockPurchase();
    }

    /**
     * Create an instance of {@link UpdateStockPurchaseResponse }
     * 
     */
    public UpdateStockPurchaseResponse createUpdateStockPurchaseResponse() {
        return new UpdateStockPurchaseResponse();
    }

    /**
     * Create an instance of {@link ViewListTicket }
     * 
     */
    public ViewListTicket createViewListTicket() {
        return new ViewListTicket();
    }

    /**
     * Create an instance of {@link ViewListTicketResponse }
     * 
     */
    public ViewListTicketResponse createViewListTicketResponse() {
        return new ViewListTicketResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketDB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTicketDB }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "addTicketDB")
    public JAXBElement<AddTicketDB> createAddTicketDB(AddTicketDB value) {
        return new JAXBElement<AddTicketDB>(_AddTicketDB_QNAME, AddTicketDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketDBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTicketDBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "addTicketDBResponse")
    public JAXBElement<AddTicketDBResponse> createAddTicketDBResponse(AddTicketDBResponse value) {
        return new JAXBElement<AddTicketDBResponse>(_AddTicketDBResponse_QNAME, AddTicketDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekLogin }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekLogin")
    public JAXBElement<CekLogin> createCekLogin(CekLogin value) {
        return new JAXBElement<CekLogin>(_CekLogin_QNAME, CekLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekLoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekLoginResponse")
    public JAXBElement<CekLoginResponse> createCekLoginResponse(CekLoginResponse value) {
        return new JAXBElement<CekLoginResponse>(_CekLoginResponse_QNAME, CekLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekRegister }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekRegister }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekRegister")
    public JAXBElement<CekRegister> createCekRegister(CekRegister value) {
        return new JAXBElement<CekRegister>(_CekRegister_QNAME, CekRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekRegisterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekRegisterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekRegisterResponse")
    public JAXBElement<CekRegisterResponse> createCekRegisterResponse(CekRegisterResponse value) {
        return new JAXBElement<CekRegisterResponse>(_CekRegisterResponse_QNAME, CekRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekStock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekStock }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekStock")
    public JAXBElement<CekStock> createCekStock(CekStock value) {
        return new JAXBElement<CekStock>(_CekStock_QNAME, CekStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CekStockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CekStockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "cekStockResponse")
    public JAXBElement<CekStockResponse> createCekStockResponse(CekStockResponse value) {
        return new JAXBElement<CekStockResponse>(_CekStockResponse_QNAME, CekStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubtotal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountSubtotal }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "countSubtotal")
    public JAXBElement<CountSubtotal> createCountSubtotal(CountSubtotal value) {
        return new JAXBElement<CountSubtotal>(_CountSubtotal_QNAME, CountSubtotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountSubtotalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountSubtotalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "countSubtotalResponse")
    public JAXBElement<CountSubtotalResponse> createCountSubtotalResponse(CountSubtotalResponse value) {
        return new JAXBElement<CountSubtotalResponse>(_CountSubtotalResponse_QNAME, CountSubtotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "getTicketByID")
    public JAXBElement<GetTicketByID> createGetTicketByID(GetTicketByID value) {
        return new JAXBElement<GetTicketByID>(_GetTicketByID_QNAME, GetTicketByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "getTicketByIDResponse")
    public JAXBElement<GetTicketByIDResponse> createGetTicketByIDResponse(GetTicketByIDResponse value) {
        return new JAXBElement<GetTicketByIDResponse>(_GetTicketByIDResponse_QNAME, GetTicketByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurchaseTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "purchaseTicket")
    public JAXBElement<PurchaseTicket> createPurchaseTicket(PurchaseTicket value) {
        return new JAXBElement<PurchaseTicket>(_PurchaseTicket_QNAME, PurchaseTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurchaseTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "purchaseTicketResponse")
    public JAXBElement<PurchaseTicketResponse> createPurchaseTicketResponse(PurchaseTicketResponse value) {
        return new JAXBElement<PurchaseTicketResponse>(_PurchaseTicketResponse_QNAME, PurchaseTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterDB }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "registerDB")
    public JAXBElement<RegisterDB> createRegisterDB(RegisterDB value) {
        return new JAXBElement<RegisterDB>(_RegisterDB_QNAME, RegisterDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterDBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "registerDBResponse")
    public JAXBElement<RegisterDBResponse> createRegisterDBResponse(RegisterDBResponse value) {
        return new JAXBElement<RegisterDBResponse>(_RegisterDBResponse_QNAME, RegisterDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "searchTicket")
    public JAXBElement<SearchTicket> createSearchTicket(SearchTicket value) {
        return new JAXBElement<SearchTicket>(_SearchTicket_QNAME, SearchTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "searchTicketResponse")
    public JAXBElement<SearchTicketResponse> createSearchTicketResponse(SearchTicketResponse value) {
        return new JAXBElement<SearchTicketResponse>(_SearchTicketResponse_QNAME, SearchTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStockPurchase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStockPurchase }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "updateStockPurchase")
    public JAXBElement<UpdateStockPurchase> createUpdateStockPurchase(UpdateStockPurchase value) {
        return new JAXBElement<UpdateStockPurchase>(_UpdateStockPurchase_QNAME, UpdateStockPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStockPurchaseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateStockPurchaseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "updateStockPurchaseResponse")
    public JAXBElement<UpdateStockPurchaseResponse> createUpdateStockPurchaseResponse(UpdateStockPurchaseResponse value) {
        return new JAXBElement<UpdateStockPurchaseResponse>(_UpdateStockPurchaseResponse_QNAME, UpdateStockPurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "viewListTicket")
    public JAXBElement<ViewListTicket> createViewListTicket(ViewListTicket value) {
        return new JAXBElement<ViewListTicket>(_ViewListTicket_QNAME, ViewListTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewListTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewListTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.flashsale.com/", name = "viewListTicketResponse")
    public JAXBElement<ViewListTicketResponse> createViewListTicketResponse(ViewListTicketResponse value) {
        return new JAXBElement<ViewListTicketResponse>(_ViewListTicketResponse_QNAME, ViewListTicketResponse.class, null, value);
    }

}
