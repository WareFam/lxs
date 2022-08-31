package com.oa.lxs.entity.Attendance;

import lombok.Data;

import java.io.Serializable;

@Data
//员工事物状况和结果的实体类
public class AoaStatusList implements Serializable {
    private Long statusId;

    private String statusColor;

    private String statusModel;

    private String statusName;

    private Integer sortValue;

    private String sortPrecent;

    private static final long serialVersionUID = 1L;
}
