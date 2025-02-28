package com.niu.springbootmybatis.model;

import java.util.ArrayList;
import java.util.List;

public class SysRolePrivilegeExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	private String sumCol;

	private Integer offset;

	private Integer limit;

	public SysRolePrivilegeExample() {

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

	public SysRolePrivilegeExample sumRoleId() {

		this.sumCol = "role_id";
		return this;
	}

	public SysRolePrivilegeExample sumPrivilegeId() {

		this.sumCol = "privilege_id";
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

	public SysRolePrivilegeExample page(int offset, int limit) {

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

		public Criteria andRoleIdIsNull() {

			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {

			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Long value) {

			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Long value) {

			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Long value) {

			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {

			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Long value) {

			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Long value) {

			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Long> values) {

			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Long> values) {

			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Long value1, Long value2) {

			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Long value1, Long value2) {

			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdIsNull() {

			addCriterion("privilege_id is null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdIsNotNull() {

			addCriterion("privilege_id is not null");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdEqualTo(Long value) {

			addCriterion("privilege_id =", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotEqualTo(Long value) {

			addCriterion("privilege_id <>", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdGreaterThan(Long value) {

			addCriterion("privilege_id >", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdGreaterThanOrEqualTo(Long value) {

			addCriterion("privilege_id >=", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdLessThan(Long value) {

			addCriterion("privilege_id <", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdLessThanOrEqualTo(Long value) {

			addCriterion("privilege_id <=", value, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdIn(List<Long> values) {

			addCriterion("privilege_id in", values, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotIn(List<Long> values) {

			addCriterion("privilege_id not in", values, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdBetween(Long value1, Long value2) {

			addCriterion("privilege_id between", value1, value2, "privilegeId");
			return (Criteria) this;
		}

		public Criteria andPrivilegeIdNotBetween(Long value1, Long value2) {

			addCriterion("privilege_id not between", value1, value2, "privilegeId");
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