package com.gafker.manage.datatype;

import java.io.Serializable;
import java.util.Date;

/**
 * 抵用券
 * 
 * @author laurence
 *
 */
public class Coupon implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	protected String id;

	/**
	 * 货币价值
	 */
	protected Money amt;

	/**
	 * 折扣价值
	 */
	protected double discount;

	/**
	 * 归财务账号所有
	 */
	protected String accountId;

	/**
	 * 起始时间
	 */
	protected Date fromDate;

	/**
	 * 截止有效期
	 */
	protected Date utilDate;

	/**
	 * 红包标题
	 */
	protected String title;

	/**
	 * 备注
	 */
	protected String memo;

	/**
	 * 生成日期
	 */
	protected Date created;

	/**
	 * 最后更新日期
	 */
	protected Date updated;

	/**
	 * 是否完成抵用
	 */
	protected Boolean isDeducted;

	/**
	 * 抵用对应的订单
	 */
	protected String abstractId;

	/**
	 * 使用状态(已创建，锁定，已使用)
	 */
	protected String status;

	/**
	 * 是否关闭
	 */
	protected Boolean disabled;
	
	/**
	 * actId
	 * @return
	 */
	protected Integer actId;
	
	

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public Money getAmt() {
		return amt;
	}

	public void setAmt(Money amt) {
		this.amt = amt;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsDeducted() {
		return isDeducted;
	}

	public void setIsDeducted(Boolean isDeducted) {
		this.isDeducted = isDeducted;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstractId() {
		return abstractId;
	}

	public void setAbstractId(String abstractId) {
		this.abstractId = abstractId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
