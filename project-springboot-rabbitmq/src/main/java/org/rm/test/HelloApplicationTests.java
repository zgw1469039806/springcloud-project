package org.rm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rm.controller.SendController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @DATA 2019-03-15 11:28
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Component
public class HelloApplicationTests {

    @Autowired
    private SendController sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
