package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: sell
 * @description:
 * @author: Mr.Liu
 * @create: 2018-11-09 10:53
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestLog {


    @Test
    public void test1(){
        String name = "djdjdjdjdj";
        log.debug("debug~~~~");
        log.info("info~~~~~ {}, ",name);
        log.error("error~~~~~");
    }

}
