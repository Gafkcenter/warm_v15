package com.gafker.manage.entity;

import java.util.ArrayList;
import java.util.List;

public class FamilynamesExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public FamilynamesExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUstringidIsNull() {
			addCriterion("UstringId is null");
			return (Criteria) this;
		}

		public Criteria andUstringidIsNotNull() {
			addCriterion("UstringId is not null");
			return (Criteria) this;
		}

		public Criteria andUstringidEqualTo(String value) {
			addCriterion("UstringId =", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidNotEqualTo(String value) {
			addCriterion("UstringId <>", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidGreaterThan(String value) {
			addCriterion("UstringId >", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidGreaterThanOrEqualTo(String value) {
			addCriterion("UstringId >=", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidLessThan(String value) {
			addCriterion("UstringId <", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidLessThanOrEqualTo(String value) {
			addCriterion("UstringId <=", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidLike(String value) {
			addCriterion("UstringId like", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidNotLike(String value) {
			addCriterion("UstringId not like", value, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidIn(List<String> values) {
			addCriterion("UstringId in", values, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidNotIn(List<String> values) {
			addCriterion("UstringId not in", values, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidBetween(String value1, String value2) {
			addCriterion("UstringId between", value1, value2, "ustringid");
			return (Criteria) this;
		}

		public Criteria andUstringidNotBetween(String value1, String value2) {
			addCriterion("UstringId not between", value1, value2, "ustringid");
			return (Criteria) this;
		}

		public Criteria andNamecnIsNull() {
			addCriterion("NameCn is null");
			return (Criteria) this;
		}

		public Criteria andNamecnIsNotNull() {
			addCriterion("NameCn is not null");
			return (Criteria) this;
		}

		public Criteria andNamecnEqualTo(String value) {
			addCriterion("NameCn =", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnNotEqualTo(String value) {
			addCriterion("NameCn <>", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnGreaterThan(String value) {
			addCriterion("NameCn >", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnGreaterThanOrEqualTo(String value) {
			addCriterion("NameCn >=", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnLessThan(String value) {
			addCriterion("NameCn <", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnLessThanOrEqualTo(String value) {
			addCriterion("NameCn <=", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnLike(String value) {
			addCriterion("NameCn like", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnNotLike(String value) {
			addCriterion("NameCn not like", value, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnIn(List<String> values) {
			addCriterion("NameCn in", values, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnNotIn(List<String> values) {
			addCriterion("NameCn not in", values, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnBetween(String value1, String value2) {
			addCriterion("NameCn between", value1, value2, "namecn");
			return (Criteria) this;
		}

		public Criteria andNamecnNotBetween(String value1, String value2) {
			addCriterion("NameCn not between", value1, value2, "namecn");
			return (Criteria) this;
		}

		public Criteria andNameenIsNull() {
			addCriterion("NameEn is null");
			return (Criteria) this;
		}

		public Criteria andNameenIsNotNull() {
			addCriterion("NameEn is not null");
			return (Criteria) this;
		}

		public Criteria andNameenEqualTo(String value) {
			addCriterion("NameEn =", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenNotEqualTo(String value) {
			addCriterion("NameEn <>", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenGreaterThan(String value) {
			addCriterion("NameEn >", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenGreaterThanOrEqualTo(String value) {
			addCriterion("NameEn >=", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenLessThan(String value) {
			addCriterion("NameEn <", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenLessThanOrEqualTo(String value) {
			addCriterion("NameEn <=", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenLike(String value) {
			addCriterion("NameEn like", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenNotLike(String value) {
			addCriterion("NameEn not like", value, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenIn(List<String> values) {
			addCriterion("NameEn in", values, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenNotIn(List<String> values) {
			addCriterion("NameEn not in", values, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenBetween(String value1, String value2) {
			addCriterion("NameEn between", value1, value2, "nameen");
			return (Criteria) this;
		}

		public Criteria andNameenNotBetween(String value1, String value2) {
			addCriterion("NameEn not between", value1, value2, "nameen");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticIsNull() {
			addCriterion("ChinesePhonetic is null");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticIsNotNull() {
			addCriterion("ChinesePhonetic is not null");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticEqualTo(String value) {
			addCriterion("ChinesePhonetic =", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticNotEqualTo(String value) {
			addCriterion("ChinesePhonetic <>", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticGreaterThan(String value) {
			addCriterion("ChinesePhonetic >", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticGreaterThanOrEqualTo(String value) {
			addCriterion("ChinesePhonetic >=", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticLessThan(String value) {
			addCriterion("ChinesePhonetic <", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticLessThanOrEqualTo(String value) {
			addCriterion("ChinesePhonetic <=", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticLike(String value) {
			addCriterion("ChinesePhonetic like", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticNotLike(String value) {
			addCriterion("ChinesePhonetic not like", value, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticIn(List<String> values) {
			addCriterion("ChinesePhonetic in", values, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticNotIn(List<String> values) {
			addCriterion("ChinesePhonetic not in", values, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticBetween(String value1, String value2) {
			addCriterion("ChinesePhonetic between", value1, value2, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andChinesephoneticNotBetween(String value1, String value2) {
			addCriterion("ChinesePhonetic not between", value1, value2, "chinesephonetic");
			return (Criteria) this;
		}

		public Criteria andBranchidIsNull() {
			addCriterion("BranchId is null");
			return (Criteria) this;
		}

		public Criteria andBranchidIsNotNull() {
			addCriterion("BranchId is not null");
			return (Criteria) this;
		}

		public Criteria andBranchidEqualTo(Long value) {
			addCriterion("BranchId =", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidNotEqualTo(Long value) {
			addCriterion("BranchId <>", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidGreaterThan(Long value) {
			addCriterion("BranchId >", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidGreaterThanOrEqualTo(Long value) {
			addCriterion("BranchId >=", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidLessThan(Long value) {
			addCriterion("BranchId <", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidLessThanOrEqualTo(Long value) {
			addCriterion("BranchId <=", value, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidIn(List<Long> values) {
			addCriterion("BranchId in", values, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidNotIn(List<Long> values) {
			addCriterion("BranchId not in", values, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidBetween(Long value1, Long value2) {
			addCriterion("BranchId between", value1, value2, "branchid");
			return (Criteria) this;
		}

		public Criteria andBranchidNotBetween(Long value1, Long value2) {
			addCriterion("BranchId not between", value1, value2, "branchid");
			return (Criteria) this;
		}

		public Criteria andIdxIsNull() {
			addCriterion("Idx is null");
			return (Criteria) this;
		}

		public Criteria andIdxIsNotNull() {
			addCriterion("Idx is not null");
			return (Criteria) this;
		}

		public Criteria andIdxEqualTo(Integer value) {
			addCriterion("Idx =", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotEqualTo(Integer value) {
			addCriterion("Idx <>", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxGreaterThan(Integer value) {
			addCriterion("Idx >", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
			addCriterion("Idx >=", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxLessThan(Integer value) {
			addCriterion("Idx <", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxLessThanOrEqualTo(Integer value) {
			addCriterion("Idx <=", value, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxIn(List<Integer> values) {
			addCriterion("Idx in", values, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotIn(List<Integer> values) {
			addCriterion("Idx not in", values, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxBetween(Integer value1, Integer value2) {
			addCriterion("Idx between", value1, value2, "idx");
			return (Criteria) this;
		}

		public Criteria andIdxNotBetween(Integer value1, Integer value2) {
			addCriterion("Idx not between", value1, value2, "idx");
			return (Criteria) this;
		}

		public Criteria andQrcodeIsNull() {
			addCriterion("Qrcode is null");
			return (Criteria) this;
		}

		public Criteria andQrcodeIsNotNull() {
			addCriterion("Qrcode is not null");
			return (Criteria) this;
		}

		public Criteria andQrcodeEqualTo(String value) {
			addCriterion("Qrcode =", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotEqualTo(String value) {
			addCriterion("Qrcode <>", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeGreaterThan(String value) {
			addCriterion("Qrcode >", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
			addCriterion("Qrcode >=", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLessThan(String value) {
			addCriterion("Qrcode <", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLessThanOrEqualTo(String value) {
			addCriterion("Qrcode <=", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLike(String value) {
			addCriterion("Qrcode like", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotLike(String value) {
			addCriterion("Qrcode not like", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeIn(List<String> values) {
			addCriterion("Qrcode in", values, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotIn(List<String> values) {
			addCriterion("Qrcode not in", values, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeBetween(String value1, String value2) {
			addCriterion("Qrcode between", value1, value2, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotBetween(String value1, String value2) {
			addCriterion("Qrcode not between", value1, value2, "qrcode");
			return (Criteria) this;
		}

		public Criteria andWeburlsIsNull() {
			addCriterion("WebUrls is null");
			return (Criteria) this;
		}

		public Criteria andWeburlsIsNotNull() {
			addCriterion("WebUrls is not null");
			return (Criteria) this;
		}

		public Criteria andWeburlsEqualTo(String value) {
			addCriterion("WebUrls =", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsNotEqualTo(String value) {
			addCriterion("WebUrls <>", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsGreaterThan(String value) {
			addCriterion("WebUrls >", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsGreaterThanOrEqualTo(String value) {
			addCriterion("WebUrls >=", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsLessThan(String value) {
			addCriterion("WebUrls <", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsLessThanOrEqualTo(String value) {
			addCriterion("WebUrls <=", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsLike(String value) {
			addCriterion("WebUrls like", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsNotLike(String value) {
			addCriterion("WebUrls not like", value, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsIn(List<String> values) {
			addCriterion("WebUrls in", values, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsNotIn(List<String> values) {
			addCriterion("WebUrls not in", values, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsBetween(String value1, String value2) {
			addCriterion("WebUrls between", value1, value2, "weburls");
			return (Criteria) this;
		}

		public Criteria andWeburlsNotBetween(String value1, String value2) {
			addCriterion("WebUrls not between", value1, value2, "weburls");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkIsNull() {
			addCriterion("AdsIds_fk is null");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkIsNotNull() {
			addCriterion("AdsIds_fk is not null");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkEqualTo(String value) {
			addCriterion("AdsIds_fk =", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotEqualTo(String value) {
			addCriterion("AdsIds_fk <>", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkGreaterThan(String value) {
			addCriterion("AdsIds_fk >", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkGreaterThanOrEqualTo(String value) {
			addCriterion("AdsIds_fk >=", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLessThan(String value) {
			addCriterion("AdsIds_fk <", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLessThanOrEqualTo(String value) {
			addCriterion("AdsIds_fk <=", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLike(String value) {
			addCriterion("AdsIds_fk like", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotLike(String value) {
			addCriterion("AdsIds_fk not like", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkIn(List<String> values) {
			addCriterion("AdsIds_fk in", values, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotIn(List<String> values) {
			addCriterion("AdsIds_fk not in", values, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkBetween(String value1, String value2) {
			addCriterion("AdsIds_fk between", value1, value2, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotBetween(String value1, String value2) {
			addCriterion("AdsIds_fk not between", value1, value2, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescIsNull() {
			addCriterion("FamilyNamesDesc is null");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescIsNotNull() {
			addCriterion("FamilyNamesDesc is not null");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescEqualTo(String value) {
			addCriterion("FamilyNamesDesc =", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescNotEqualTo(String value) {
			addCriterion("FamilyNamesDesc <>", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescGreaterThan(String value) {
			addCriterion("FamilyNamesDesc >", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescGreaterThanOrEqualTo(String value) {
			addCriterion("FamilyNamesDesc >=", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescLessThan(String value) {
			addCriterion("FamilyNamesDesc <", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescLessThanOrEqualTo(String value) {
			addCriterion("FamilyNamesDesc <=", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescLike(String value) {
			addCriterion("FamilyNamesDesc like", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescNotLike(String value) {
			addCriterion("FamilyNamesDesc not like", value, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescIn(List<String> values) {
			addCriterion("FamilyNamesDesc in", values, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescNotIn(List<String> values) {
			addCriterion("FamilyNamesDesc not in", values, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescBetween(String value1, String value2) {
			addCriterion("FamilyNamesDesc between", value1, value2, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andFamilynamesdescNotBetween(String value1, String value2) {
			addCriterion("FamilyNamesDesc not between", value1, value2, "familynamesdesc");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameIsNull() {
			addCriterion("SameLevelName is null");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameIsNotNull() {
			addCriterion("SameLevelName is not null");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameEqualTo(String value) {
			addCriterion("SameLevelName =", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameNotEqualTo(String value) {
			addCriterion("SameLevelName <>", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameGreaterThan(String value) {
			addCriterion("SameLevelName >", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameGreaterThanOrEqualTo(String value) {
			addCriterion("SameLevelName >=", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameLessThan(String value) {
			addCriterion("SameLevelName <", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameLessThanOrEqualTo(String value) {
			addCriterion("SameLevelName <=", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameLike(String value) {
			addCriterion("SameLevelName like", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameNotLike(String value) {
			addCriterion("SameLevelName not like", value, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameIn(List<String> values) {
			addCriterion("SameLevelName in", values, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameNotIn(List<String> values) {
			addCriterion("SameLevelName not in", values, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameBetween(String value1, String value2) {
			addCriterion("SameLevelName between", value1, value2, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andSamelevelnameNotBetween(String value1, String value2) {
			addCriterion("SameLevelName not between", value1, value2, "samelevelname");
			return (Criteria) this;
		}

		public Criteria andTotalpersonIsNull() {
			addCriterion("TotalPerson is null");
			return (Criteria) this;
		}

		public Criteria andTotalpersonIsNotNull() {
			addCriterion("TotalPerson is not null");
			return (Criteria) this;
		}

		public Criteria andTotalpersonEqualTo(Long value) {
			addCriterion("TotalPerson =", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonNotEqualTo(Long value) {
			addCriterion("TotalPerson <>", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonGreaterThan(Long value) {
			addCriterion("TotalPerson >", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonGreaterThanOrEqualTo(Long value) {
			addCriterion("TotalPerson >=", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonLessThan(Long value) {
			addCriterion("TotalPerson <", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonLessThanOrEqualTo(Long value) {
			addCriterion("TotalPerson <=", value, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonIn(List<Long> values) {
			addCriterion("TotalPerson in", values, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonNotIn(List<Long> values) {
			addCriterion("TotalPerson not in", values, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonBetween(Long value1, Long value2) {
			addCriterion("TotalPerson between", value1, value2, "totalperson");
			return (Criteria) this;
		}

		public Criteria andTotalpersonNotBetween(Long value1, Long value2) {
			addCriterion("TotalPerson not between", value1, value2, "totalperson");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familynames
	 * @mbggenerated  Fri Feb 24 19:56:07 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table familynames
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 17 09:21:29 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}