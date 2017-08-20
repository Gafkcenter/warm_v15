package com.gafker.manage.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.gafker.manage.entity.Page;
/**
 * 
 * @author gafker
 *
 * @param <T> 输入内容
 * @param <C> 查询条件
 * @param <R> 输出内容 返回值
 */
public interface BaseV2Controller<T, C, R> {
	/**
	 * 
	 * @param view 格式:  path:path:path
	 * @param data
	 * @param m
	 * @return
	 */
	public String page(String view, T data, Model m);

	public String insert(T data, BindingResult b, Model m) throws Exception;

	public String selectByPrimaryKey(Long id, Model m) throws Exception;

	public String selectByCondition(C con, Page<?> p, Model m) throws Exception;

	public String selectByAll(Page<?> p, Model m) throws Exception;

	public String update(Long id,  Model m) throws Exception;

	public String update(T data, BindingResult b, Model m) throws Exception;

	public String delete(Long id, Model m) throws Exception;
}
