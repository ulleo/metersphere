package io.metersphere.system.domain;

import java.util.ArrayList;
import java.util.List;

public class UserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andViewTypeIsNull() {
            addCriterion("view_type is null");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("view_type is not null");
            return (Criteria) this;
        }

        public Criteria andViewTypeEqualTo(String value) {
            addCriterion("view_type =", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotEqualTo(String value) {
            addCriterion("view_type <>", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThan(String value) {
            addCriterion("view_type >", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("view_type >=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThan(String value) {
            addCriterion("view_type <", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(String value) {
            addCriterion("view_type <=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLike(String value) {
            addCriterion("view_type like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotLike(String value) {
            addCriterion("view_type not like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeIn(List<String> values) {
            addCriterion("view_type in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotIn(List<String> values) {
            addCriterion("view_type not in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeBetween(String value1, String value2) {
            addCriterion("view_type between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotBetween(String value1, String value2) {
            addCriterion("view_type not between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNull() {
            addCriterion("scope_id is null");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNotNull() {
            addCriterion("scope_id is not null");
            return (Criteria) this;
        }

        public Criteria andScopeIdEqualTo(String value) {
            addCriterion("scope_id =", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotEqualTo(String value) {
            addCriterion("scope_id <>", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThan(String value) {
            addCriterion("scope_id >", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThanOrEqualTo(String value) {
            addCriterion("scope_id >=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThan(String value) {
            addCriterion("scope_id <", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThanOrEqualTo(String value) {
            addCriterion("scope_id <=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLike(String value) {
            addCriterion("scope_id like", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotLike(String value) {
            addCriterion("scope_id not like", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdIn(List<String> values) {
            addCriterion("scope_id in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotIn(List<String> values) {
            addCriterion("scope_id not in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdBetween(String value1, String value2) {
            addCriterion("scope_id between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotBetween(String value1, String value2) {
            addCriterion("scope_id not between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andPosIsNull() {
            addCriterion("pos is null");
            return (Criteria) this;
        }

        public Criteria andPosIsNotNull() {
            addCriterion("pos is not null");
            return (Criteria) this;
        }

        public Criteria andPosEqualTo(Long value) {
            addCriterion("pos =", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotEqualTo(Long value) {
            addCriterion("pos <>", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThan(Long value) {
            addCriterion("pos >", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThanOrEqualTo(Long value) {
            addCriterion("pos >=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThan(Long value) {
            addCriterion("pos <", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThanOrEqualTo(Long value) {
            addCriterion("pos <=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosIn(List<Long> values) {
            addCriterion("pos in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotIn(List<Long> values) {
            addCriterion("pos not in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosBetween(Long value1, Long value2) {
            addCriterion("pos between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotBetween(Long value1, Long value2) {
            addCriterion("pos not between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andSearchModeIsNull() {
            addCriterion("search_mode is null");
            return (Criteria) this;
        }

        public Criteria andSearchModeIsNotNull() {
            addCriterion("search_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSearchModeEqualTo(String value) {
            addCriterion("search_mode =", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotEqualTo(String value) {
            addCriterion("search_mode <>", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeGreaterThan(String value) {
            addCriterion("search_mode >", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeGreaterThanOrEqualTo(String value) {
            addCriterion("search_mode >=", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLessThan(String value) {
            addCriterion("search_mode <", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLessThanOrEqualTo(String value) {
            addCriterion("search_mode <=", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLike(String value) {
            addCriterion("search_mode like", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotLike(String value) {
            addCriterion("search_mode not like", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeIn(List<String> values) {
            addCriterion("search_mode in", values, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotIn(List<String> values) {
            addCriterion("search_mode not in", values, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeBetween(String value1, String value2) {
            addCriterion("search_mode between", value1, value2, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotBetween(String value1, String value2) {
            addCriterion("search_mode not between", value1, value2, "searchMode");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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
}