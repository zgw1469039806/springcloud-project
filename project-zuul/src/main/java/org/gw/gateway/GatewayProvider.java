package org.gw.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @DATA 2019-03-01 14:54
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class GatewayProvider {

    public static void main(String[] args) {
        SpringApplication.run(GatewayProvider.class,args);
    }
}
