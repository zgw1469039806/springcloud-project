package org.gw.shopping.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @DATA 2019-02-27 20:24
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class ShoppingMallProvider {
    @LoadBalanced
    @Bean
    public RestTemplate resultTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }


    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallProvider.class, args);
    }
}
