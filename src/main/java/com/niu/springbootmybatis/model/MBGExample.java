package com.niu.springbootmybatis.model;

import java.util.ArrayList;
import java.util.List;

public class MBGExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private String sumCol;

	private Integer offset;

	private Integer limit;

	public MBGExample() {

		oredCriteria = new ArrayList<Criteria>();
	}

	public String getOrderByClause() {

		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {

		this.orderByClause = orderByClause;
	}

	public boolean isDistinct() {

		return distinct;
	}

	public void setDistinct(boolean distinct) {

		this.distinct = distinct;
	}

	public List<Criteria> getOredCriteria() {

		return oredCriteria;
	}

	public void or(Criteria criteria) {

		oredCriteria.add(criteria);
	}

	public Criteria or() {

		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {

		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {

		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {

		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
		this.sumCol = null;
		this.offset = null;
		this.limit = null;
	}

	public String getSumCol() {

		return this.sumCol;
	}

	public void setSumCol(String sumCol) {

		this.sumCol = sumCol;
	}

	public MBGExample sumUid() {

		this.sumCol = "uid";
		return this;
	}

	public MBGExample sumUuid() {

		this.sumCol = "uuid";
		return this;
	}

	public MBGExample sumKid() {

		this.sumCol = "kid";
		return this;
	}

	public Integer getOffset() {

		return this.offset;
	}

	public void setOffset(Integer offset) {

		this.offset = offset;
	}

	public Integer getLimit() {

		return this.limit;
	}

	public void setLimit(Integer limit) {

		this.limit = limit;
	}

	public MBGExample page(int offset, int limit) {

		this.offset = offset;
		this.limit = limit;
		return this;
	}

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

		protected void addCriterion(String condition, Object value1, Object value2,
			String property) {

			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUidIsNull() {

			addCriterion("`uid` is null");
			return (Criteria) this;
		}

		public Criteria andUidIsNotNull() {

			addCriterion("`uid` is not null");
			return (Criteria) this;
		}

		public Criteria andUidEqualTo(String value) {

			addCriterion("`uid` =", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotEqualTo(String value) {

			addCriterion("`uid` <>", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThan(String value) {

			addCriterion("`uid` >", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidGreaterThanOrEqualTo(String value) {

			addCriterion("`uid` >=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThan(String value) {

			addCriterion("`uid` <", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLessThanOrEqualTo(String value) {

			addCriterion("`uid` <=", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidLike(String value) {

			addCriterion("`uid` like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotLike(String value) {

			addCriterion("`uid` not like", value, "uid");
			return (Criteria) this;
		}

		public Criteria andUidIn(List<String> values) {

			addCriterion("`uid` in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotIn(List<String> values) {

			addCriterion("`uid` not in", values, "uid");
			return (Criteria) this;
		}

		public Criteria andUidBetween(String value1, String value2) {

			addCriterion("`uid` between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUidNotBetween(String value1, String value2) {

			addCriterion("`uid` not between", value1, value2, "uid");
			return (Criteria) this;
		}

		public Criteria andUuidIsNull() {

			addCriterion("uuid is null");
			return (Criteria) this;
		}

		public Criteria andUuidIsNotNull() {

			addCriterion("uuid is not null");
			return (Criteria) this;
		}

		public Criteria andUuidEqualTo(String value) {

			addCriterion("uuid =", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotEqualTo(String value) {

			addCriterion("uuid <>", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThan(String value) {

			addCriterion("uuid >", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidGreaterThanOrEqualTo(String value) {

			addCriterion("uuid >=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThan(String value) {

			addCriterion("uuid <", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLessThanOrEqualTo(String value) {

			addCriterion("uuid <=", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidLike(String value) {

			addCriterion("uuid like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotLike(String value) {

			addCriterion("uuid not like", value, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidIn(List<String> values) {

			addCriterion("uuid in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotIn(List<String> values) {

			addCriterion("uuid not in", values, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidBetween(String value1, String value2) {

			addCriterion("uuid between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andUuidNotBetween(String value1, String value2) {

			addCriterion("uuid not between", value1, value2, "uuid");
			return (Criteria) this;
		}

		public Criteria andKidIsNull() {

			addCriterion("kid is null");
			return (Criteria) this;
		}

		public Criteria andKidIsNotNull() {

			addCriterion("kid is not null");
			return (Criteria) this;
		}

		public Criteria andKidEqualTo(String value) {

			addCriterion("kid =", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidNotEqualTo(String value) {

			addCriterion("kid <>", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidGreaterThan(String value) {

			addCriterion("kid >", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidGreaterThanOrEqualTo(String value) {

			addCriterion("kid >=", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidLessThan(String value) {

			addCriterion("kid <", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidLessThanOrEqualTo(String value) {

			addCriterion("kid <=", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidLike(String value) {

			addCriterion("kid like", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidNotLike(String value) {

			addCriterion("kid not like", value, "kid");
			return (Criteria) this;
		}

		public Criteria andKidIn(List<String> values) {

			addCriterion("kid in", values, "kid");
			return (Criteria) this;
		}

		public Criteria andKidNotIn(List<String> values) {

			addCriterion("kid not in", values, "kid");
			return (Criteria) this;
		}

		public Criteria andKidBetween(String value1, String value2) {

			addCriterion("kid between", value1, value2, "kid");
			return (Criteria) this;
		}

		public Criteria andKidNotBetween(String value1, String value2) {

			addCriterion("kid not between", value1, value2, "kid");
			return (Criteria) this;
		}

		public Criteria addConditionSql(String conditionSql) {

			addCriterion(conditionSql);
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {

			super();
		}
	}

	public static class Criterion {

		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

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
			}
			else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {

			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
			String typeHandler) {

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
	}
}