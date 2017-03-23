package com.gafker.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class FamilymessageskindsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public FamilymessageskindsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table familymessageskinds
	 * @mbggenerated  Sun Feb 19 19:50:51 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familymessageskinds
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

		public Criteria andParentidIsNull() {
			addCriterion("ParentId is null");
			return (Criteria) this;
		}

		public Criteria andParentidIsNotNull() {
			addCriterion("ParentId is not null");
			return (Criteria) this;
		}

		public Criteria andParentidEqualTo(Integer value) {
			addCriterion("ParentId =", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotEqualTo(Integer value) {
			addCriterion("ParentId <>", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidGreaterThan(Integer value) {
			addCriterion("ParentId >", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
			addCriterion("ParentId >=", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidLessThan(Integer value) {
			addCriterion("ParentId <", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidLessThanOrEqualTo(Integer value) {
			addCriterion("ParentId <=", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidIn(List<Integer> values) {
			addCriterion("ParentId in", values, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotIn(List<Integer> values) {
			addCriterion("ParentId not in", values, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidBetween(Integer value1, Integer value2) {
			addCriterion("ParentId between", value1, value2, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotBetween(Integer value1, Integer value2) {
			addCriterion("ParentId not between", value1, value2, "parentid");
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
			addCriterion("QrCode is null");
			return (Criteria) this;
		}

		public Criteria andQrcodeIsNotNull() {
			addCriterion("QrCode is not null");
			return (Criteria) this;
		}

		public Criteria andQrcodeEqualTo(String value) {
			addCriterion("QrCode =", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotEqualTo(String value) {
			addCriterion("QrCode <>", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeGreaterThan(String value) {
			addCriterion("QrCode >", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
			addCriterion("QrCode >=", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLessThan(String value) {
			addCriterion("QrCode <", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLessThanOrEqualTo(String value) {
			addCriterion("QrCode <=", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeLike(String value) {
			addCriterion("QrCode like", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotLike(String value) {
			addCriterion("QrCode not like", value, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeIn(List<String> values) {
			addCriterion("QrCode in", values, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotIn(List<String> values) {
			addCriterion("QrCode not in", values, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeBetween(String value1, String value2) {
			addCriterion("QrCode between", value1, value2, "qrcode");
			return (Criteria) this;
		}

		public Criteria andQrcodeNotBetween(String value1, String value2) {
			addCriterion("QrCode not between", value1, value2, "qrcode");
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
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table familymessageskinds
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
     * This class corresponds to the database table familymessageskinds
     *
     * @mbggenerated do_not_delete_during_merge Fri Feb 17 09:21:29 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}