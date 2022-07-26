package com.codeWithAshith.SpringBasics.complexScope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringComplexApplication {

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringComplexApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringComplexApplication.class, args);

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringComplexApplication.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

      LOGGER.info("{}", personDAO);
      LOGGER.info("{}", personDAO.getJdbcConnection());

      LOGGER.info("{}", personDAO1);
      LOGGER.info("{}", personDAO1.getJdbcConnection());


    }

}
