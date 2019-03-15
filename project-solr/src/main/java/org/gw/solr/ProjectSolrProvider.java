package org.gw.solr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @DATA 2019-02-27 20:38
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */

@EnableEurekaClient
@SpringBootApplication
public class ProjectSolrProvider {
    public static void main(String[] args) {
        SpringApplication.run(ProjectSolrProvider.class, args);
    }
}
