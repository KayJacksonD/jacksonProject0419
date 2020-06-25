package com.it.jackson0419.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class WorkflowVO extends ResultVO implements Serializable {

    private static final long serialVersionUID = -3395527886934515702L;
    private String processName;//流程名称
    private String processFileName;        //流程定义部署文件
    private String processFilePNG;//流程名称
    private String processDefinitionKey;//流程key



}
