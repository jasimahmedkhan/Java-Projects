package com.example.spring.basics.springin5steps.xml;

//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
// Inorder to have a new bean of JdbcConnection every time we try to access it from the parent class we need to configure
// a proxyMode with ScopedProxyMode.TARGET_CLASS
public class XmlBuisnessConnection {

    public XmlBuisnessConnection(){
        System.out.println("XML Business Connection");
        System.out.println("There is no Connection at the moment");
    }

}
