package com.lethanh.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Nếu chúng ta cùng get về một log name, thì Logmanager sẽ trả về cho chúng ta the same instance của object
 *
 */
public class TheSameNameTheSameObjectLogger {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("com.lethanh.example.TheSameNameTheSameObjectLogger");
        Logger logger1 = LogManager.getLogger("com.lethanh.example.TheSameNameTheSameObjectLogger");
        logger.info("{}", logger == logger1);
    }
}
