package com.niu.springbootmybatis.model;

import java.util.ArrayList;
import java.util.List;

public class SysDictExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private String sumCol;

	private Integer offset;

	private Integer limit;

	public SysDictExample() {

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

	public SysDictExample sumId() {

		this.sumCol = "id";
		return this;
	}

	public SysDictExample sumCode() {

		this.sumCol = "code";
		return this;
	}

	public SysDictExample sumName() {

		this.sumCol = "name";
		return this;
	}

	public SysDictExample sumValue() {

		this.sumCol = "value";
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

	public SysDictExample page(int offset, int limit) {

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

		public Criteria andCodeIsNull() {

			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {

			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {

			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {

			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {

			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {

			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {

			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {

			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {

			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {

			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {

			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {

			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {

			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {

			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {

			addCriterion("`name` is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {

			addCriterion("`name` is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {

			addCriterion("`name` =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {

			addCriterion("`name` <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {

			addCriterion("`name` >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {

			addCriterion("`name` >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {

			addCriterion("`name` <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {

			addCriterion("`name` <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {

			addCriterion("`name` like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {

			addCriterion("`name` not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {

			addCriterion("`name` in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {

			addCriterion("`name` not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {

			addCriterion("`name` between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {

			addCriterion("`name` not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andValueIsNull() {

			addCriterion("`value` is null");
			return (Criteria) this;
		}

		public Criteria andValueIsNotNull() {

			addCriterion("`value` is not null");
			return (Criteria) this;
		}

		public Criteria andValueEqualTo(String value) {

			addCriterion("`value` =", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotEqualTo(String value) {

			addCriterion("`value` <>", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThan(String value) {

			addCriterion("`value` >", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueGreaterThanOrEqualTo(String value) {

			addCriterion("`value` >=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThan(String value) {

			addCriterion("`value` <", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLessThanOrEqualTo(String value) {

			addCriterion("`value` <=", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueLike(String value) {

			addCriterion("`value` like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotLike(String value) {

			addCriterion("`value` not like", value, "value");
			return (Criteria) this;
		}

		public Criteria andValueIn(List<String> values) {

			addCriterion("`value` in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotIn(List<String> values) {

			addCriterion("`value` not in", values, "value");
			return (Criteria) this;
		}

		public Criteria andValueBetween(String value1, String value2) {

			addCriterion("`value` between", value1, value2, "value");
			return (Criteria) this;
		}

		public Criteria andValueNotBetween(String value1, String value2) {

			addCriterion("`value` not between", value1, value2, "value");
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