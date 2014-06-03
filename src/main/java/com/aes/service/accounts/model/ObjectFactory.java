
package com.aes.service.accounts.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aes.service.accounts.model package. 
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

    private final static QName _CardSel_QNAME = new QName("http://www.aes.com/xs/modelo", "CardSel");
    private final static QName _CardStatusModRs_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatusModRs");
    private final static QName _AcctRec_QNAME = new QName("http://www.aes.com/xs/modelo", "AcctRec");
    private final static QName _Severity_QNAME = new QName("http://www.aes.com/xs/modelo", "Severity");
    private final static QName _MsgRqHdr_QNAME = new QName("http://www.aes.com/xs/modelo", "MsgRqHdr");
    private final static QName _OrigDt_QNAME = new QName("http://www.aes.com/xs/modelo", "OrigDt");
    private final static QName _CardNum_QNAME = new QName("http://www.aes.com/xs/modelo", "CardNum");
    private final static QName _RqUID_QNAME = new QName("http://www.aes.com/xs/modelo", "RqUID");
    private final static QName _StatusCode_QNAME = new QName("http://www.aes.com/xs/modelo", "StatusCode");
    private final static QName _CustId_QNAME = new QName("http://www.aes.com/xs/modelo", "CustId");
    private final static QName _ContextRqHdr_QNAME = new QName("http://www.aes.com/xs/modelo", "ContextRqHdr");
    private final static QName _CardStatusCode_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatusCode");
    private final static QName _StartDt_QNAME = new QName("http://www.aes.com/xs/modelo", "StartDt");
    private final static QName _CurCode_QNAME = new QName("http://www.aes.com/xs/modelo", "CurCode");
    private final static QName _TotalCurAmt_QNAME = new QName("http://www.aes.com/xs/modelo", "TotalCurAmt");
    private final static QName _AcctTrnSel_QNAME = new QName("http://www.aes.com/xs/modelo", "AcctTrnSel");
    private final static QName _StatusDesc_QNAME = new QName("http://www.aes.com/xs/modelo", "StatusDesc");
    private final static QName _ModCardStatusResponse_QNAME = new QName("http://com/aes/service/accounts/CardFraudulent", "modCardStatusResponse");
    private final static QName _StatusReason_QNAME = new QName("http://www.aes.com/xs/modelo", "StatusReason");
    private final static QName _Status_QNAME = new QName("http://www.aes.com/xs/modelo", "Status");
    private final static QName _ServerStatusCode_QNAME = new QName("http://www.aes.com/xs/modelo", "ServerStatusCode");
    private final static QName _GovIssueIdentType_QNAME = new QName("http://www.aes.com/xs/modelo", "GovIssueIdentType");
    private final static QName _AcctTrnInfo_QNAME = new QName("http://www.aes.com/xs/modelo", "AcctTrnInfo");
    private final static QName _CardStatus_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatus");
    private final static QName _DtRange_QNAME = new QName("http://www.aes.com/xs/modelo", "DtRange");
    private final static QName _AcctTrnRec_QNAME = new QName("http://www.aes.com/xs/modelo", "AcctTrnRec");
    private final static QName _GovIssueIdent_QNAME = new QName("http://www.aes.com/xs/modelo", "GovIssueIdent");
    private final static QName _IdentSerialNum_QNAME = new QName("http://www.aes.com/xs/modelo", "IdentSerialNum");
    private final static QName _CardStatusAction_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatusAction");
    private final static QName _CardStatusRec_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatusRec");
    private final static QName _Amt_QNAME = new QName("http://www.aes.com/xs/modelo", "Amt");
    private final static QName _CardKeys_QNAME = new QName("http://www.aes.com/xs/modelo", "CardKeys");
    private final static QName _ClientDt_QNAME = new QName("http://www.aes.com/xs/modelo", "ClientDt");
    private final static QName _EndDt_QNAME = new QName("http://www.aes.com/xs/modelo", "EndDt");
    private final static QName _CardStatusModRq_QNAME = new QName("http://www.aes.com/xs/modelo", "CardStatusModRq");
    private final static QName _ModCardStatusRequest_QNAME = new QName("http://com/aes/service/accounts/CardFraudulent", "modCardStatusRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aes.service.accounts.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModCardStatusOutput }
     * 
     */
    public ModCardStatusOutput createModCardStatusOutput() {
        return new ModCardStatusOutput();
    }

    /**
     * Create an instance of {@link AcctRecType }
     * 
     */
    public AcctRecType createAcctRecType() {
        return new AcctRecType();
    }

    /**
     * Create an instance of {@link GovIssueIdentType }
     * 
     */
    public GovIssueIdentType createGovIssueIdentType() {
        return new GovIssueIdentType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link CardStatusType }
     * 
     */
    public CardStatusType createCardStatusType() {
        return new CardStatusType();
    }

    /**
     * Create an instance of {@link AcctTrnSelType }
     * 
     */
    public AcctTrnSelType createAcctTrnSelType() {
        return new AcctTrnSelType();
    }

    /**
     * Create an instance of {@link CardStatusModRsType }
     * 
     */
    public CardStatusModRsType createCardStatusModRsType() {
        return new CardStatusModRsType();
    }

    /**
     * Create an instance of {@link CardStatusModRqType }
     * 
     */
    public CardStatusModRqType createCardStatusModRqType() {
        return new CardStatusModRqType();
    }

    /**
     * Create an instance of {@link AcctTrnRecType }
     * 
     */
    public AcctTrnRecType createAcctTrnRecType() {
        return new AcctTrnRecType();
    }

    /**
     * Create an instance of {@link CardStatusRecType }
     * 
     */
    public CardStatusRecType createCardStatusRecType() {
        return new CardStatusRecType();
    }

    /**
     * Create an instance of {@link DtRangeType }
     * 
     */
    public DtRangeType createDtRangeType() {
        return new DtRangeType();
    }

    /**
     * Create an instance of {@link ModCardStatusOut }
     * 
     */
    public ModCardStatusOut createModCardStatusOut() {
        return new ModCardStatusOut();
    }

    /**
     * Create an instance of {@link CardSelType }
     * 
     */
    public CardSelType createCardSelType() {
        return new CardSelType();
    }

    /**
     * Create an instance of {@link AcctTrnInfoType }
     * 
     */
    public AcctTrnInfoType createAcctTrnInfoType() {
        return new AcctTrnInfoType();
    }

    /**
     * Create an instance of {@link ModCardStatusInp }
     * 
     */
    public ModCardStatusInp createModCardStatusInp() {
        return new ModCardStatusInp();
    }

    /**
     * Create an instance of {@link MsgRqHdrType }
     * 
     */
    public MsgRqHdrType createMsgRqHdrType() {
        return new MsgRqHdrType();
    }

    /**
     * Create an instance of {@link TotalCurAmtType }
     * 
     */
    public TotalCurAmtType createTotalCurAmtType() {
        return new TotalCurAmtType();
    }

    /**
     * Create an instance of {@link ContextRqHdrType }
     * 
     */
    public ContextRqHdrType createContextRqHdrType() {
        return new ContextRqHdrType();
    }

    /**
     * Create an instance of {@link CustIdType }
     * 
     */
    public CustIdType createCustIdType() {
        return new CustIdType();
    }

    /**
     * Create an instance of {@link CardKeysType }
     * 
     */
    public CardKeysType createCardKeysType() {
        return new CardKeysType();
    }

    /**
     * Create an instance of {@link ModCardStatusInput }
     * 
     */
    public ModCardStatusInput createModCardStatusInput() {
        return new ModCardStatusInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardSel")
    public JAXBElement<CardSelType> createCardSel(CardSelType value) {
        return new JAXBElement<CardSelType>(_CardSel_QNAME, CardSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusModRsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatusModRs")
    public JAXBElement<CardStatusModRsType> createCardStatusModRs(CardStatusModRsType value) {
        return new JAXBElement<CardStatusModRsType>(_CardStatusModRs_QNAME, CardStatusModRsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "AcctRec")
    public JAXBElement<AcctRecType> createAcctRec(AcctRecType value) {
        return new JAXBElement<AcctRecType>(_AcctRec_QNAME, AcctRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "Severity")
    public JAXBElement<String> createSeverity(String value) {
        return new JAXBElement<String>(_Severity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "MsgRqHdr")
    public JAXBElement<MsgRqHdrType> createMsgRqHdr(MsgRqHdrType value) {
        return new JAXBElement<MsgRqHdrType>(_MsgRqHdr_QNAME, MsgRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "OrigDt")
    public JAXBElement<String> createOrigDt(String value) {
        return new JAXBElement<String>(_OrigDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardNum")
    public JAXBElement<String> createCardNum(String value) {
        return new JAXBElement<String>(_CardNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "RqUID")
    public JAXBElement<String> createRqUID(String value) {
        return new JAXBElement<String>(_RqUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "StatusCode")
    public JAXBElement<Long> createStatusCode(Long value) {
        return new JAXBElement<Long>(_StatusCode_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CustId")
    public JAXBElement<CustIdType> createCustId(CustIdType value) {
        return new JAXBElement<CustIdType>(_CustId_QNAME, CustIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContextRqHdrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "ContextRqHdr")
    public JAXBElement<ContextRqHdrType> createContextRqHdr(ContextRqHdrType value) {
        return new JAXBElement<ContextRqHdrType>(_ContextRqHdr_QNAME, ContextRqHdrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatusCode")
    public JAXBElement<String> createCardStatusCode(String value) {
        return new JAXBElement<String>(_CardStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "StartDt")
    public JAXBElement<XMLGregorianCalendar> createStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CurCode")
    public JAXBElement<String> createCurCode(String value) {
        return new JAXBElement<String>(_CurCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCurAmtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "TotalCurAmt")
    public JAXBElement<TotalCurAmtType> createTotalCurAmt(TotalCurAmtType value) {
        return new JAXBElement<TotalCurAmtType>(_TotalCurAmt_QNAME, TotalCurAmtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnSelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "AcctTrnSel")
    public JAXBElement<AcctTrnSelType> createAcctTrnSel(AcctTrnSelType value) {
        return new JAXBElement<AcctTrnSelType>(_AcctTrnSel_QNAME, AcctTrnSelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "StatusDesc")
    public JAXBElement<String> createStatusDesc(String value) {
        return new JAXBElement<String>(_StatusDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModCardStatusOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/aes/service/accounts/CardFraudulent", name = "modCardStatusResponse")
    public JAXBElement<ModCardStatusOutput> createModCardStatusResponse(ModCardStatusOutput value) {
        return new JAXBElement<ModCardStatusOutput>(_ModCardStatusResponse_QNAME, ModCardStatusOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "StatusReason")
    public JAXBElement<String> createStatusReason(String value) {
        return new JAXBElement<String>(_StatusReason_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "ServerStatusCode")
    public JAXBElement<String> createServerStatusCode(String value) {
        return new JAXBElement<String>(_ServerStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "GovIssueIdentType")
    public JAXBElement<String> createGovIssueIdentType(String value) {
        return new JAXBElement<String>(_GovIssueIdentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "AcctTrnInfo")
    public JAXBElement<AcctTrnInfoType> createAcctTrnInfo(AcctTrnInfoType value) {
        return new JAXBElement<AcctTrnInfoType>(_AcctTrnInfo_QNAME, AcctTrnInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatus")
    public JAXBElement<CardStatusType> createCardStatus(CardStatusType value) {
        return new JAXBElement<CardStatusType>(_CardStatus_QNAME, CardStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "DtRange")
    public JAXBElement<DtRangeType> createDtRange(DtRangeType value) {
        return new JAXBElement<DtRangeType>(_DtRange_QNAME, DtRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcctTrnRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "AcctTrnRec")
    public JAXBElement<AcctTrnRecType> createAcctTrnRec(AcctTrnRecType value) {
        return new JAXBElement<AcctTrnRecType>(_AcctTrnRec_QNAME, AcctTrnRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GovIssueIdentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "GovIssueIdent")
    public JAXBElement<GovIssueIdentType> createGovIssueIdent(GovIssueIdentType value) {
        return new JAXBElement<GovIssueIdentType>(_GovIssueIdent_QNAME, GovIssueIdentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "IdentSerialNum")
    public JAXBElement<String> createIdentSerialNum(String value) {
        return new JAXBElement<String>(_IdentSerialNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatusAction")
    public JAXBElement<String> createCardStatusAction(String value) {
        return new JAXBElement<String>(_CardStatusAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusRecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatusRec")
    public JAXBElement<CardStatusRecType> createCardStatusRec(CardStatusRecType value) {
        return new JAXBElement<CardStatusRecType>(_CardStatusRec_QNAME, CardStatusRecType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "Amt")
    public JAXBElement<BigDecimal> createAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Amt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardKeys")
    public JAXBElement<CardKeysType> createCardKeys(CardKeysType value) {
        return new JAXBElement<CardKeysType>(_CardKeys_QNAME, CardKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "ClientDt")
    public JAXBElement<String> createClientDt(String value) {
        return new JAXBElement<String>(_ClientDt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "EndDt")
    public JAXBElement<XMLGregorianCalendar> createEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatusModRqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aes.com/xs/modelo", name = "CardStatusModRq")
    public JAXBElement<CardStatusModRqType> createCardStatusModRq(CardStatusModRqType value) {
        return new JAXBElement<CardStatusModRqType>(_CardStatusModRq_QNAME, CardStatusModRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModCardStatusInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/aes/service/accounts/CardFraudulent", name = "modCardStatusRequest")
    public JAXBElement<ModCardStatusInput> createModCardStatusRequest(ModCardStatusInput value) {
        return new JAXBElement<ModCardStatusInput>(_ModCardStatusRequest_QNAME, ModCardStatusInput.class, null, value);
    }

}
