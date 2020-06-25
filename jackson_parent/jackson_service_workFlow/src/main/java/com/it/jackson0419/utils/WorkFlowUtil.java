package com.it.jackson0419.utils;

import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.WorkflowVO;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class WorkFlowUtil {

    private static ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

    public static ResultVO deploy(WorkflowVO workflowVO) {
        Deployment deployment = processEngine.getRepositoryService().createDeployment()
                .name(workflowVO.getProcessName())
                .addClasspathResource(workflowVO.getProcessFileName())
                .addClasspathResource(workflowVO.getProcessFilePNG())
                .deploy();
        workflowVO.setData(deployment);
        return ResultUtil.ResultUtil(workflowVO);
    }

    public static ResultVO start(WorkflowVO workflowVO) {
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("userID", 889459);
        String businessValue = "bill.001";
        variables.put("objID", businessValue);
        ProcessInstance pi = processEngine.getRuntimeService()
                .startProcessInstanceByKey(workflowVO.getProcessDefinitionKey(), businessValue, variables);
        workflowVO.setData(pi);
        return ResultUtil.ResultUtil(workflowVO);
    }
}
