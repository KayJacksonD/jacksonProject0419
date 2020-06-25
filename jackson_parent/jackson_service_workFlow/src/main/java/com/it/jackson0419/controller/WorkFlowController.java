package com.it.jackson0419.controller;

import com.it.jackson0419.service.IWorkFlowService;
import com.it.jackson0419.utils.WorkFlowUtil;
import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.WorkflowVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workFlow")
public class WorkFlowController {
    @Autowired
    IWorkFlowService workFlowService;

    @PostMapping("/deployProcess")
    ResultVO deployProcess(@RequestBody(required = false) WorkflowVO workflowVO) {
        ResultVO deployResult = WorkFlowUtil.deploy(workflowVO);
        return deployResult;
    }

    @PostMapping("/startProcess")
    ResultVO startProcess(@RequestBody(required = false) WorkflowVO workflowVO) {
        ResultVO deployResult = WorkFlowUtil.start(workflowVO);
        return deployResult;
    }
}
