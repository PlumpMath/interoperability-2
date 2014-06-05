
package com.aes.service.accounts.xxx;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aes.service.accounts.xxx package. 
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

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _IndexRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "IndexRequest");
    private final static QName _ExportResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "ExportResult");
    private final static QName _IndexResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "IndexResult");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _SearchResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "SearchResult");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _SearchPackageRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "SearchPackageRequest");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _SearchPackageResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "SearchPackageResult");
    private final static QName _SearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "SearchRequest");
    private final static QName _ExportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "ExportRequest");
    private final static QName _CreatePackageResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "CreatePackageResult");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _CreatePackageRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "CreatePackageRequest");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _IPMSearchPackageSearchPackageRequest_QNAME = new QName("http://tempuri.org/", "searchPackageRequest");
    private final static QName _CreatePackageRequestTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Template");
    private final static QName _CreatePackageRequestEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Event");
    private final static QName _CreatePackageRequestFieldValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "FieldValues");
    private final static QName _CreatePackageRequestStartEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "StartEvent");
    private final static QName _IPMCreatePackageResponseIPMCreatePackageResult_QNAME = new QName("http://tempuri.org/", "IPMCreatePackageResult");
    private final static QName _SearchResultXMLResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "XMLResults");
    private final static QName _SearchResultErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "ErrorMsg");
    private final static QName _IndexRequestStream_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Stream");
    private final static QName _IndexRequestFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "FileName");
    private final static QName _IndexRequestApplication_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Application");
    private final static QName _IndexRequestIndexes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Indexes");
    private final static QName _IndexRequestAppend_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "Append");
    private final static QName _IPMCreatePackageCreatePackageRequest_QNAME = new QName("http://tempuri.org/", "createPackageRequest");
    private final static QName _IPMIndexResponseIPMIndexResult_QNAME = new QName("http://tempuri.org/", "IPMIndexResult");
    private final static QName _IPMExportResponseIPMExportResult_QNAME = new QName("http://tempuri.org/", "IPMExportResult");
    private final static QName _IPMSearchSearchRequest_QNAME = new QName("http://tempuri.org/", "searchRequest");
    private final static QName _SearchPackageRequestXMLFieldValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "XMLFieldValues");
    private final static QName _IPMExportExportRequest_QNAME = new QName("http://tempuri.org/", "exportRequest");
    private final static QName _IndexResultXMLSystemFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "XMLSystemFields");
    private final static QName _SearchRequestXMLCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "XMLCriteria");
    private final static QName _IPMIndexIndexRequest_QNAME = new QName("http://tempuri.org/", "indexRequest");
    private final static QName _SearchPackageResultXMLResultFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", "XMLResultFields");
    private final static QName _IPMSearchPackageResponseIPMSearchPackageResult_QNAME = new QName("http://tempuri.org/", "IPMSearchPackageResult");
    private final static QName _IPMSearchResponseIPMSearchResult_QNAME = new QName("http://tempuri.org/", "IPMSearchResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aes.service.accounts.xxx
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IPMSearchPackage }
     * 
     */
    public IPMSearchPackage createIPMSearchPackage() {
        return new IPMSearchPackage();
    }

    /**
     * Create an instance of {@link CreatePackageRequest }
     * 
     */
    public CreatePackageRequest createCreatePackageRequest() {
        return new CreatePackageRequest();
    }

    /**
     * Create an instance of {@link IPMCreatePackageResponse }
     * 
     */
    public IPMCreatePackageResponse createIPMCreatePackageResponse() {
        return new IPMCreatePackageResponse();
    }

    /**
     * Create an instance of {@link IPMIndexResponse }
     * 
     */
    public IPMIndexResponse createIPMIndexResponse() {
        return new IPMIndexResponse();
    }

    /**
     * Create an instance of {@link IndexRequest }
     * 
     */
    public IndexRequest createIndexRequest() {
        return new IndexRequest();
    }

    /**
     * Create an instance of {@link IPMCreatePackage }
     * 
     */
    public IPMCreatePackage createIPMCreatePackage() {
        return new IPMCreatePackage();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link IPMExportResponse }
     * 
     */
    public IPMExportResponse createIPMExportResponse() {
        return new IPMExportResponse();
    }

    /**
     * Create an instance of {@link IPMSearch }
     * 
     */
    public IPMSearch createIPMSearch() {
        return new IPMSearch();
    }

    /**
     * Create an instance of {@link IPMExport }
     * 
     */
    public IPMExport createIPMExport() {
        return new IPMExport();
    }

    /**
     * Create an instance of {@link SearchPackageRequest }
     * 
     */
    public SearchPackageRequest createSearchPackageRequest() {
        return new SearchPackageRequest();
    }

    /**
     * Create an instance of {@link IndexResult }
     * 
     */
    public IndexResult createIndexResult() {
        return new IndexResult();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link CreatePackageResult }
     * 
     */
    public CreatePackageResult createCreatePackageResult() {
        return new CreatePackageResult();
    }

    /**
     * Create an instance of {@link IPMIndex }
     * 
     */
    public IPMIndex createIPMIndex() {
        return new IPMIndex();
    }

    /**
     * Create an instance of {@link SearchPackageResult }
     * 
     */
    public SearchPackageResult createSearchPackageResult() {
        return new SearchPackageResult();
    }

    /**
     * Create an instance of {@link IPMSearchPackageResponse }
     * 
     */
    public IPMSearchPackageResponse createIPMSearchPackageResponse() {
        return new IPMSearchPackageResponse();
    }

    /**
     * Create an instance of {@link ExportRequest }
     * 
     */
    public ExportRequest createExportRequest() {
        return new ExportRequest();
    }

    /**
     * Create an instance of {@link ExportResult }
     * 
     */
    public ExportResult createExportResult() {
        return new ExportResult();
    }

    /**
     * Create an instance of {@link IPMSearchResponse }
     * 
     */
    public IPMSearchResponse createIPMSearchResponse() {
        return new IPMSearchResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "IndexRequest")
    public JAXBElement<IndexRequest> createIndexRequest(IndexRequest value) {
        return new JAXBElement<IndexRequest>(_IndexRequest_QNAME, IndexRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ExportResult")
    public JAXBElement<ExportResult> createExportResult(ExportResult value) {
        return new JAXBElement<ExportResult>(_ExportResult_QNAME, ExportResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "IndexResult")
    public JAXBElement<IndexResult> createIndexResult(IndexResult value) {
        return new JAXBElement<IndexResult>(_IndexResult_QNAME, IndexResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "SearchResult")
    public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "SearchPackageRequest")
    public JAXBElement<SearchPackageRequest> createSearchPackageRequest(SearchPackageRequest value) {
        return new JAXBElement<SearchPackageRequest>(_SearchPackageRequest_QNAME, SearchPackageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "SearchPackageResult")
    public JAXBElement<SearchPackageResult> createSearchPackageResult(SearchPackageResult value) {
        return new JAXBElement<SearchPackageResult>(_SearchPackageResult_QNAME, SearchPackageResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "SearchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ExportRequest")
    public JAXBElement<ExportRequest> createExportRequest(ExportRequest value) {
        return new JAXBElement<ExportRequest>(_ExportRequest_QNAME, ExportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePackageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "CreatePackageResult")
    public JAXBElement<CreatePackageResult> createCreatePackageResult(CreatePackageResult value) {
        return new JAXBElement<CreatePackageResult>(_CreatePackageResult_QNAME, CreatePackageResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePackageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "CreatePackageRequest")
    public JAXBElement<CreatePackageRequest> createCreatePackageRequest(CreatePackageRequest value) {
        return new JAXBElement<CreatePackageRequest>(_CreatePackageRequest_QNAME, CreatePackageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchPackageRequest", scope = IPMSearchPackage.class)
    public JAXBElement<SearchPackageRequest> createIPMSearchPackageSearchPackageRequest(SearchPackageRequest value) {
        return new JAXBElement<SearchPackageRequest>(_IPMSearchPackageSearchPackageRequest_QNAME, SearchPackageRequest.class, IPMSearchPackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Template", scope = CreatePackageRequest.class)
    public JAXBElement<String> createCreatePackageRequestTemplate(String value) {
        return new JAXBElement<String>(_CreatePackageRequestTemplate_QNAME, String.class, CreatePackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Event", scope = CreatePackageRequest.class)
    public JAXBElement<String> createCreatePackageRequestEvent(String value) {
        return new JAXBElement<String>(_CreatePackageRequestEvent_QNAME, String.class, CreatePackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "FieldValues", scope = CreatePackageRequest.class)
    public JAXBElement<String> createCreatePackageRequestFieldValues(String value) {
        return new JAXBElement<String>(_CreatePackageRequestFieldValues_QNAME, String.class, CreatePackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "StartEvent", scope = CreatePackageRequest.class)
    public JAXBElement<String> createCreatePackageRequestStartEvent(String value) {
        return new JAXBElement<String>(_CreatePackageRequestStartEvent_QNAME, String.class, CreatePackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePackageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPMCreatePackageResult", scope = IPMCreatePackageResponse.class)
    public JAXBElement<CreatePackageResult> createIPMCreatePackageResponseIPMCreatePackageResult(CreatePackageResult value) {
        return new JAXBElement<CreatePackageResult>(_IPMCreatePackageResponseIPMCreatePackageResult_QNAME, CreatePackageResult.class, IPMCreatePackageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ExportResult", scope = SearchResult.class)
    public JAXBElement<ExportResult> createSearchResultExportResult(ExportResult value) {
        return new JAXBElement<ExportResult>(_ExportResult_QNAME, ExportResult.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLResults", scope = SearchResult.class)
    public JAXBElement<String> createSearchResultXMLResults(String value) {
        return new JAXBElement<String>(_SearchResultXMLResults_QNAME, String.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ErrorMsg", scope = SearchResult.class)
    public JAXBElement<String> createSearchResultErrorMsg(String value) {
        return new JAXBElement<String>(_SearchResultErrorMsg_QNAME, String.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Stream", scope = IndexRequest.class)
    public JAXBElement<byte[]> createIndexRequestStream(byte[] value) {
        return new JAXBElement<byte[]>(_IndexRequestStream_QNAME, byte[].class, IndexRequest.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "FileName", scope = IndexRequest.class)
    public JAXBElement<String> createIndexRequestFileName(String value) {
        return new JAXBElement<String>(_IndexRequestFileName_QNAME, String.class, IndexRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Application", scope = IndexRequest.class)
    public JAXBElement<String> createIndexRequestApplication(String value) {
        return new JAXBElement<String>(_IndexRequestApplication_QNAME, String.class, IndexRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Indexes", scope = IndexRequest.class)
    public JAXBElement<String> createIndexRequestIndexes(String value) {
        return new JAXBElement<String>(_IndexRequestIndexes_QNAME, String.class, IndexRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Append", scope = IndexRequest.class)
    public JAXBElement<String> createIndexRequestAppend(String value) {
        return new JAXBElement<String>(_IndexRequestAppend_QNAME, String.class, IndexRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePackageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "createPackageRequest", scope = IPMCreatePackage.class)
    public JAXBElement<CreatePackageRequest> createIPMCreatePackageCreatePackageRequest(CreatePackageRequest value) {
        return new JAXBElement<CreatePackageRequest>(_IPMCreatePackageCreatePackageRequest_QNAME, CreatePackageRequest.class, IPMCreatePackage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPMIndexResult", scope = IPMIndexResponse.class)
    public JAXBElement<IndexResult> createIPMIndexResponseIPMIndexResult(IndexResult value) {
        return new JAXBElement<IndexResult>(_IPMIndexResponseIPMIndexResult_QNAME, IndexResult.class, IPMIndexResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPMExportResult", scope = IPMExportResponse.class)
    public JAXBElement<ExportResult> createIPMExportResponseIPMExportResult(ExportResult value) {
        return new JAXBElement<ExportResult>(_IPMExportResponseIPMExportResult_QNAME, ExportResult.class, IPMExportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchRequest", scope = IPMSearch.class)
    public JAXBElement<SearchRequest> createIPMSearchSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_IPMSearchSearchRequest_QNAME, SearchRequest.class, IPMSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Template", scope = SearchPackageRequest.class)
    public JAXBElement<String> createSearchPackageRequestTemplate(String value) {
        return new JAXBElement<String>(_CreatePackageRequestTemplate_QNAME, String.class, SearchPackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLFieldValues", scope = SearchPackageRequest.class)
    public JAXBElement<String> createSearchPackageRequestXMLFieldValues(String value) {
        return new JAXBElement<String>(_SearchPackageRequestXMLFieldValues_QNAME, String.class, SearchPackageRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "exportRequest", scope = IPMExport.class)
    public JAXBElement<ExportRequest> createIPMExportExportRequest(ExportRequest value) {
        return new JAXBElement<ExportRequest>(_IPMExportExportRequest_QNAME, ExportRequest.class, IPMExport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLSystemFields", scope = IndexResult.class)
    public JAXBElement<String> createIndexResultXMLSystemFields(String value) {
        return new JAXBElement<String>(_IndexResultXMLSystemFields_QNAME, String.class, IndexResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ErrorMsg", scope = IndexResult.class)
    public JAXBElement<String> createIndexResultErrorMsg(String value) {
        return new JAXBElement<String>(_SearchResultErrorMsg_QNAME, String.class, IndexResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLCriteria", scope = SearchRequest.class)
    public JAXBElement<String> createSearchRequestXMLCriteria(String value) {
        return new JAXBElement<String>(_SearchRequestXMLCriteria_QNAME, String.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Application", scope = SearchRequest.class)
    public JAXBElement<String> createSearchRequestApplication(String value) {
        return new JAXBElement<String>(_IndexRequestApplication_QNAME, String.class, SearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLSystemFields", scope = CreatePackageResult.class)
    public JAXBElement<String> createCreatePackageResultXMLSystemFields(String value) {
        return new JAXBElement<String>(_IndexResultXMLSystemFields_QNAME, String.class, CreatePackageResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ErrorMsg", scope = CreatePackageResult.class)
    public JAXBElement<String> createCreatePackageResultErrorMsg(String value) {
        return new JAXBElement<String>(_SearchResultErrorMsg_QNAME, String.class, CreatePackageResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndexRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "indexRequest", scope = IPMIndex.class)
    public JAXBElement<IndexRequest> createIPMIndexIndexRequest(IndexRequest value) {
        return new JAXBElement<IndexRequest>(_IPMIndexIndexRequest_QNAME, IndexRequest.class, IPMIndex.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLResultFields", scope = SearchPackageResult.class)
    public JAXBElement<String> createSearchPackageResultXMLResultFields(String value) {
        return new JAXBElement<String>(_SearchPackageResultXMLResultFields_QNAME, String.class, SearchPackageResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ErrorMsg", scope = SearchPackageResult.class)
    public JAXBElement<String> createSearchPackageResultErrorMsg(String value) {
        return new JAXBElement<String>(_SearchResultErrorMsg_QNAME, String.class, SearchPackageResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPackageResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPMSearchPackageResult", scope = IPMSearchPackageResponse.class)
    public JAXBElement<SearchPackageResult> createIPMSearchPackageResponseIPMSearchPackageResult(SearchPackageResult value) {
        return new JAXBElement<SearchPackageResult>(_IPMSearchPackageResponseIPMSearchPackageResult_QNAME, SearchPackageResult.class, IPMSearchPackageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "XMLSystemFields", scope = ExportRequest.class)
    public JAXBElement<String> createExportRequestXMLSystemFields(String value) {
        return new JAXBElement<String>(_IndexResultXMLSystemFields_QNAME, String.class, ExportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "Stream", scope = ExportResult.class)
    public JAXBElement<byte[]> createExportResultStream(byte[] value) {
        return new JAXBElement<byte[]>(_IndexRequestStream_QNAME, byte[].class, ExportResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "FileName", scope = ExportResult.class)
    public JAXBElement<String> createExportResultFileName(String value) {
        return new JAXBElement<String>(_IndexRequestFileName_QNAME, String.class, ExportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Tandem.Bolivar.WCF.WSIPM", name = "ErrorMsg", scope = ExportResult.class)
    public JAXBElement<String> createExportResultErrorMsg(String value) {
        return new JAXBElement<String>(_SearchResultErrorMsg_QNAME, String.class, ExportResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPMSearchResult", scope = IPMSearchResponse.class)
    public JAXBElement<SearchResult> createIPMSearchResponseIPMSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_IPMSearchResponseIPMSearchResult_QNAME, SearchResult.class, IPMSearchResponse.class, value);
    }

}
