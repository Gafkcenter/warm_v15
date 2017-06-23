package com.gafker.manage.service.base;

import java.util.List;

import com.gafker.manage.entity.Page;

public interface BaseService2<T, EN, C, P> {
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
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public T findByPrimaryId(Long id) throws Exception;

	/**
	 * 带条件查询 无分页
	 * 
	 * @param e
	 * @return
	 * @throws Exception
	 */
	public List<T> selectByExample(C c) throws Exception;

	/**
	 * 带条件查询 有分页
	 * 
	 * @param e
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public List<T> selectByExample(C c, Page<?> p) throws Exception;

	/**
	 * 查询所有 无分页
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<T> selectAll() throws Exception;

	/**
	 * 查询所有 有分页
	 * 
	 * @param p
	 * @return
	 * @throws Exception
	 */
	public List<T> selectAll(P p) throws Exception;

	/**
	 * 数据库查询结果转换到VoForm
	 * 
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	public T copyEntityToVoForm(EN entity) throws Exception;

	/**
	 * 数据库查询结果转换到VoFormList
	 * 
	 * @param entity
	 * @return
	 */
	public List<T> copyEntityToVoForm(List<EN> entity) throws Exception;
}
