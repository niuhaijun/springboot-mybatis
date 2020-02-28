package com.niu.springbootmybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DataExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public DataExample() {

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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {

			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values,
			String property) {

			if (values == null || values.size() == 0) {
				throw new RuntimeException(
					"Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2,
			String property) {

			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
				new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andDateIsNull() {

			addCriterion("`date` is null");
			return (Criteria) this;
		}

		public Criteria andDateIsNotNull() {

			addCriterion("`date` is not null");
			return (Criteria) this;
		}

		public Criteria andDateEqualTo(Date value) {

			addCriterionForJDBCDate("`date` =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {

			addCriterionForJDBCDate("`date` <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {

			addCriterionForJDBCDate("`date` >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {

			addCriterionForJDBCDate("`date` >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {

			addCriterionForJDBCDate("`date` <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {

			addCriterionForJDBCDate("`date` <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {

			addCriterionForJDBCDate("`date` in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {

			addCriterionForJDBCDate("`date` not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {

			addCriterionForJDBCDate("`date` between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {

			addCriterionForJDBCDate("`date` not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andTaskIdIsNull() {

			addCriterion("task_id is null");
			return (Criteria) this;
		}

		public Criteria andTaskIdIsNotNull() {

			addCriterion("task_id is not null");
			return (Criteria) this;
		}

		public Criteria andTaskIdEqualTo(String value) {

			addCriterion("task_id =", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdNotEqualTo(String value) {

			addCriterion("task_id <>", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdGreaterThan(String value) {

			addCriterion("task_id >", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdGreaterThanOrEqualTo(String value) {

			addCriterion("task_id >=", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdLessThan(String value) {

			addCriterion("task_id <", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdLessThanOrEqualTo(String value) {

			addCriterion("task_id <=", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdLike(String value) {

			addCriterion("task_id like", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdNotLike(String value) {

			addCriterion("task_id not like", value, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdIn(List<String> values) {

			addCriterion("task_id in", values, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdNotIn(List<String> values) {

			addCriterion("task_id not in", values, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdBetween(String value1, String value2) {

			addCriterion("task_id between", value1, value2, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskIdNotBetween(String value1, String value2) {

			addCriterion("task_id not between", value1, value2, "taskId");
			return (Criteria) this;
		}

		public Criteria andTaskTypeIsNull() {

			addCriterion("task_type is null");
			return (Criteria) this;
		}

		public Criteria andTaskTypeIsNotNull() {

			addCriterion("task_type is not null");
			return (Criteria) this;
		}

		public Criteria andTaskTypeEqualTo(String value) {

			addCriterion("task_type =", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeNotEqualTo(String value) {

			addCriterion("task_type <>", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeGreaterThan(String value) {

			addCriterion("task_type >", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {

			addCriterion("task_type >=", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeLessThan(String value) {

			addCriterion("task_type <", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeLessThanOrEqualTo(String value) {

			addCriterion("task_type <=", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeLike(String value) {

			addCriterion("task_type like", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeNotLike(String value) {

			addCriterion("task_type not like", value, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeIn(List<String> values) {

			addCriterion("task_type in", values, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeNotIn(List<String> values) {

			addCriterion("task_type not in", values, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeBetween(String value1, String value2) {

			addCriterion("task_type between", value1, value2, "taskType");
			return (Criteria) this;
		}

		public Criteria andTaskTypeNotBetween(String value1, String value2) {

			addCriterion("task_type not between", value1, value2, "taskType");
			return (Criteria) this;
		}

		public Criteria andNumIsNull() {

			addCriterion("num is null");
			return (Criteria) this;
		}

		public Criteria andNumIsNotNull() {

			addCriterion("num is not null");
			return (Criteria) this;
		}

		public Criteria andNumEqualTo(Long value) {

			addCriterion("num =", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotEqualTo(Long value) {

			addCriterion("num <>", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumGreaterThan(Long value) {

			addCriterion("num >", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumGreaterThanOrEqualTo(Long value) {

			addCriterion("num >=", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumLessThan(Long value) {

			addCriterion("num <", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumLessThanOrEqualTo(Long value) {

			addCriterion("num <=", value, "num");
			return (Criteria) this;
		}

		public Criteria andNumIn(List<Long> values) {

			addCriterion("num in", values, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotIn(List<Long> values) {

			addCriterion("num not in", values, "num");
			return (Criteria) this;
		}

		public Criteria andNumBetween(Long value1, Long value2) {

			addCriterion("num between", value1, value2, "num");
			return (Criteria) this;
		}

		public Criteria andNumNotBetween(Long value1, Long value2) {

			addCriterion("num not between", value1, value2, "num");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {

			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {

			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {

			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {

			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {

			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {

			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {

			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {

			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {

			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {

			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {

			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {

			addCriterion("create_time not between", value1, value2, "createTime");
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