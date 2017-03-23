package com.gafker.manage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
/**
 * 
 * @author gafker
 *
 * @param <T> 原始类型
 * @param <P> 分页参数
 * @param <C> 综合条件参数
 * @param <R> 返回的复合类型
 */
public interface BaseController <T,P,C,R>{
public R save(Model m) throws Exception;//显示表单
public R save(T record,Model m,BindingResult b) throws Exception;//保存一个完整
public R save(T record,BindingResult b,Model m,HttpServletRequest request,HttpServletResponse response) throws Exception;//保存一个完整Request,Response
public R saveSelective(T record,Model m,BindingResult b) throws Exception;//保存一个有值字段
public R saveBatch(List<T> record,Model m,BindingResult b) throws Exception;//批量保存
public R update(Long id,Model m) throws Exception;//显示表单
public R update(Integer id,Model m) throws Exception;//显示表单
public R updateByPrimaryKey(T record,Model m,BindingResult b) throws Exception;//主键更新一个
public R updateSelectiveAjax(T record,Model m,BindingResult b,String id,Integer delFlag) throws Exception;//ajax更新状态
public R updateSelective(T record,Model m,BindingResult b,String id,Integer delFlag) throws Exception;//更新一个有值字段
public R updateByCondition(T record,C con,Model m,BindingResult b) throws Exception;//条件更新
public R updateBatch(List<T> record,Model m,BindingResult b) throws Exception;//批量更新
public R listAll(Model m) throws Exception;//显示所有
public R listByCondition(C c,Model m) throws Exception;//分布显示
public String findByTwoConditon(Long userId,Long productId, Model m) throws Exception;
public String findByOneConditon(Long productId, Model m) throws Exception;
public R listByPage(P page,Model m) throws Exception;//分布显示
public R listPageByCondition(P page,C cond,Model m) throws Exception;//带条件分页
public R listPageByConditon(P page,C cond,Model m) throws Exception;//带条件分页 返回复合类型
public R deleteByPrimaryKey(T record,Model m) throws Exception;//关键字删除通过对象里的任务类型Id删除
public R deleteByPrimaryKey(Number id,Model m) throws Exception;//关键字删除
public R deleteByCondition(C con,Model m) throws Exception;//带条件删除
public R deleteBatch(List<? extends Number> ids,Model m) throws Exception;//批量删除
public R count()throws Exception;
public R countByCondition(C con)throws Exception;
public R countBySelfCondition(T record)throws Exception;
}
