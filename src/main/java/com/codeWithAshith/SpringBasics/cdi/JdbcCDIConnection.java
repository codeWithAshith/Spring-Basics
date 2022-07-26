package com.codeWithAshith.SpringBasics.cdi;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class JdbcCDIConnection {

    public JdbcCDIConnection() {
        System.out.println("JDBC Connection");
    }
}
