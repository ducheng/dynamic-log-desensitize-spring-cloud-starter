package com.ducheng.dynamic.log.desensitize.advice;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.FileAppender;


public class CustomerFileAppender extends FileAppender {

    @Override
    protected void subAppend(Object event) {
        DesensitizationAppender appender = new DesensitizationAppender();
        appender.operation((LoggingEvent) event);
        super.subAppend(event);
    }
}