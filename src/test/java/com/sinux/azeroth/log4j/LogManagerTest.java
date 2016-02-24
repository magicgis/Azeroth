package com.sinux.azeroth.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fumanix on 2/23/16.
 */
public class LogManagerTest {

    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static void main(String[] args) {
        Map<String,String> param = new HashMap<String,String>();
        param.put("userName","测试名称");
        param.put("birthday","12");
        logger.info("=====Logging in param userName {} with birthday {}", param.get("userName"), param.get("birthday"));
    }
}
