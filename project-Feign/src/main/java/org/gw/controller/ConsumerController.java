package org.gw.controller;

import org.gw.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-03-18 09:32
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RestController
public class ConsumerController
{
    @Autowired
    FeignService feignService;

    @RequestMapping("/comm")
    public String hello()
    {
       return feignService.hello();
    }
}
