package com.example.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SomeExternalService {

    // some property file
    @Value("${external.service.url}")
    private String url;

    @Value("${external.service.url.spring-framework}")
    private String springUrl;

    public String returnServiceURL(){
        return url;
    }

    public String returnServiceSpringUrl(){
        return springUrl;
    }

}
