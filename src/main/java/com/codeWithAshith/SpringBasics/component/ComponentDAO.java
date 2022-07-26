package com.codeWithAshith.SpringBasics.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    JdbcComponentConnection jdbcComponentConnection;

    public JdbcComponentConnection getJdbcConnection() {
        return jdbcComponentConnection;
    }

    public void setJdbcConnection(JdbcComponentConnection jdbcComponentConnection) {
        this.jdbcComponentConnection = jdbcComponentConnection;
    }
}
