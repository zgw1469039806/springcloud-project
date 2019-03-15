package org.gd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @DATA 2019-03-11 09:10
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigConter {
    public static void main(String[] args) {
        SpringApplication.run(ConfigConter.class, args);
    }
}
