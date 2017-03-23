package com.gafker.manage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilybookscontentExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public FamilybookscontentExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
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

		public Criteria andBookcontentIsNull() {
			addCriterion("BookContent is null");
			return (Criteria) this;
		}

		public Criteria andBookcontentIsNotNull() {
			addCriterion("BookContent is not null");
			return (Criteria) this;
		}

		public Criteria andBookcontentEqualTo(String value) {
			addCriterion("BookContent =", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentNotEqualTo(String value) {
			addCriterion("BookContent <>", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentGreaterThan(String value) {
			addCriterion("BookContent >", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentGreaterThanOrEqualTo(String value) {
			addCriterion("BookContent >=", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentLessThan(String value) {
			addCriterion("BookContent <", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentLessThanOrEqualTo(String value) {
			addCriterion("BookContent <=", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentLike(String value) {
			addCriterion("BookContent like", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentNotLike(String value) {
			addCriterion("BookContent not like", value, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentIn(List<String> values) {
			addCriterion("BookContent in", values, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentNotIn(List<String> values) {
			addCriterion("BookContent not in", values, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentBetween(String value1, String value2) {
			addCriterion("BookContent between", value1, value2, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontentNotBetween(String value1, String value2) {
			addCriterion("BookContent not between", value1, value2, "bookcontent");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeIsNull() {
			addCriterion("BookContentType is null");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeIsNotNull() {
			addCriterion("BookContentType is not null");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeEqualTo(Integer value) {
			addCriterion("BookContentType =", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeNotEqualTo(Integer value) {
			addCriterion("BookContentType <>", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeGreaterThan(Integer value) {
			addCriterion("BookContentType >", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("BookContentType >=", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeLessThan(Integer value) {
			addCriterion("BookContentType <", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeLessThanOrEqualTo(Integer value) {
			addCriterion("BookContentType <=", value, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeIn(List<Integer> values) {
			addCriterion("BookContentType in", values, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeNotIn(List<Integer> values) {
			addCriterion("BookContentType not in", values, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeBetween(Integer value1, Integer value2) {
			addCriterion("BookContentType between", value1, value2, "bookcontenttype");
			return (Criteria) this;
		}

		public Criteria andBookcontenttypeNotBetween(Integer value1, Integer value2) {
			addCriterion("BookContentType not between", value1, value2, "bookcontenttype");
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
			addCriterion("AdsIds__fk is null");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkIsNotNull() {
			addCriterion("AdsIds__fk is not null");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkEqualTo(String value) {
			addCriterion("AdsIds__fk =", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotEqualTo(String value) {
			addCriterion("AdsIds__fk <>", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkGreaterThan(String value) {
			addCriterion("AdsIds__fk >", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkGreaterThanOrEqualTo(String value) {
			addCriterion("AdsIds__fk >=", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLessThan(String value) {
			addCriterion("AdsIds__fk <", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLessThanOrEqualTo(String value) {
			addCriterion("AdsIds__fk <=", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkLike(String value) {
			addCriterion("AdsIds__fk like", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotLike(String value) {
			addCriterion("AdsIds__fk not like", value, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkIn(List<String> values) {
			addCriterion("AdsIds__fk in", values, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotIn(List<String> values) {
			addCriterion("AdsIds__fk not in", values, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkBetween(String value1, String value2) {
			addCriterion("AdsIds__fk between", value1, value2, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andAdsidsFkNotBetween(String value1, String value2) {
			addCriterion("AdsIds__fk not between", value1, value2, "adsidsFk");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidIsNull() {
			addCriterion("FamilyBooksId is null");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidIsNotNull() {
			addCriterion("FamilyBooksId is not null");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidEqualTo(Long value) {
			addCriterion("FamilyBooksId =", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidNotEqualTo(Long value) {
			addCriterion("FamilyBooksId <>", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidGreaterThan(Long value) {
			addCriterion("FamilyBooksId >", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidGreaterThanOrEqualTo(Long value) {
			addCriterion("FamilyBooksId >=", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidLessThan(Long value) {
			addCriterion("FamilyBooksId <", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidLessThanOrEqualTo(Long value) {
			addCriterion("FamilyBooksId <=", value, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidIn(List<Long> values) {
			addCriterion("FamilyBooksId in", values, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidNotIn(List<Long> values) {
			addCriterion("FamilyBooksId not in", values, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidBetween(Long value1, Long value2) {
			addCriterion("FamilyBooksId between", value1, value2, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andFamilybooksidNotBetween(Long value1, Long value2) {
			addCriterion("FamilyBooksId not between", value1, value2, "familybooksid");
			return (Criteria) this;
		}

		public Criteria andStarIsNull() {
			addCriterion("Star is null");
			return (Criteria) this;
		}

		public Criteria andStarIsNotNull() {
			addCriterion("Star is not null");
			return (Criteria) this;
		}

		public Criteria andStarEqualTo(Long value) {
			addCriterion("Star =", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarNotEqualTo(Long value) {
			addCriterion("Star <>", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarGreaterThan(Long value) {
			addCriterion("Star >", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarGreaterThanOrEqualTo(Long value) {
			addCriterion("Star >=", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarLessThan(Long value) {
			addCriterion("Star <", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarLessThanOrEqualTo(Long value) {
			addCriterion("Star <=", value, "star");
			return (Criteria) this;
		}

		public Criteria andStarIn(List<Long> values) {
			addCriterion("Star in", values, "star");
			return (Criteria) this;
		}

		public Criteria andStarNotIn(List<Long> values) {
			addCriterion("Star not in", values, "star");
			return (Criteria) this;
		}

		public Criteria andStarBetween(Long value1, Long value2) {
			addCriterion("Star between", value1, value2, "star");
			return (Criteria) this;
		}

		public Criteria andStarNotBetween(Long value1, Long value2) {
			addCriterion("Star not between", value1, value2, "star");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNull() {
			addCriterion("CreateTime is null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIsNotNull() {
			addCriterion("CreateTime is not null");
			return (Criteria) this;
		}

		public Criteria andCreatetimeEqualTo(Date value) {
			addCriterion("CreateTime =", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotEqualTo(Date value) {
			addCriterion("CreateTime <>", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThan(Date value) {
			addCriterion("CreateTime >", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CreateTime >=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThan(Date value) {
			addCriterion("CreateTime <", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
			addCriterion("CreateTime <=", value, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeIn(List<Date> values) {
			addCriterion("CreateTime in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotIn(List<Date> values) {
			addCriterion("CreateTime not in", values, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeBetween(Date value1, Date value2) {
			addCriterion("CreateTime between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
			addCriterion("CreateTime not between", value1, value2, "createtime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeIsNull() {
			addCriterion("UpdatTime is null");
			return (Criteria) this;
		}

		public Criteria andUpdattimeIsNotNull() {
			addCriterion("UpdatTime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdattimeEqualTo(Date value) {
			addCriterion("UpdatTime =", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeNotEqualTo(Date value) {
			addCriterion("UpdatTime <>", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeGreaterThan(Date value) {
			addCriterion("UpdatTime >", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeGreaterThanOrEqualTo(Date value) {
			addCriterion("UpdatTime >=", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeLessThan(Date value) {
			addCriterion("UpdatTime <", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeLessThanOrEqualTo(Date value) {
			addCriterion("UpdatTime <=", value, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeIn(List<Date> values) {
			addCriterion("UpdatTime in", values, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeNotIn(List<Date> values) {
			addCriterion("UpdatTime not in", values, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeBetween(Date value1, Date value2) {
			addCriterion("UpdatTime between", value1, value2, "updattime");
			return (Criteria) this;
		}

		public Criteria andUpdattimeNotBetween(Date value1, Date value2) {
			addCriterion("UpdatTime not between", value1, value2, "updattime");
			return (Criteria) this;
		}

		public Criteria andCreatebyIsNull() {
			addCriterion("CreateBy is null");
			return (Criteria) this;
		}

		public Criteria andCreatebyIsNotNull() {
			addCriterion("CreateBy is not null");
			return (Criteria) this;
		}

		public Criteria andCreatebyEqualTo(String value) {
			addCriterion("CreateBy =", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotEqualTo(String value) {
			addCriterion("CreateBy <>", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThan(String value) {
			addCriterion("CreateBy >", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
			addCriterion("CreateBy >=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThan(String value) {
			addCriterion("CreateBy <", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLessThanOrEqualTo(String value) {
			addCriterion("CreateBy <=", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyLike(String value) {
			addCriterion("CreateBy like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotLike(String value) {
			addCriterion("CreateBy not like", value, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyIn(List<String> values) {
			addCriterion("CreateBy in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotIn(List<String> values) {
			addCriterion("CreateBy not in", values, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyBetween(String value1, String value2) {
			addCriterion("CreateBy between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andCreatebyNotBetween(String value1, String value2) {
			addCriterion("CreateBy not between", value1, value2, "createby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNull() {
			addCriterion("UpdateBy is null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIsNotNull() {
			addCriterion("UpdateBy is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatebyEqualTo(String value) {
			addCriterion("UpdateBy =", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotEqualTo(String value) {
			addCriterion("UpdateBy <>", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThan(String value) {
			addCriterion("UpdateBy >", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
			addCriterion("UpdateBy >=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThan(String value) {
			addCriterion("UpdateBy <", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThanOrEqualTo(String value) {
			addCriterion("UpdateBy <=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLike(String value) {
			addCriterion("UpdateBy like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotLike(String value) {
			addCriterion("UpdateBy not like", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIn(List<String> values) {
			addCriterion("UpdateBy in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotIn(List<String> values) {
			addCriterion("UpdateBy not in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyBetween(String value1, String value2) {
			addCriterion("UpdateBy between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotBetween(String value1, String value2) {
			addCriterion("UpdateBy not between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andBookdescIsNull() {
			addCriterion("BookDesc is null");
			return (Criteria) this;
		}

		public Criteria andBookdescIsNotNull() {
			addCriterion("BookDesc is not null");
			return (Criteria) this;
		}

		public Criteria andBookdescEqualTo(String value) {
			addCriterion("BookDesc =", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescNotEqualTo(String value) {
			addCriterion("BookDesc <>", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescGreaterThan(String value) {
			addCriterion("BookDesc >", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescGreaterThanOrEqualTo(String value) {
			addCriterion("BookDesc >=", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescLessThan(String value) {
			addCriterion("BookDesc <", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescLessThanOrEqualTo(String value) {
			addCriterion("BookDesc <=", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescLike(String value) {
			addCriterion("BookDesc like", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescNotLike(String value) {
			addCriterion("BookDesc not like", value, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescIn(List<String> values) {
			addCriterion("BookDesc in", values, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescNotIn(List<String> values) {
			addCriterion("BookDesc not in", values, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescBetween(String value1, String value2) {
			addCriterion("BookDesc between", value1, value2, "bookdesc");
			return (Criteria) this;
		}

		public Criteria andBookdescNotBetween(String value1, String value2) {
			addCriterion("BookDesc not between", value1, value2, "bookdesc");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familybookscontent
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
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
     * This class corresponds to the database table familybookscontent
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 17 09:21:29 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}