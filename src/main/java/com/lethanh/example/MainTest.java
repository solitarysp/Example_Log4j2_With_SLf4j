package com.lethanh.example;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Slf4j
public class MainTest {
    public static void main(String[] args) {
        /**
         * Tìm config logg name trong xml
         */
        Logger logger = LogManager.getLogger("com.lethanh.example.MainTest");
        Logger loggerRoot = LogManager.getRootLogger();
        loggerRoot.info("Root");
        logger.info("Name phan cap");
        log.info("Test");
        log.debug("Test debug");
    }
}
