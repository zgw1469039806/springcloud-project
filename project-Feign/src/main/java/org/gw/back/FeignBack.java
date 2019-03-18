package org.gw.back;

import org.gw.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @DATA 2019-03-18 09:51
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Component
public class FeignBack implements FeignService {
    @Override
    public String hello() {
        return "error";
    }
}
