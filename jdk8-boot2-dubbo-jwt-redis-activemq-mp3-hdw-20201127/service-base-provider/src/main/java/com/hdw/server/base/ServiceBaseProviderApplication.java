package com.hdw.server.base;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * @author JacksonTu
 * @description Application
 * @date 2017年9月5日下午8:55:08
 */
@SpringBootApplication
@MapperScan("com.hdw.server.base.*.mapper")
public class ServiceBaseProviderApplication extends SpringBootServletInitializer {

    protected final static Logger logger = LoggerFactory.getLogger(ServiceBaseProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceBaseProviderApplication.class, args);
        logger.info("----ServerBaseApplication start----");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("----ServerBaseApplication start----");
        return application.sources(ServiceBaseProviderApplication.class);

    }

}
