package com.codeWithAshith.SpringBasics.xml;

import com.codeWithAshith.SpringBasics.componentScan.SpringComponentScanApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringXmlApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {

        // Application Context
        ClassPathXmlApplicationContext applicationContext =
               new ClassPathXmlApplicationContext("applicationContext.xml");

        XmlDAO xmlDAO = applicationContext.getBean(XmlDAO.class);

        LOGGER.info("{}", xmlDAO);
        LOGGER.info("{}", xmlDAO.getJdbcXmlConnection());

        applicationContext.close();

    }

}
