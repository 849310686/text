package com.dao;

import java.util.List;

import com.model.Goods;

public interface GoodsDao {
	/**
	 * 根据ID查询
	 * @param id主键
	 * @return 查询结果
	 */
	public Goods findById(String id);
	/**
	 * 查询全部
	 * @return 查询结果
	 */
	public List<Goods> findAll();
	/**
	 * 插入记录
	 * @param goods
	 * @return 操作成功返回1，失败返回0
	 */
	public int insert(Goods goods);
	/**
	 * 更新数据
	 * @param goods
	 * @return 操作成功返回1，失败返回0
	 */
	public int update(Goods goods);
	/**
	 * 删除数据
	 * @param id
	 * @return 操作成功返回1，失败返回0
	 */
	public int delete(String id);
}
