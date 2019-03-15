package org.gw.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @DATA 2019-02-28 00:17
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */

@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerProvider
{
    public static void main(String[] args)
    {
        SpringApplication.run(ZipkinServerProvider.class,args);
    }
}
