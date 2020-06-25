package com.it.jackson0419.utils;

import com.it.jackson0419.vo.ResultVO;
import com.it.jackson0419.vo.WorkflowVO;

public class ResultUtil {
    public static ResultVO ResultUtil(WorkflowVO workflowVO) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(workflowVO.getData());
        resultVO.setStatus(workflowVO.getStatus());
        resultVO.setMsg(workflowVO.getMsg());
        return resultVO;
    }
}
