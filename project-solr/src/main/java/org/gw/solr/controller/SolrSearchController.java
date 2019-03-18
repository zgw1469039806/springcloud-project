package org.gw.solr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-02-27 20:40
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RestController
public class SolrSearchController {


    public static Logger logger= LoggerFactory.getLogger(SolrSearchController.class);
    @RequestMapping("/solrSearc")
    public String solrSearc(){
        System.out.println("进入solr方法");
        logger.info("执行查询、、、、");
        return "从solr查询到数据";
    }

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("访问solr");
        return "hello";
    }
}
