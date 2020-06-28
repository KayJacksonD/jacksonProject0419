package com.it.jackson0419.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BaseVO {
    private Date creationDate;
    private String createdBy;
    private Date lastUpdateDate;
    private String lastUpdatedBy;
}
