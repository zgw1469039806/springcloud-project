package org.gw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-03-17 15:24
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${test.name}")
    private String name;

    @RequestMapping("/test")
    public String test()
    {
        return name;
    }
}
