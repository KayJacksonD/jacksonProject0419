package com.it.jackson0419.utils;

import com.it.jackson0419.vo.ResultVO;

public class ResultUtil {
    public static ResultVO returnResult(String state, String msg, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setState(state);
        resultVO.setMsg(msg);
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO returnResult(String state, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setState(state);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO returnResult(String msg, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static ResultVO returnResult(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(data);
        return resultVO;
    }
}
