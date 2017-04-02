package com.vison.seckill.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 × description: 测试logback
 *
 * @author Vison 2017年4月2日
 */
public class TestLogback {
	
	private static Logger logger = LoggerFactory.getLogger(TestLogback.class) ; 
	
	@Test
	public void log() {
		String msg = null ; 
		logger.info("NULL Pointer will happen.");
		try {
			msg.length() ; 
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("fail to get msg length : " + e.getMessage() , e);
		}
	} 
	
	public static void main(String[] args) {
		logger.debug("haha");
		logger.info("hehe");
		logger.warn("huohuo");
		logger.error("error");
	}
	
}
