package com.codeWithAshith.SpringBasics.componentScan;

import com.codeWithAshith.SpringBasics.component.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.codeWithAshith.SpringBasics.component")
public class SpringComponentScanApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringComponentScanApplication.class, args);

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);
        LOGGER.info("{}", componentDAO.getJdbcConnection());

    }

}
