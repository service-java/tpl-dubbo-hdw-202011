package com.hdw.server.notice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
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
@MapperScan("com.hdw.server.notice.mapper")
@EnableDubboConfig
public class ServiceNoticeProviderApplication extends SpringBootServletInitializer {

    protected final static Logger logger = LoggerFactory.getLogger(ServiceNoticeProviderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ServiceNoticeProviderApplication.class, args);
        logger.info("----ServerNoticeApplication start----");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        logger.info("----ServerNoticeApplication start----");
        return application.sources(ServiceNoticeProviderApplication.class);

    }

}
