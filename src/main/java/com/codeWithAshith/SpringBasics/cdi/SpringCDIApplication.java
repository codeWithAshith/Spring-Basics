package com.codeWithAshith.SpringBasics.cdi;

import com.codeWithAshith.SpringBasics.basic.BinarySearchImpl;
import com.codeWithAshith.SpringBasics.componentScan.SpringComponentScanApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCDIApplication {

//    @Inject - @Autowired
//    @Names - @Component/@Qualifier
//    @Singleton - scope

    private static Logger LOGGER =
            LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringCDIApplication.class, args);

        // Application Context
        ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);

        CDIDAO cdidao = applicationContext.getBean(CDIDAO.class);

        LOGGER.info("{}", cdidao);
        LOGGER.info("{}", cdidao.getJdbcConnection());


    }

}
