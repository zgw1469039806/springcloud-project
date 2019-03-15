package org.gw.reigster.conter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @DATA 2019-02-27 19:56
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */

@EnableEurekaServer
@SpringBootApplication
public class ReigsterConterProvider {
    public static void main(String[] args) {
        SpringApplication.run(ReigsterConterProvider.class, args);
    }
}
