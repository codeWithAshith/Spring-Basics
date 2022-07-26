package com.codeWithAshith.SpringBasics.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDIDAO {

    @Inject
    JdbcCDIConnection jdbcCDIConnection;

    public JdbcCDIConnection getJdbcConnection() {
        return jdbcCDIConnection;
    }

    public void setJdbcConnection(JdbcCDIConnection jdbcCDIConnection) {
        this.jdbcCDIConnection = jdbcCDIConnection;
    }
}
