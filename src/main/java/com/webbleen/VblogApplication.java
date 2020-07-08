package com.webbleen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VblogApplication {

    private static Logger logger = LoggerFactory.getLogger(VblogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(VblogApplication.class, args);
        logger.info("Spring Boot启动成功!!!!!!!!!!!!!!!!!!!!");
    }

}
