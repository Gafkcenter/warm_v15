package com.gafker.manage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author gafker
 *
 * @param <T> 原始类型
 * @param <P> 分页参数
 * @param <C> 综合条件参数
 * @param <R> 返回的复合类型
 */
public interface BaseService <T,P,C,R>{
public boolean isExistPrimaryKey(Long id) throws Exception;
public int save(T record) throws Exception;//保存一个完整
public int saveSelective(T record) throws Exception;//保存一个有值字段
public int saveSelective(T record,HttpServletRequest request,HttpServletResponse response) throws Exception;//保存一个有值字段
public int saveBatch(List<T> record) throws Exception;//批量保存
public int updateByPrimaryKey(T record) throws Exception;//主键更新一个
public int updateSelective(T record) throws Exception;//更新一个有值字段
public int updateByCondition(T record,C con) throws Exception;//条件更新
public int updateBatch(List<T> record) throws Exception;//批量更新
public R selectByPrimaryKey(Long id) throws Exception;//主键查询一个
public R selectByPrimaryKey(Integer id) throws Exception;//主键查询一个
public List<R> listAll() throws Exception;//显示所有
public R findByCondition(C c) throws Exception;//显示符合条件的记录
public List<R> listByCondition(C c) throws Exception;//显示符合条件的记录
public List<R> listByPage(P page) throws Exception;//分布显示
public List<R> listPageByCondition(C cond) throws Exception;//带条件分页
public List<R> listPageByConditon(C cond) throws Exception;//带条件分页 返回复合类型
public int deleteByPrimaryKey(T record) throws Exception;//关键字删除通过对象里的任务类型Id删除
public int deleteByPrimaryKey(Number id) throws Exception;//关键字删除
public int deleteByCondition(C con) throws Exception;//带条件删除
public int deleteBatch(List<? extends Number> ids) throws Exception;//批量删除
public int count()throws Exception;
public int countByCondition(C con)throws Exception;
public int countBySelfCondition(T record)throws Exception;
}
