package com.vison.seckill.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vison.seckill.entity.Seckill;

/**
 × description: 秒杀Dao操作
 *
 * @author Vison 2017年4月2日
 */
public interface SeckillDao {
	
	/**
	 * 根据id查询秒杀物品
	 * @param id
	 * @return
	 */
	public Seckill queryById(long id) ; 
	
	/**
	 * 分页查找秒杀物品
	 * @param offset
	 * @param limit
	 * @return
	 */
	public List<Seckill> queryAll(@Param("offset") int offset ,@Param("limit") int limit) ; 
	
}
