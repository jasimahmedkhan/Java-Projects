package com.example.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class XmlPersonDAO {
//    @Autowired
    XmlJdbcConnection xmlJdbcConnection;

    XmlBuisnessConnection xmlBuisnessConnection;

    private int numEmployees;

    public XmlBuisnessConnection getXmlBuisnessConnection() {
        return xmlBuisnessConnection;
    }

    public void setXmlBuisnessConnection(XmlBuisnessConnection xmlBuisnessConnection){
        this.xmlBuisnessConnection = xmlBuisnessConnection;
    }

    public XmlPersonDAO(){
        this.numEmployees = 0;
    }

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public void setNumberOfEmployees(int numEmployees){
        this.numEmployees = numEmployees;
    }

    public int getNumberOfEmployees(){
        return this.numEmployees;
    }

}
