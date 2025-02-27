export enum FilterSlotNameEnum {
  TEST_PLAN_STATUS_FILTER = 'TEST_PLAN_STATUS_FILTER', // 测试计划执行结果
  CASE_MANAGEMENT_EXECUTE_RESULT = 'CASE_MANAGEMENT_EXECUTE_RESULT', // 功能用例执行结果
  CASE_MANAGEMENT_REVIEW_RESULT = 'CASE_MANAGEMENT_REVIEW_RESULT', // 功能用例评审结果
  CASE_MANAGEMENT_REVIEW_STATUS = 'CASE_MANAGEMENT_REVIEW_STATUS', // 用例评审评审状态
  CASE_MANAGEMENT_CASE_LEVEL = 'CASE_MANAGEMENT_CASE_LEVEL', // 用例等级
  CASE_MANAGEMENT_BUG_STATE = 'CASE_MANAGEMENT_BUG_STATE', // 缺陷状态
  API_TEST_API_REQUEST_METHODS = 'API_TEST_API_REQUEST_METHODS', // 接口测试请求方式
  API_TEST_API_REQUEST_API_STATUS = 'API_TEST_API_REQUEST_API_STATUS', // 接口测试接口状态
  API_TEST_API_RESPONSE_ASSERTION_STATUS = 'API_TEST_API_RESPONSE_ASSERTION_STATUS', // 接口测试-响应断言状态
  TEST_PLAN_REPORT_EXEC_STATUS = 'TEST_PLAN_REPORT_EXEC_STATUS',
  PROJECT_MANAGEMENT_COMMON_SCRIPT = 'PROJECT_MANAGEMENT_COMMON_SCRIPT', // 项目管理公共脚本脚本状态
  GLOBAL_TASK_CENTER_API_CASE_STATUS = 'GLOBAL_TASK_CENTER_API_CASE_STATUS', // 任务中心执行状态
  GLOBAL_TASK_CENTER_API_CASE_TRIGGED_MODE = 'GLOBAL_TASK_CENTER_API_CASE_TRIGGED_MODE', // 任务中心触发方式
  API_TEST_CASE_API_STATUS = 'API_TEST_CASE_API_STATUS', // 接口测试-定义-用例列表-接口状态
  API_TEST_CASE_API_LAST_EXECUTE_STATUS = 'API_TEST_CASE_API_LAST_EXECUTE_STATUS', // 接口测试-定义-用例列表-最后执行状态
  API_TEST_CASE_API_REPORT_TRIGGED_METHOD = 'API_TEST_CASE_API_REPORT_TRIGGED_METHOD', // 接口测试-定义-用例列表-最后执行状态
  API_TEST_CASE_API_REPORT_EXECUTE_RESULT = 'API_TEST_CASE_API_REPORT_EXECUTE_RESULT', // 接口测试-定义-用例变更历史-最后执行结果
  GLOBAL_CHANGE_HISTORY_TYPE = 'GLOBAL_CHANGE_HISTORY_TYPE', // 变更历史类型
  API_TEST_SCENARIO_EXECUTE_RESULT = 'API_TEST_SCENARIO_EXECUTE_RESULT', // 接口测试-场景-变更历史-执行结果
  API_TEST_REPORT_TYPE = 'API_TEST_REPORT_TYPE', // 接口测试-报告-报告类型
  API_TEST_CASE_API_REPORT_STATUS = 'API_TEST_CASE_API_REPORT_STATUS', // 接口测试-定义-用例列表-报告状态
  GLOBAL_TASK_CENTER_EXEC_STATUS = 'GLOBAL_TASK_CENTER_EXEC_STATUS', // 任务中心-执行状态
  GLOBAL_TASK_CENTER_EXEC_RESULT = 'GLOBAL_TASK_CENTER_EXEC_RESULT', // 任务中心-执行结果
  GLOBAL_TASK_CENTER_EXEC_METHOD = 'GLOBAL_TASK_CENTER_EXEC_METHOD', // 任务中心-执行方式
  GLOBAL_TASK_CENTER_SYSTEM_TASK_TYPE = 'GLOBAL_TASK_CENTER_SYSTEM_TASK_TYPE', // 任务中心-后台任务类型
  GLOBAL_TASK_CENTER_SYSTEM_TASK_STATUS = 'GLOBAL_TASK_CENTER_SYSTEM_TASK_STATUS', // 任务中心-后台任务状态
  GLOBAL_TASK_CENTER_BELONG_PROJECT = 'GLOBAL_TASK_CENTER_BELONG_PROJECT', // 任务中心-所属项目
}

export enum FilterRemoteMethodsEnum {
  PROJECT_PERMISSION_MEMBER = 'PROJECT_PERMISSION_MEMBER', // 项目下成员
  SYSTEM_ORGANIZATION_LIST = 'SYSTEM_ORGANIZATION_LIST', // 组织列表
  SYSTEM_PROJECT_LIST = 'SYSTEM_PROJECT_LIST', // 系统下项目
  SYSTEM_ORGANIZATION_PROJECT = 'SYSTEM_ORGANIZATION_PROJECT', // 组织下项目
  EXECUTE_USER = 'EXECUTE_USER',
}

export default {};
