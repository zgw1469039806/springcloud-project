package org.gw.shopping.mall.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import javafx.beans.DefaultProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @DATA 2019-02-27 20:45
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RestController
@DefaultProperties(defaultFallback = "backmethod")
public class ShopController {

    private static Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand
    @RequestMapping("/twoIndex")
    public String twoIndex() {
        System.out.println("进入twoIndex------");
        return "/index";
    }

    //指定返回
    @HystrixCommand(fallbackMethod = "backmethod")
    @RequestMapping("/toIndex")
    public String toIndex(Model model) {
        System.out.println("进入toIndex----------");
        logger.info("执行了查询，开始调用solr服务");
        String msg = restTemplate.getForEntity("http://PROJECT-SOLR/solrSearc", String.class).getBody();
        logger.info("执行调用微服务结束");
        model.addAttribute("msg", msg);
        return "/index";
    }

    /**
     * 回路方法,参数一样，返回值一样
     */
    public String backmethod(Model model) {
        System.out.println("进入backmethod回路-----");
        model.addAttribute("msg", "服务不可用，请稍后重试!!!");
        return "/index";
    }

    @ResponseBody
    public String deFallback() {
        return "全局返回";
    }
}
