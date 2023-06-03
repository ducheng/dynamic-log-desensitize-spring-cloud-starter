package com.ducheng.dynamic.log.desensitize.config;

import com.ducheng.dynamic.log.desensitize.utils.YmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public abstract class AbstractRefresher {

     @Autowired
     private YmlUtils ymlUtils;

    public void refresher(String content) {
        if (StringUtils.isBlank(content)) {
            log.warn("DynamicLog refresh, empty content.");
            return;
        }
        ymlUtils.reloadConfig(content);
    }
}


