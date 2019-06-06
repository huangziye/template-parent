package com.hzy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: ziye_huang
 * @date: 2019/6/5
 */
@SpringBootApplication
public class App {

    private static Log log = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        log.info("start completed.");
    }

}
