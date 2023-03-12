package com.ducheng.dynamic.log.desensitize;

import com.ducheng.dynamic.log.desensitize.test.TestUser;
import com.ducheng.dynamic.log.desensitize.utils.YmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@SpringBootApplication
@RestController
@RequestMapping("/")
@Slf4j
public class DynamicLogDesensitizeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicLogDesensitizeApplication.class);
    }

    @GetMapping("/index")
    public String index() {
        Map<String, Object> patternMap = YmlUtils.patternMap;
        Set<Map.Entry<String, Object>> entries = patternMap.entrySet();
        entries.forEach(x-> {
            System.out.println("key ="+x.getKey().toString()+"value="+x.getValue());
        });
        return "1000";
    }

    @GetMapping("/test")
    public String tes() {
        TestUser testUser = new TestUser();
        testUser.setEnName("我是大王");
        testUser.setIdCard("301237199912020434");
        testUser.setName("我是大王");
        log.info("testUser:{}",testUser);
        return "1000";
    }
}
