package com.ducheng.dynamic.log.desensitize.config;

import com.ducheng.dynamic.log.desensitize.utils.YmlUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoDynamicLogConfig {

    @Bean
    public NacosRefresher getNacosRefresher(){
        return  new NacosRefresher();
    }

    @Bean
    public YmlUtils getYmlUtils(){
        return  new YmlUtils();
    }
}
