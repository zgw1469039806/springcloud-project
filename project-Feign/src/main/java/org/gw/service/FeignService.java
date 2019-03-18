package org.gw.service;

import org.gw.back.FeignBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-03-18 09:27
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient(value = "project-solr",fallback = FeignBack.class)
public interface FeignService
{
    @RequestMapping("/hello")
    String hello();
}
