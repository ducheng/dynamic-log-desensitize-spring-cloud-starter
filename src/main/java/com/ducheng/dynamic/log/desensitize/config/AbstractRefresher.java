package com.ducheng.dynamic.log.desensitize.config;

import com.alibaba.nacos.common.utils.StringUtils;
import com.ducheng.dynamic.log.desensitize.utils.YmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public abstract class AbstractRefresher {

     @Autowired
     private YmlUtils ymlUtils;

    public void refresher(String content) {
        if (StringUtils.isBlank(content)) {
            log.warn("DynamicTp refresh, empty content.");
            return;
        }
        ymlUtils.reloadConfig(content);
    }
}


