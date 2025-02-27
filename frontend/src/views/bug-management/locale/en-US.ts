export default {
  bugManagement: {
    createBug: 'Create Bug',
    copyBug: 'Copy Bug',
    syncBug: 'Sync Bug',
    ID: 'ID',
    project: 'Project',
    bugName: 'Bug Name',
    severity: 'Severity',
    status: 'Status',
    handleMan: 'Handler',
    handleManTips: '"-"Indicates that the user member has been removed or does not exist in the system',
    numberOfCase: 'Cases',
    belongPlatform: 'Platform',
    tag: 'Tag',
    creator: 'Creator',
    updateUser: 'Updater',
    createTime: 'Create Time',
    updateTime: 'Update Time',
    index: 'Bug',
    addBug: 'Create Bug',
    editBug: 'Edit Bug',
    sync: 'Sync',
    synchronizing: 'Synchronizing',
    syncSuccess: 'Synchronous success',
    syncBugTipRowOne:
      'Synchronize third-party platform bug to MS as configured in << Project Management - Application Settings - Defect Management >>',
    bugAutoSync: 'System will auto sync by the project application setting frequency',
    syncTime: 'Sync time',
    deleteLabel: 'Local bug will in recycle bin and third plant bug will be deleted',
    nameIsIncorrect: 'Bug name error',
    selectedCount: '( {count} selected)',
    batchEdit: 'Batch edit',
    selectProps: 'select props',
    exportBug: 'export bug',
    exportBugCount: ' {count} selected',
    deleteCount: 'delete {count} bugs？',
    deleteTipInternal: ' {count} numbers of bug witch created by MeterSphere will in recycle bin',
    deleteTipExternal: '{count} numbers of bug will be deleted',
    deleteTip: 'Local bug will in recycle bin and third plant bug will be deleted',
    edit: {
      defaultSystemTemplate: 'System template is defaulted',
      content: 'Bug content',
      file: 'Attachment files',
      fileExtra: 'Max of file is {size}MB',
      pleaseInputBugName: 'Please input bug name',
      nameIsRequired: 'Bug name cannot be empty',
      pleaseInputBugContent: 'Please input bug content',
      tagPlaceholder: 'Add label by entry',
      handleManPlaceholder: 'Please select handler',
      handleManIsRequired: 'Handler cannot be empty',
      statusPlaceholder: 'Please select status',
      statusIsRequired: 'Status cannot be empty',
      severityPlaceholder: 'Please select severity',
      uploadFile: 'Add file',
      localUpload: 'Local upload',
      linkFile: 'Link file',
      contentEdit: 'Content edit',
      linkCase: 'Link case',
      cannotBeNull: 'is empty',
    },
    detail: {
      notExist: 'Bug not exist',
      title: '【{id}】{name}',
      apiCase: 'API Case',
      scenarioCase: 'Scenario Case',
      uiCase: 'UI Case',
      performanceCase: 'Performance Case',
      isPlanRelateCase: 'Relate plan',
      isPlanRelateCaseTip1: '在测试计划内执行用例时新建或关联的缺陷, 只可在测试计划内取消关联关系;',
      isPlanRelateCaseTip2: '缺陷在测试计划内执行用例时关联/新建, 显示为“是”;',
      isPlanRelateCaseTip3: '缺陷在缺陷页/用例详情页添加直接关联关系, 未关联上任何测试计划, 显示为“否”;',
      searchCase: 'Search by name',
      creator: 'Creator',
      createTime: 'Create Time',
      basicInfo: 'Basic Info',
      handleUser: 'Handler',
      tag: 'Label',
      detail: 'Detail',
      case: 'Case',
      changeHistory: 'Change History',
      comment: 'Comment',
      shareTip: 'Share link has been copied to clipboard',
      deleteTitle: 'Delete {name} ？',
      deleteContent: 'Local bug will in recycle bin and third plant bug will be deleted',
      platform_no_active: 'The bug platform has not been integrated, can not preview and edit details normally',
    },
    batchUpdate: {
      attribute: 'Select attribute',
      update: 'Batch update to',
      updatePlaceholder: 'Choose update option',
      appendLabel: 'Append label',
      systemFiled: 'System field',
      customFiled: 'Custom field',
      append: 'append',
      openAppend: 'Open: Append field',
      closeAppend: 'Close: Cover original field',
      handleUser: 'Handler',
      tag: 'Label',
      required: {
        attribute: 'Attribute cannot be empty',
        value: 'Value cannot be empty',
      },
    },
    success: {
      countDownTip: 'Return to bug list , or manually return to bug list',
      bugDetail: 'Bug detail',
      addContinueCreate: 'Add continue',
      backBugList: 'Return to bug list',
      notNextTip: 'Not remind next time',
      mightWantTo: 'You might want to',
      caseRelated: 'Related cases',
    },
    recycle: {
      recycleBin: 'Recycle',
      recover: 'Recover',
      recovering: 'Recovering',
      recoverSuccess: 'Recover success',
      recoverError: 'Recover failed',
      permanentlyDelete: 'Permanently delete',
      permanentlyDeleteTip: 'Permanently delete {name} ?',
      deleteContent: 'Permanently delete bug cannot be recovered, please operate carefully!',
      batchDelete: 'Permanently delete {count} ?',
      searchPlaceholder: 'Search by ID or name',
      deleteTime: 'Delete time',
      deleteMan: 'Delete user',
    },
    history: {
      changeNumber: 'Change number',
      operationMan: 'Operator',
      operation: 'Operation',
      updateTime: 'Update time',
      restore: 'Restore',
      current: 'Current',
    },
  },
};
