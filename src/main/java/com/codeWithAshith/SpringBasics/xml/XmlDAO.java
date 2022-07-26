package com.codeWithAshith.SpringBasics.xml;

import javax.inject.Inject;
import javax.inject.Named;

public class XmlDAO {

    JdbcXmlConnection jdbcXmlConnection;

    public JdbcXmlConnection getJdbcXmlConnection() {
        return jdbcXmlConnection;
    }

    public void setJdbcXmlConnection(JdbcXmlConnection jdbcXmlConnection) {
        this.jdbcXmlConnection = jdbcXmlConnection;
    }
}
