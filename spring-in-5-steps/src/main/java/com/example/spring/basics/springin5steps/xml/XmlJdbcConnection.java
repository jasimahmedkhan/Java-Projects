package com.example.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
// Inorder to have a new bean of JdbcConnection every time we try to access it from the parent class we need to configure
// a proxyMode with ScopedProxyMode.TARGET_CLASS
public class XmlJdbcConnection {

    public XmlJdbcConnection(){
        System.out.println("XML JDBC Connection");
    }

}
