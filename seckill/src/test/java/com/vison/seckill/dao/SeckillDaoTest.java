package com.vison.seckill.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vison.seckill.config.ApplicationConfig;
import com.vison.seckill.entity.Seckill;

/**
 × description: 整合spring测试SeckillDao
 *
 * @author Vison 2017年4月2日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ApplicationConfig.class})
public class SeckillDaoTest {
	
	@Autowired
	private SeckillDao seckillDao ; 

	@Test
	public void testQueryById() {
		Seckill seckill = seckillDao.queryById(1000) ; 
		System.out.println(seckill);
	}

	@Test
	public void testQueryAll() {
		List<Seckill> seckillList = seckillDao.queryAll(0, 10) ; 
		System.out.println(seckillList);
	}

}
