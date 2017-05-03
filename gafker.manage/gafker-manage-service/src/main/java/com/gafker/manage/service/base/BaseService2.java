package com.gafker.manage.service.base;

import java.util.List;

public interface BaseService2 <T,C,P>{
	/**
	 * 保存
	 * 
	 * @param s
	 * @return
	 */
	public int save(T s) throws Exception;
	/**
	 * 批量保存
	 * 
	 * @param s
	 * @return
	 */
	public int save(List<T> s) throws Exception;

	/**
	 * 更新
	 * 
	 * @param s
	 * @return
	 */
	public int update(T s) throws Exception;
	/**
	 * 更新所选
	 * 
	 * @param s
	 * @return
	 */
	public int updateSelect(T s) throws Exception;

	/**
	 * 删除
	 * 
	 * @param s
	 * @return
	 * @throws Exception
	 */
	public int delete(Long id) throws Exception;

	/**
	 * 通过Id查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T findByPrimaryId(Long id) throws Exception;

	/**
	 * 带条件查询 无分页
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public List<T> selectByExample(C c) throws Exception;

	/**
	 * 带条件查询 有分页
	 * @param e
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public List<T> selectByExample(C c, P p) throws Exception;

	/**
	 * 查询所有 无分页
	 * @return
	 * @throws Exception
	 */
	public List<T> selectAll() throws Exception;

	/**
	 * 查询所有 有分页
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public List<T> selectAll(P p) throws Exception;
}
