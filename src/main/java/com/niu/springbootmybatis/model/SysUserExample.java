package com.niu.springbootmybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private String sumCol;

	private Integer offset;

	private Integer limit;

	public SysUserExample() {

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

	public SysUserExample sumId() {

		this.sumCol = "id";
		return this;
	}

	public SysUserExample sumUserName() {

		this.sumCol = "user_name";
		return this;
	}

	public SysUserExample sumUserPassword() {

		this.sumCol = "user_password";
		return this;
	}

	public SysUserExample sumUserEmail() {

		this.sumCol = "user_email";
		return this;
	}

	public SysUserExample sumCreateTime() {

		this.sumCol = "create_time";
		return this;
	}

	public SysUserExample sumUserInfo() {

		this.sumCol = "user_info";
		return this;
	}

	public SysUserExample sumHeadImg() {

		this.sumCol = "head_img";
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

	public SysUserExample page(int offset, int limit) {

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

		public Criteria andUserNameIsNull() {

			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {

			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {

			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {

			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {

			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {

			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {

			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {

			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {

			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {

			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {

			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {

			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {

			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {

			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNull() {

			addCriterion("user_password is null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNotNull() {

			addCriterion("user_password is not null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordEqualTo(String value) {

			addCriterion("user_password =", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotEqualTo(String value) {

			addCriterion("user_password <>", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThan(String value) {

			addCriterion("user_password >", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {

			addCriterion("user_password >=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThan(String value) {

			addCriterion("user_password <", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThanOrEqualTo(String value) {

			addCriterion("user_password <=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLike(String value) {

			addCriterion("user_password like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotLike(String value) {

			addCriterion("user_password not like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIn(List<String> values) {

			addCriterion("user_password in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotIn(List<String> values) {

			addCriterion("user_password not in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordBetween(String value1, String value2) {

			addCriterion("user_password between", value1, value2, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotBetween(String value1, String value2) {

			addCriterion("user_password not between", value1, value2, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNull() {

			addCriterion("user_email is null");
			return (Criteria) this;
		}

		public Criteria andUserEmailIsNotNull() {

			addCriterion("user_email is not null");
			return (Criteria) this;
		}

		public Criteria andUserEmailEqualTo(String value) {

			addCriterion("user_email =", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotEqualTo(String value) {

			addCriterion("user_email <>", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThan(String value) {

			addCriterion("user_email >", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailGreaterThanOrEqualTo(String value) {

			addCriterion("user_email >=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThan(String value) {

			addCriterion("user_email <", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLessThanOrEqualTo(String value) {

			addCriterion("user_email <=", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailLike(String value) {

			addCriterion("user_email like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotLike(String value) {

			addCriterion("user_email not like", value, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailIn(List<String> values) {

			addCriterion("user_email in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotIn(List<String> values) {

			addCriterion("user_email not in", values, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailBetween(String value1, String value2) {

			addCriterion("user_email between", value1, value2, "userEmail");
			return (Criteria) this;
		}

		public Criteria andUserEmailNotBetween(String value1, String value2) {

			addCriterion("user_email not between", value1, value2, "userEmail");
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