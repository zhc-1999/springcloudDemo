package com.zhc.cloud.web.conteoller;

import com.zhc.cloud.service.TestDataService;
import com.zhc.cloud.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhc
 * @description 测试
 * @date 2021-12-25 02:07
 */
@RestController
@RefreshScope
@Slf4j
public class TestController {


    @Autowired
    private TestService testService;
    @Autowired
    private TestDataService testDataService;

    @GetMapping("test")
    public String test(){
        log.info("test");
        return testService.test();
    }
    @GetMapping("/test1")
    public String test1(){
        log.info("test1");
        return testDataService.select().toString();
    }
}