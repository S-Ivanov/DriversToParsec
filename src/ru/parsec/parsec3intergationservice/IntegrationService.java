
package ru.parsec.parsec3intergationservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IntegrationService", targetNamespace = "http://parsec.ru/Parsec3IntergationService", wsdlLocation = "file:/C:/\u041f\u0440\u043e\u0435\u043a\u0442\u044b/\u041f\u0430\u0440\u0441\u0435\u043a/DriversToParsec/IntegrationService.wsdl")
public class IntegrationService
    extends Service
{

    private final static URL INTEGRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTEGRATIONSERVICE_EXCEPTION;
    private final static QName INTEGRATIONSERVICE_QNAME = new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/\u041f\u0440\u043e\u0435\u043a\u0442\u044b/\u041f\u0430\u0440\u0441\u0435\u043a/DriversToParsec/IntegrationService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTEGRATIONSERVICE_WSDL_LOCATION = url;
        INTEGRATIONSERVICE_EXCEPTION = e;
    }

    public IntegrationService() {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IntegrationServiceSoap
     */
    @WebEndpoint(name = "IntegrationServiceSoap")
    public IntegrationServiceSoap getIntegrationServiceSoap() {
        return super.getPort(new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationServiceSoap"), IntegrationServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationServiceSoap
     */
    @WebEndpoint(name = "IntegrationServiceSoap")
    public IntegrationServiceSoap getIntegrationServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationServiceSoap"), IntegrationServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTEGRATIONSERVICE_EXCEPTION!= null) {
            throw INTEGRATIONSERVICE_EXCEPTION;
        }
        return INTEGRATIONSERVICE_WSDL_LOCATION;
    }

}
