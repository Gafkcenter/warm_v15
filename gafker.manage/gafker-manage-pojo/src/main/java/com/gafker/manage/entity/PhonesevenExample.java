package com.gafker.manage.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhonesevenExample extends LimitExample{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public PhonesevenExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
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

		public Criteria andPhonesevenIsNull() {
			addCriterion("PhoneSeven is null");
			return (Criteria) this;
		}

		public Criteria andPhonesevenIsNotNull() {
			addCriterion("PhoneSeven is not null");
			return (Criteria) this;
		}

		public Criteria andPhonesevenEqualTo(Long value) {
			addCriterion("PhoneSeven =", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenNotEqualTo(Long value) {
			addCriterion("PhoneSeven <>", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenGreaterThan(Long value) {
			addCriterion("PhoneSeven >", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenGreaterThanOrEqualTo(Long value) {
			addCriterion("PhoneSeven >=", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenLessThan(Long value) {
			addCriterion("PhoneSeven <", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenLessThanOrEqualTo(Long value) {
			addCriterion("PhoneSeven <=", value, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenIn(List<Long> values) {
			addCriterion("PhoneSeven in", values, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenNotIn(List<Long> values) {
			addCriterion("PhoneSeven not in", values, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenBetween(Long value1, Long value2) {
			addCriterion("PhoneSeven between", value1, value2, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andPhonesevenNotBetween(Long value1, Long value2) {
			addCriterion("PhoneSeven not between", value1, value2, "phoneseven");
			return (Criteria) this;
		}

		public Criteria andFinishedIsNull() {
			addCriterion("Finished is null");
			return (Criteria) this;
		}

		public Criteria andFinishedIsNotNull() {
			addCriterion("Finished is not null");
			return (Criteria) this;
		}

		public Criteria andFinishedEqualTo(String value) {
			addCriterion("Finished =", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotEqualTo(String value) {
			addCriterion("Finished <>", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedGreaterThan(String value) {
			addCriterion("Finished >", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedGreaterThanOrEqualTo(String value) {
			addCriterion("Finished >=", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedLessThan(String value) {
			addCriterion("Finished <", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedLessThanOrEqualTo(String value) {
			addCriterion("Finished <=", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedLike(String value) {
			addCriterion("Finished like", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotLike(String value) {
			addCriterion("Finished not like", value, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedIn(List<String> values) {
			addCriterion("Finished in", values, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotIn(List<String> values) {
			addCriterion("Finished not in", values, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedBetween(String value1, String value2) {
			addCriterion("Finished between", value1, value2, "finished");
			return (Criteria) this;
		}

		public Criteria andFinishedNotBetween(String value1, String value2) {
			addCriterion("Finished not between", value1, value2, "finished");
			return (Criteria) this;
		}

		public Criteria andStartpositionIsNull() {
			addCriterion("StartPosition is null");
			return (Criteria) this;
		}

		public Criteria andStartpositionIsNotNull() {
			addCriterion("StartPosition is not null");
			return (Criteria) this;
		}

		public Criteria andStartpositionEqualTo(String value) {
			addCriterion("StartPosition =", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionNotEqualTo(String value) {
			addCriterion("StartPosition <>", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionGreaterThan(String value) {
			addCriterion("StartPosition >", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionGreaterThanOrEqualTo(String value) {
			addCriterion("StartPosition >=", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionLessThan(String value) {
			addCriterion("StartPosition <", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionLessThanOrEqualTo(String value) {
			addCriterion("StartPosition <=", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionLike(String value) {
			addCriterion("StartPosition like", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionNotLike(String value) {
			addCriterion("StartPosition not like", value, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionIn(List<String> values) {
			addCriterion("StartPosition in", values, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionNotIn(List<String> values) {
			addCriterion("StartPosition not in", values, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionBetween(String value1, String value2) {
			addCriterion("StartPosition between", value1, value2, "startposition");
			return (Criteria) this;
		}

		public Criteria andStartpositionNotBetween(String value1, String value2) {
			addCriterion("StartPosition not between", value1, value2, "startposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionIsNull() {
			addCriterion("GeoPosition is null");
			return (Criteria) this;
		}

		public Criteria andGeopositionIsNotNull() {
			addCriterion("GeoPosition is not null");
			return (Criteria) this;
		}

		public Criteria andGeopositionEqualTo(String value) {
			addCriterion("GeoPosition =", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionNotEqualTo(String value) {
			addCriterion("GeoPosition <>", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionGreaterThan(String value) {
			addCriterion("GeoPosition >", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionGreaterThanOrEqualTo(String value) {
			addCriterion("GeoPosition >=", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionLessThan(String value) {
			addCriterion("GeoPosition <", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionLessThanOrEqualTo(String value) {
			addCriterion("GeoPosition <=", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionLike(String value) {
			addCriterion("GeoPosition like", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionNotLike(String value) {
			addCriterion("GeoPosition not like", value, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionIn(List<String> values) {
			addCriterion("GeoPosition in", values, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionNotIn(List<String> values) {
			addCriterion("GeoPosition not in", values, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionBetween(String value1, String value2) {
			addCriterion("GeoPosition between", value1, value2, "geoposition");
			return (Criteria) this;
		}

		public Criteria andGeopositionNotBetween(String value1, String value2) {
			addCriterion("GeoPosition not between", value1, value2, "geoposition");
			return (Criteria) this;
		}

		public Criteria andCountIsNull() {
			addCriterion("Count is null");
			return (Criteria) this;
		}

		public Criteria andCountIsNotNull() {
			addCriterion("Count is not null");
			return (Criteria) this;
		}

		public Criteria andCountEqualTo(Long value) {
			addCriterion("Count =", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotEqualTo(Long value) {
			addCriterion("Count <>", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThan(Long value) {
			addCriterion("Count >", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountGreaterThanOrEqualTo(Long value) {
			addCriterion("Count >=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThan(Long value) {
			addCriterion("Count <", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountLessThanOrEqualTo(Long value) {
			addCriterion("Count <=", value, "count");
			return (Criteria) this;
		}

		public Criteria andCountIn(List<Long> values) {
			addCriterion("Count in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotIn(List<Long> values) {
			addCriterion("Count not in", values, "count");
			return (Criteria) this;
		}

		public Criteria andCountBetween(Long value1, Long value2) {
			addCriterion("Count between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andCountNotBetween(Long value1, Long value2) {
			addCriterion("Count not between", value1, value2, "count");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNull() {
			addCriterion("Remarks is null");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNotNull() {
			addCriterion("Remarks is not null");
			return (Criteria) this;
		}

		public Criteria andRemarksEqualTo(String value) {
			addCriterion("Remarks =", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotEqualTo(String value) {
			addCriterion("Remarks <>", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThan(String value) {
			addCriterion("Remarks >", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThanOrEqualTo(String value) {
			addCriterion("Remarks >=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThan(String value) {
			addCriterion("Remarks <", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThanOrEqualTo(String value) {
			addCriterion("Remarks <=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLike(String value) {
			addCriterion("Remarks like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotLike(String value) {
			addCriterion("Remarks not like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksIn(List<String> values) {
			addCriterion("Remarks in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotIn(List<String> values) {
			addCriterion("Remarks not in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksBetween(String value1, String value2) {
			addCriterion("Remarks between", value1, value2, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotBetween(String value1, String value2) {
			addCriterion("Remarks not between", value1, value2, "remarks");
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

		public Criteria andPrefixFkIsNull() {
			addCriterion("Prefix_fk is null");
			return (Criteria) this;
		}

		public Criteria andPrefixFkIsNotNull() {
			addCriterion("Prefix_fk is not null");
			return (Criteria) this;
		}

		public Criteria andPrefixFkEqualTo(Long value) {
			addCriterion("Prefix_fk =", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkNotEqualTo(Long value) {
			addCriterion("Prefix_fk <>", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkGreaterThan(Long value) {
			addCriterion("Prefix_fk >", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkGreaterThanOrEqualTo(Long value) {
			addCriterion("Prefix_fk >=", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkLessThan(Long value) {
			addCriterion("Prefix_fk <", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkLessThanOrEqualTo(Long value) {
			addCriterion("Prefix_fk <=", value, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkIn(List<Long> values) {
			addCriterion("Prefix_fk in", values, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkNotIn(List<Long> values) {
			addCriterion("Prefix_fk not in", values, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkBetween(Long value1, Long value2) {
			addCriterion("Prefix_fk between", value1, value2, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andPrefixFkNotBetween(Long value1, Long value2) {
			addCriterion("Prefix_fk not between", value1, value2, "prefixFk");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNull() {
			addCriterion("UpdateTime is null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIsNotNull() {
			addCriterion("UpdateTime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeEqualTo(Date value) {
			addCriterion("UpdateTime =", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotEqualTo(Date value) {
			addCriterion("UpdateTime <>", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThan(Date value) {
			addCriterion("UpdateTime >", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("UpdateTime >=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThan(Date value) {
			addCriterion("UpdateTime <", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
			addCriterion("UpdateTime <=", value, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeIn(List<Date> values) {
			addCriterion("UpdateTime in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotIn(List<Date> values) {
			addCriterion("UpdateTime not in", values, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeBetween(Date value1, Date value2) {
			addCriterion("UpdateTime between", value1, value2, "updatetime");
			return (Criteria) this;
		}

		public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
			addCriterion("UpdateTime not between", value1, value2, "updatetime");
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

		public Criteria andUpdatebyEqualTo(Long value) {
			addCriterion("UpdateBy =", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotEqualTo(Long value) {
			addCriterion("UpdateBy <>", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThan(Long value) {
			addCriterion("UpdateBy >", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyGreaterThanOrEqualTo(Long value) {
			addCriterion("UpdateBy >=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThan(Long value) {
			addCriterion("UpdateBy <", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyLessThanOrEqualTo(Long value) {
			addCriterion("UpdateBy <=", value, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyIn(List<Long> values) {
			addCriterion("UpdateBy in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotIn(List<Long> values) {
			addCriterion("UpdateBy not in", values, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyBetween(Long value1, Long value2) {
			addCriterion("UpdateBy between", value1, value2, "updateby");
			return (Criteria) this;
		}

		public Criteria andUpdatebyNotBetween(Long value1, Long value2) {
			addCriterion("UpdateBy not between", value1, value2, "updateby");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table phoneseven
	 * @mbg.generated  Sun Apr 23 20:19:45 CST 2017
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
     * This class corresponds to the database table phoneseven
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 23 14:36:06 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}