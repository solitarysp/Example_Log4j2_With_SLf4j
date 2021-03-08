package com.lethanh.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainTest {
    public static void main(String[] args) {
        /**
         * Tìm config logg name trong xml
         */
        Logger logger = LogManager.getLogger("com.lethanh.example.MainTest");
        Logger loggerRoot = LogManager.getRootLogger();
        
        logger.debug("Log config by name");
        loggerRoot.debug("Log config  root");
    }
}
