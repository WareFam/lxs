package com.oa.lxs.entity.Dept;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data

//oa系统的部门列表对应的实体类

public class AoaDept implements Serializable {
    private String deptId;

    private String deptAddr;

    private String deptFax;

    private String deptName;

    private String deptTel;

    private String email;

    private Long deptmanager;

    private Date endTime;

    private Date startTime;

    private static final long serialVersionUID = 1L;
}
