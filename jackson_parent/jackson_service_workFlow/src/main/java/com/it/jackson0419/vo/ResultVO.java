package com.it.jackson0419.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO implements Serializable {
    private static final long serialVersionUID = -970377867949741005L;
    private Integer status = 200;
    private String msg = "操作成功！";
    private Object data;
}
