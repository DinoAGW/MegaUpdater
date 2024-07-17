
package com.exlibris.dps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exlibris.dps package. 
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

    private final static QName _UserAuthorizeException_QNAME = new QName("http://dps.exlibris.com/", "UserAuthorizeException");
    private final static QName _NotInPermanentException_QNAME = new QName("http://dps.exlibris.com/", "NotInPermanentException");
    private final static QName _UpdateMD_QNAME = new QName("http://dps.exlibris.com/", "updateMD");
    private final static QName _UpdateDNX_QNAME = new QName("http://dps.exlibris.com/", "updateDNX");
    private final static QName _GetHeartBit_QNAME = new QName("http://dps.exlibris.com/", "getHeartBit");
    private final static QName _CreateSharedMD_QNAME = new QName("http://dps.exlibris.com/", "createSharedMD");
    private final static QName _GetDNX_QNAME = new QName("http://dps.exlibris.com/", "getDNX");
    private final static QName _InvalidTypeException_QNAME = new QName("http://dps.exlibris.com/", "InvalidTypeException");
    private final static QName _GetDNXResponse_QNAME = new QName("http://dps.exlibris.com/", "getDNXResponse");
    private final static QName _UnassignCMSResponse_QNAME = new QName("http://dps.exlibris.com/", "unassignCMSResponse");
    private final static QName _ManageIEResponse_QNAME = new QName("http://dps.exlibris.com/", "manageIEResponse");
    private final static QName _GetSharedMDByMidResponse_QNAME = new QName("http://dps.exlibris.com/", "getSharedMDByMidResponse");
    private final static QName _FixityEventException_QNAME = new QName("http://dps.exlibris.com/", "FixityEventException");
    private final static QName _UnassignCMS_QNAME = new QName("http://dps.exlibris.com/", "unassignCMS");
    private final static QName _UnassignSharedMD_QNAME = new QName("http://dps.exlibris.com/", "unassignSharedMD");
    private final static QName _LockedIeException_QNAME = new QName("http://dps.exlibris.com/", "LockedIeException");
    private final static QName _DeleteSharedMD_QNAME = new QName("http://dps.exlibris.com/", "deleteSharedMD");
    private final static QName _CreateSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "createSharedMDResponse");
    private final static QName _AssignCMS_QNAME = new QName("http://dps.exlibris.com/", "assignCMS");
    private final static QName _GetRipStatusResponse_QNAME = new QName("http://dps.exlibris.com/", "getRipStatusResponse");
    private final static QName _InvalidXmlException_QNAME = new QName("http://dps.exlibris.com/", "InvalidXmlException");
    private final static QName _GetIERepresentationsResponse_QNAME = new QName("http://dps.exlibris.com/", "getIERepresentationsResponse");
    private final static QName _UpdateDNXResponse_QNAME = new QName("http://dps.exlibris.com/", "updateDNXResponse");
    private final static QName _GetIEMDResponse_QNAME = new QName("http://dps.exlibris.com/", "getIEMDResponse");
    private final static QName _GetSharedMDByType_QNAME = new QName("http://dps.exlibris.com/", "getSharedMDByType");
    private final static QName _DeleteSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "deleteSharedMDResponse");
    private final static QName _GenerateFixityEvent_QNAME = new QName("http://dps.exlibris.com/", "generateFixityEvent");
    private final static QName _UpdateSharedMD_QNAME = new QName("http://dps.exlibris.com/", "updateSharedMD");
    private final static QName _UpdateIEMD_QNAME = new QName("http://dps.exlibris.com/", "updateIEMD");
    private final static QName _InvalidMIDException_QNAME = new QName("http://dps.exlibris.com/", "InvalidMIDException");
    private final static QName _GetIE_QNAME = new QName("http://dps.exlibris.com/", "getIE");
    private final static QName _GetSharedMD_QNAME = new QName("http://dps.exlibris.com/", "getSharedMD");
    private final static QName _AddRepresentationResponse_QNAME = new QName("http://dps.exlibris.com/", "addRepresentationResponse");
    private final static QName _GetMD_QNAME = new QName("http://dps.exlibris.com/", "getMD");
    private final static QName _GetSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "getSharedMDResponse");
    private final static QName _GetRipStatusInfoResponse_QNAME = new QName("http://dps.exlibris.com/", "getRipStatusInfoResponse");
    private final static QName _UpdateIEMDResponse_QNAME = new QName("http://dps.exlibris.com/", "updateIEMDResponse");
    private final static QName _AssignSharedMD_QNAME = new QName("http://dps.exlibris.com/", "assignSharedMD");
    private final static QName _GetIEResponse_QNAME = new QName("http://dps.exlibris.com/", "getIEResponse");
    private final static QName _IEWSException_QNAME = new QName("http://dps.exlibris.com/", "IEWSException");
    private final static QName _UpdateRepresentation_QNAME = new QName("http://dps.exlibris.com/", "updateRepresentation");
    private final static QName _GetRipStatusInfo_QNAME = new QName("http://dps.exlibris.com/", "getRipStatusInfo");
    private final static QName _GetIERepresentations_QNAME = new QName("http://dps.exlibris.com/", "getIERepresentations");
    private final static QName _UnassignSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "unassignSharedMDResponse");
    private final static QName _UpdateSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "updateSharedMDResponse");
    private final static QName _GetSharedMDByMid_QNAME = new QName("http://dps.exlibris.com/", "getSharedMDByMid");
    private final static QName _UpdateMDResponse_QNAME = new QName("http://dps.exlibris.com/", "updateMDResponse");
    private final static QName _GetHeartBitResponse_QNAME = new QName("http://dps.exlibris.com/", "getHeartBitResponse");
    private final static QName _GetMDResponse_QNAME = new QName("http://dps.exlibris.com/", "getMDResponse");
    private final static QName _GetIEMD_QNAME = new QName("http://dps.exlibris.com/", "getIEMD");
    private final static QName _AssignCMSResponse_QNAME = new QName("http://dps.exlibris.com/", "assignCMSResponse");
    private final static QName _AssignSharedMDResponse_QNAME = new QName("http://dps.exlibris.com/", "assignSharedMDResponse");
    private final static QName _UpdateRepresentationResponse_QNAME = new QName("http://dps.exlibris.com/", "updateRepresentationResponse");
    private final static QName _GetSharedMDByTypeResponse_QNAME = new QName("http://dps.exlibris.com/", "getSharedMDByTypeResponse");
    private final static QName _InvalidCMSSystemException_QNAME = new QName("http://dps.exlibris.com/", "InvalidCMSSystemException");
    private final static QName _GetRipStatus_QNAME = new QName("http://dps.exlibris.com/", "getRipStatus");
    private final static QName _AddRepresentation_QNAME = new QName("http://dps.exlibris.com/", "addRepresentation");
    private final static QName _ManageIE_QNAME = new QName("http://dps.exlibris.com/", "manageIE");
    private final static QName _GenerateFixityEventResponse_QNAME = new QName("http://dps.exlibris.com/", "generateFixityEventResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exlibris.dps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateMDResponse }
     * 
     */
    public UpdateMDResponse createUpdateMDResponse() {
        return new UpdateMDResponse();
    }

    /**
     * Create an instance of {@link GetSharedMDByMid }
     * 
     */
    public GetSharedMDByMid createGetSharedMDByMid() {
        return new GetSharedMDByMid();
    }

    /**
     * Create an instance of {@link UpdateSharedMDResponse }
     * 
     */
    public UpdateSharedMDResponse createUpdateSharedMDResponse() {
        return new UpdateSharedMDResponse();
    }

    /**
     * Create an instance of {@link GetIEMD }
     * 
     */
    public GetIEMD createGetIEMD() {
        return new GetIEMD();
    }

    /**
     * Create an instance of {@link GetMDResponse }
     * 
     */
    public GetMDResponse createGetMDResponse() {
        return new GetMDResponse();
    }

    /**
     * Create an instance of {@link GetHeartBitResponse }
     * 
     */
    public GetHeartBitResponse createGetHeartBitResponse() {
        return new GetHeartBitResponse();
    }

    /**
     * Create an instance of {@link UpdateRepresentationResponse }
     * 
     */
    public UpdateRepresentationResponse createUpdateRepresentationResponse() {
        return new UpdateRepresentationResponse();
    }

    /**
     * Create an instance of {@link AssignSharedMDResponse }
     * 
     */
    public AssignSharedMDResponse createAssignSharedMDResponse() {
        return new AssignSharedMDResponse();
    }

    /**
     * Create an instance of {@link AssignCMSResponse }
     * 
     */
    public AssignCMSResponse createAssignCMSResponse() {
        return new AssignCMSResponse();
    }

    /**
     * Create an instance of {@link GenerateFixityEventResponse }
     * 
     */
    public GenerateFixityEventResponse createGenerateFixityEventResponse() {
        return new GenerateFixityEventResponse();
    }

    /**
     * Create an instance of {@link ManageIE }
     * 
     */
    public ManageIE createManageIE() {
        return new ManageIE();
    }

    /**
     * Create an instance of {@link AddRepresentation }
     * 
     */
    public AddRepresentation createAddRepresentation() {
        return new AddRepresentation();
    }

    /**
     * Create an instance of {@link InvalidCMSSystemException }
     * 
     */
    public InvalidCMSSystemException createInvalidCMSSystemException() {
        return new InvalidCMSSystemException();
    }

    /**
     * Create an instance of {@link GetRipStatus }
     * 
     */
    public GetRipStatus createGetRipStatus() {
        return new GetRipStatus();
    }

    /**
     * Create an instance of {@link GetSharedMDByTypeResponse }
     * 
     */
    public GetSharedMDByTypeResponse createGetSharedMDByTypeResponse() {
        return new GetSharedMDByTypeResponse();
    }

    /**
     * Create an instance of {@link GetSharedMDByType }
     * 
     */
    public GetSharedMDByType createGetSharedMDByType() {
        return new GetSharedMDByType();
    }

    /**
     * Create an instance of {@link GetIEMDResponse }
     * 
     */
    public GetIEMDResponse createGetIEMDResponse() {
        return new GetIEMDResponse();
    }

    /**
     * Create an instance of {@link InvalidMIDException }
     * 
     */
    public InvalidMIDException createInvalidMIDException() {
        return new InvalidMIDException();
    }

    /**
     * Create an instance of {@link GetIE }
     * 
     */
    public GetIE createGetIE() {
        return new GetIE();
    }

    /**
     * Create an instance of {@link UpdateIEMD }
     * 
     */
    public UpdateIEMD createUpdateIEMD() {
        return new UpdateIEMD();
    }

    /**
     * Create an instance of {@link GenerateFixityEvent }
     * 
     */
    public GenerateFixityEvent createGenerateFixityEvent() {
        return new GenerateFixityEvent();
    }

    /**
     * Create an instance of {@link UpdateSharedMD }
     * 
     */
    public UpdateSharedMD createUpdateSharedMD() {
        return new UpdateSharedMD();
    }

    /**
     * Create an instance of {@link DeleteSharedMDResponse }
     * 
     */
    public DeleteSharedMDResponse createDeleteSharedMDResponse() {
        return new DeleteSharedMDResponse();
    }

    /**
     * Create an instance of {@link GetIEResponse }
     * 
     */
    public GetIEResponse createGetIEResponse() {
        return new GetIEResponse();
    }

    /**
     * Create an instance of {@link AssignSharedMD }
     * 
     */
    public AssignSharedMD createAssignSharedMD() {
        return new AssignSharedMD();
    }

    /**
     * Create an instance of {@link UpdateIEMDResponse }
     * 
     */
    public UpdateIEMDResponse createUpdateIEMDResponse() {
        return new UpdateIEMDResponse();
    }

    /**
     * Create an instance of {@link GetSharedMDResponse }
     * 
     */
    public GetSharedMDResponse createGetSharedMDResponse() {
        return new GetSharedMDResponse();
    }

    /**
     * Create an instance of {@link GetRipStatusInfoResponse }
     * 
     */
    public GetRipStatusInfoResponse createGetRipStatusInfoResponse() {
        return new GetRipStatusInfoResponse();
    }

    /**
     * Create an instance of {@link GetMD }
     * 
     */
    public GetMD createGetMD() {
        return new GetMD();
    }

    /**
     * Create an instance of {@link GetSharedMD }
     * 
     */
    public GetSharedMD createGetSharedMD() {
        return new GetSharedMD();
    }

    /**
     * Create an instance of {@link AddRepresentationResponse }
     * 
     */
    public AddRepresentationResponse createAddRepresentationResponse() {
        return new AddRepresentationResponse();
    }

    /**
     * Create an instance of {@link GetIERepresentations }
     * 
     */
    public GetIERepresentations createGetIERepresentations() {
        return new GetIERepresentations();
    }

    /**
     * Create an instance of {@link UnassignSharedMDResponse }
     * 
     */
    public UnassignSharedMDResponse createUnassignSharedMDResponse() {
        return new UnassignSharedMDResponse();
    }

    /**
     * Create an instance of {@link GetRipStatusInfo }
     * 
     */
    public GetRipStatusInfo createGetRipStatusInfo() {
        return new GetRipStatusInfo();
    }

    /**
     * Create an instance of {@link UpdateRepresentation }
     * 
     */
    public UpdateRepresentation createUpdateRepresentation() {
        return new UpdateRepresentation();
    }

    /**
     * Create an instance of {@link IEWSException }
     * 
     */
    public IEWSException createIEWSException() {
        return new IEWSException();
    }

    /**
     * Create an instance of {@link UnassignCMS }
     * 
     */
    public UnassignCMS createUnassignCMS() {
        return new UnassignCMS();
    }

    /**
     * Create an instance of {@link FixityEventException }
     * 
     */
    public FixityEventException createFixityEventException() {
        return new FixityEventException();
    }

    /**
     * Create an instance of {@link GetSharedMDByMidResponse }
     * 
     */
    public GetSharedMDByMidResponse createGetSharedMDByMidResponse() {
        return new GetSharedMDByMidResponse();
    }

    /**
     * Create an instance of {@link LockedIeException }
     * 
     */
    public LockedIeException createLockedIeException() {
        return new LockedIeException();
    }

    /**
     * Create an instance of {@link DeleteSharedMD }
     * 
     */
    public DeleteSharedMD createDeleteSharedMD() {
        return new DeleteSharedMD();
    }

    /**
     * Create an instance of {@link UnassignSharedMD }
     * 
     */
    public UnassignSharedMD createUnassignSharedMD() {
        return new UnassignSharedMD();
    }

    /**
     * Create an instance of {@link InvalidXmlException }
     * 
     */
    public InvalidXmlException createInvalidXmlException() {
        return new InvalidXmlException();
    }

    /**
     * Create an instance of {@link GetRipStatusResponse }
     * 
     */
    public GetRipStatusResponse createGetRipStatusResponse() {
        return new GetRipStatusResponse();
    }

    /**
     * Create an instance of {@link CreateSharedMDResponse }
     * 
     */
    public CreateSharedMDResponse createCreateSharedMDResponse() {
        return new CreateSharedMDResponse();
    }

    /**
     * Create an instance of {@link AssignCMS }
     * 
     */
    public AssignCMS createAssignCMS() {
        return new AssignCMS();
    }

    /**
     * Create an instance of {@link UpdateDNXResponse }
     * 
     */
    public UpdateDNXResponse createUpdateDNXResponse() {
        return new UpdateDNXResponse();
    }

    /**
     * Create an instance of {@link GetIERepresentationsResponse }
     * 
     */
    public GetIERepresentationsResponse createGetIERepresentationsResponse() {
        return new GetIERepresentationsResponse();
    }

    /**
     * Create an instance of {@link NotInPermanentException }
     * 
     */
    public NotInPermanentException createNotInPermanentException() {
        return new NotInPermanentException();
    }

    /**
     * Create an instance of {@link UserAuthorizeException }
     * 
     */
    public UserAuthorizeException createUserAuthorizeException() {
        return new UserAuthorizeException();
    }

    /**
     * Create an instance of {@link CreateSharedMD }
     * 
     */
    public CreateSharedMD createCreateSharedMD() {
        return new CreateSharedMD();
    }

    /**
     * Create an instance of {@link GetDNX }
     * 
     */
    public GetDNX createGetDNX() {
        return new GetDNX();
    }

    /**
     * Create an instance of {@link GetHeartBit }
     * 
     */
    public GetHeartBit createGetHeartBit() {
        return new GetHeartBit();
    }

    /**
     * Create an instance of {@link UpdateDNX }
     * 
     */
    public UpdateDNX createUpdateDNX() {
        return new UpdateDNX();
    }

    /**
     * Create an instance of {@link UpdateMD }
     * 
     */
    public UpdateMD createUpdateMD() {
        return new UpdateMD();
    }

    /**
     * Create an instance of {@link UnassignCMSResponse }
     * 
     */
    public UnassignCMSResponse createUnassignCMSResponse() {
        return new UnassignCMSResponse();
    }

    /**
     * Create an instance of {@link ManageIEResponse }
     * 
     */
    public ManageIEResponse createManageIEResponse() {
        return new ManageIEResponse();
    }

    /**
     * Create an instance of {@link GetDNXResponse }
     * 
     */
    public GetDNXResponse createGetDNXResponse() {
        return new GetDNXResponse();
    }

    /**
     * Create an instance of {@link InvalidTypeException }
     * 
     */
    public InvalidTypeException createInvalidTypeException() {
        return new InvalidTypeException();
    }

    /**
     * Create an instance of {@link RepresentationContent }
     * 
     */
    public RepresentationContent createRepresentationContent() {
        return new RepresentationContent();
    }

    /**
     * Create an instance of {@link IeStatusInfo }
     * 
     */
    public IeStatusInfo createIeStatusInfo() {
        return new IeStatusInfo();
    }

    /**
     * Create an instance of {@link MetaData }
     * 
     */
    public MetaData createMetaData() {
        return new MetaData();
    }

    /**
     * Create an instance of {@link FixityEvent }
     * 
     */
    public FixityEvent createFixityEvent() {
        return new FixityEvent();
    }

    /**
     * Create an instance of {@link RipStatusInfo }
     * 
     */
    public RipStatusInfo createRipStatusInfo() {
        return new RipStatusInfo();
    }

    /**
     * Create an instance of {@link Fixity }
     * 
     */
    public Fixity createFixity() {
        return new Fixity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthorizeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "UserAuthorizeException")
    public JAXBElement<UserAuthorizeException> createUserAuthorizeException(UserAuthorizeException value) {
        return new JAXBElement<UserAuthorizeException>(_UserAuthorizeException_QNAME, UserAuthorizeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotInPermanentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "NotInPermanentException")
    public JAXBElement<NotInPermanentException> createNotInPermanentException(NotInPermanentException value) {
        return new JAXBElement<NotInPermanentException>(_NotInPermanentException_QNAME, NotInPermanentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateMD")
    public JAXBElement<UpdateMD> createUpdateMD(UpdateMD value) {
        return new JAXBElement<UpdateMD>(_UpdateMD_QNAME, UpdateMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDNX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateDNX")
    public JAXBElement<UpdateDNX> createUpdateDNX(UpdateDNX value) {
        return new JAXBElement<UpdateDNX>(_UpdateDNX_QNAME, UpdateDNX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHeartBit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getHeartBit")
    public JAXBElement<GetHeartBit> createGetHeartBit(GetHeartBit value) {
        return new JAXBElement<GetHeartBit>(_GetHeartBit_QNAME, GetHeartBit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "createSharedMD")
    public JAXBElement<CreateSharedMD> createCreateSharedMD(CreateSharedMD value) {
        return new JAXBElement<CreateSharedMD>(_CreateSharedMD_QNAME, CreateSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDNX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getDNX")
    public JAXBElement<GetDNX> createGetDNX(GetDNX value) {
        return new JAXBElement<GetDNX>(_GetDNX_QNAME, GetDNX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTypeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "InvalidTypeException")
    public JAXBElement<InvalidTypeException> createInvalidTypeException(InvalidTypeException value) {
        return new JAXBElement<InvalidTypeException>(_InvalidTypeException_QNAME, InvalidTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDNXResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getDNXResponse")
    public JAXBElement<GetDNXResponse> createGetDNXResponse(GetDNXResponse value) {
        return new JAXBElement<GetDNXResponse>(_GetDNXResponse_QNAME, GetDNXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassignCMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "unassignCMSResponse")
    public JAXBElement<UnassignCMSResponse> createUnassignCMSResponse(UnassignCMSResponse value) {
        return new JAXBElement<UnassignCMSResponse>(_UnassignCMSResponse_QNAME, UnassignCMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageIEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "manageIEResponse")
    public JAXBElement<ManageIEResponse> createManageIEResponse(ManageIEResponse value) {
        return new JAXBElement<ManageIEResponse>(_ManageIEResponse_QNAME, ManageIEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMDByMidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMDByMidResponse")
    public JAXBElement<GetSharedMDByMidResponse> createGetSharedMDByMidResponse(GetSharedMDByMidResponse value) {
        return new JAXBElement<GetSharedMDByMidResponse>(_GetSharedMDByMidResponse_QNAME, GetSharedMDByMidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixityEventException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "FixityEventException")
    public JAXBElement<FixityEventException> createFixityEventException(FixityEventException value) {
        return new JAXBElement<FixityEventException>(_FixityEventException_QNAME, FixityEventException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassignCMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "unassignCMS")
    public JAXBElement<UnassignCMS> createUnassignCMS(UnassignCMS value) {
        return new JAXBElement<UnassignCMS>(_UnassignCMS_QNAME, UnassignCMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassignSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "unassignSharedMD")
    public JAXBElement<UnassignSharedMD> createUnassignSharedMD(UnassignSharedMD value) {
        return new JAXBElement<UnassignSharedMD>(_UnassignSharedMD_QNAME, UnassignSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockedIeException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "LockedIeException")
    public JAXBElement<LockedIeException> createLockedIeException(LockedIeException value) {
        return new JAXBElement<LockedIeException>(_LockedIeException_QNAME, LockedIeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "deleteSharedMD")
    public JAXBElement<DeleteSharedMD> createDeleteSharedMD(DeleteSharedMD value) {
        return new JAXBElement<DeleteSharedMD>(_DeleteSharedMD_QNAME, DeleteSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "createSharedMDResponse")
    public JAXBElement<CreateSharedMDResponse> createCreateSharedMDResponse(CreateSharedMDResponse value) {
        return new JAXBElement<CreateSharedMDResponse>(_CreateSharedMDResponse_QNAME, CreateSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignCMS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "assignCMS")
    public JAXBElement<AssignCMS> createAssignCMS(AssignCMS value) {
        return new JAXBElement<AssignCMS>(_AssignCMS_QNAME, AssignCMS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRipStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getRipStatusResponse")
    public JAXBElement<GetRipStatusResponse> createGetRipStatusResponse(GetRipStatusResponse value) {
        return new JAXBElement<GetRipStatusResponse>(_GetRipStatusResponse_QNAME, GetRipStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidXmlException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "InvalidXmlException")
    public JAXBElement<InvalidXmlException> createInvalidXmlException(InvalidXmlException value) {
        return new JAXBElement<InvalidXmlException>(_InvalidXmlException_QNAME, InvalidXmlException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIERepresentationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIERepresentationsResponse")
    public JAXBElement<GetIERepresentationsResponse> createGetIERepresentationsResponse(GetIERepresentationsResponse value) {
        return new JAXBElement<GetIERepresentationsResponse>(_GetIERepresentationsResponse_QNAME, GetIERepresentationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDNXResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateDNXResponse")
    public JAXBElement<UpdateDNXResponse> createUpdateDNXResponse(UpdateDNXResponse value) {
        return new JAXBElement<UpdateDNXResponse>(_UpdateDNXResponse_QNAME, UpdateDNXResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIEMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIEMDResponse")
    public JAXBElement<GetIEMDResponse> createGetIEMDResponse(GetIEMDResponse value) {
        return new JAXBElement<GetIEMDResponse>(_GetIEMDResponse_QNAME, GetIEMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMDByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMDByType")
    public JAXBElement<GetSharedMDByType> createGetSharedMDByType(GetSharedMDByType value) {
        return new JAXBElement<GetSharedMDByType>(_GetSharedMDByType_QNAME, GetSharedMDByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "deleteSharedMDResponse")
    public JAXBElement<DeleteSharedMDResponse> createDeleteSharedMDResponse(DeleteSharedMDResponse value) {
        return new JAXBElement<DeleteSharedMDResponse>(_DeleteSharedMDResponse_QNAME, DeleteSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateFixityEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "generateFixityEvent")
    public JAXBElement<GenerateFixityEvent> createGenerateFixityEvent(GenerateFixityEvent value) {
        return new JAXBElement<GenerateFixityEvent>(_GenerateFixityEvent_QNAME, GenerateFixityEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateSharedMD")
    public JAXBElement<UpdateSharedMD> createUpdateSharedMD(UpdateSharedMD value) {
        return new JAXBElement<UpdateSharedMD>(_UpdateSharedMD_QNAME, UpdateSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIEMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateIEMD")
    public JAXBElement<UpdateIEMD> createUpdateIEMD(UpdateIEMD value) {
        return new JAXBElement<UpdateIEMD>(_UpdateIEMD_QNAME, UpdateIEMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidMIDException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "InvalidMIDException")
    public JAXBElement<InvalidMIDException> createInvalidMIDException(InvalidMIDException value) {
        return new JAXBElement<InvalidMIDException>(_InvalidMIDException_QNAME, InvalidMIDException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIE")
    public JAXBElement<GetIE> createGetIE(GetIE value) {
        return new JAXBElement<GetIE>(_GetIE_QNAME, GetIE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMD")
    public JAXBElement<GetSharedMD> createGetSharedMD(GetSharedMD value) {
        return new JAXBElement<GetSharedMD>(_GetSharedMD_QNAME, GetSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRepresentationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "addRepresentationResponse")
    public JAXBElement<AddRepresentationResponse> createAddRepresentationResponse(AddRepresentationResponse value) {
        return new JAXBElement<AddRepresentationResponse>(_AddRepresentationResponse_QNAME, AddRepresentationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getMD")
    public JAXBElement<GetMD> createGetMD(GetMD value) {
        return new JAXBElement<GetMD>(_GetMD_QNAME, GetMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMDResponse")
    public JAXBElement<GetSharedMDResponse> createGetSharedMDResponse(GetSharedMDResponse value) {
        return new JAXBElement<GetSharedMDResponse>(_GetSharedMDResponse_QNAME, GetSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRipStatusInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getRipStatusInfoResponse")
    public JAXBElement<GetRipStatusInfoResponse> createGetRipStatusInfoResponse(GetRipStatusInfoResponse value) {
        return new JAXBElement<GetRipStatusInfoResponse>(_GetRipStatusInfoResponse_QNAME, GetRipStatusInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIEMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateIEMDResponse")
    public JAXBElement<UpdateIEMDResponse> createUpdateIEMDResponse(UpdateIEMDResponse value) {
        return new JAXBElement<UpdateIEMDResponse>(_UpdateIEMDResponse_QNAME, UpdateIEMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSharedMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "assignSharedMD")
    public JAXBElement<AssignSharedMD> createAssignSharedMD(AssignSharedMD value) {
        return new JAXBElement<AssignSharedMD>(_AssignSharedMD_QNAME, AssignSharedMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIEResponse")
    public JAXBElement<GetIEResponse> createGetIEResponse(GetIEResponse value) {
        return new JAXBElement<GetIEResponse>(_GetIEResponse_QNAME, GetIEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IEWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "IEWSException")
    public JAXBElement<IEWSException> createIEWSException(IEWSException value) {
        return new JAXBElement<IEWSException>(_IEWSException_QNAME, IEWSException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateRepresentation")
    public JAXBElement<UpdateRepresentation> createUpdateRepresentation(UpdateRepresentation value) {
        return new JAXBElement<UpdateRepresentation>(_UpdateRepresentation_QNAME, UpdateRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRipStatusInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getRipStatusInfo")
    public JAXBElement<GetRipStatusInfo> createGetRipStatusInfo(GetRipStatusInfo value) {
        return new JAXBElement<GetRipStatusInfo>(_GetRipStatusInfo_QNAME, GetRipStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIERepresentations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIERepresentations")
    public JAXBElement<GetIERepresentations> createGetIERepresentations(GetIERepresentations value) {
        return new JAXBElement<GetIERepresentations>(_GetIERepresentations_QNAME, GetIERepresentations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnassignSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "unassignSharedMDResponse")
    public JAXBElement<UnassignSharedMDResponse> createUnassignSharedMDResponse(UnassignSharedMDResponse value) {
        return new JAXBElement<UnassignSharedMDResponse>(_UnassignSharedMDResponse_QNAME, UnassignSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateSharedMDResponse")
    public JAXBElement<UpdateSharedMDResponse> createUpdateSharedMDResponse(UpdateSharedMDResponse value) {
        return new JAXBElement<UpdateSharedMDResponse>(_UpdateSharedMDResponse_QNAME, UpdateSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMDByMid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMDByMid")
    public JAXBElement<GetSharedMDByMid> createGetSharedMDByMid(GetSharedMDByMid value) {
        return new JAXBElement<GetSharedMDByMid>(_GetSharedMDByMid_QNAME, GetSharedMDByMid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateMDResponse")
    public JAXBElement<UpdateMDResponse> createUpdateMDResponse(UpdateMDResponse value) {
        return new JAXBElement<UpdateMDResponse>(_UpdateMDResponse_QNAME, UpdateMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHeartBitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getHeartBitResponse")
    public JAXBElement<GetHeartBitResponse> createGetHeartBitResponse(GetHeartBitResponse value) {
        return new JAXBElement<GetHeartBitResponse>(_GetHeartBitResponse_QNAME, GetHeartBitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getMDResponse")
    public JAXBElement<GetMDResponse> createGetMDResponse(GetMDResponse value) {
        return new JAXBElement<GetMDResponse>(_GetMDResponse_QNAME, GetMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIEMD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getIEMD")
    public JAXBElement<GetIEMD> createGetIEMD(GetIEMD value) {
        return new JAXBElement<GetIEMD>(_GetIEMD_QNAME, GetIEMD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignCMSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "assignCMSResponse")
    public JAXBElement<AssignCMSResponse> createAssignCMSResponse(AssignCMSResponse value) {
        return new JAXBElement<AssignCMSResponse>(_AssignCMSResponse_QNAME, AssignCMSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSharedMDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "assignSharedMDResponse")
    public JAXBElement<AssignSharedMDResponse> createAssignSharedMDResponse(AssignSharedMDResponse value) {
        return new JAXBElement<AssignSharedMDResponse>(_AssignSharedMDResponse_QNAME, AssignSharedMDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRepresentationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "updateRepresentationResponse")
    public JAXBElement<UpdateRepresentationResponse> createUpdateRepresentationResponse(UpdateRepresentationResponse value) {
        return new JAXBElement<UpdateRepresentationResponse>(_UpdateRepresentationResponse_QNAME, UpdateRepresentationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSharedMDByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getSharedMDByTypeResponse")
    public JAXBElement<GetSharedMDByTypeResponse> createGetSharedMDByTypeResponse(GetSharedMDByTypeResponse value) {
        return new JAXBElement<GetSharedMDByTypeResponse>(_GetSharedMDByTypeResponse_QNAME, GetSharedMDByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCMSSystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "InvalidCMSSystemException")
    public JAXBElement<InvalidCMSSystemException> createInvalidCMSSystemException(InvalidCMSSystemException value) {
        return new JAXBElement<InvalidCMSSystemException>(_InvalidCMSSystemException_QNAME, InvalidCMSSystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRipStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "getRipStatus")
    public JAXBElement<GetRipStatus> createGetRipStatus(GetRipStatus value) {
        return new JAXBElement<GetRipStatus>(_GetRipStatus_QNAME, GetRipStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRepresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "addRepresentation")
    public JAXBElement<AddRepresentation> createAddRepresentation(AddRepresentation value) {
        return new JAXBElement<AddRepresentation>(_AddRepresentation_QNAME, AddRepresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageIE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "manageIE")
    public JAXBElement<ManageIE> createManageIE(ManageIE value) {
        return new JAXBElement<ManageIE>(_ManageIE_QNAME, ManageIE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateFixityEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dps.exlibris.com/", name = "generateFixityEventResponse")
    public JAXBElement<GenerateFixityEventResponse> createGenerateFixityEventResponse(GenerateFixityEventResponse value) {
        return new JAXBElement<GenerateFixityEventResponse>(_GenerateFixityEventResponse_QNAME, GenerateFixityEventResponse.class, null, value);
    }

}
