package com.oa.lxs.entity.Position;

import com.oa.lxs.entity.Dept.AoaDept;
import lombok.Data;

import java.io.Serializable;

@Data

//oa系统的员工职位列表对应的实体类

public class AoaPosition implements Serializable {
    private Long positionId;

    private Integer level;

    private String name;

    private String describtion;

    private Long deptid;

    private AoaDept positiondept;

    private static final long serialVersionUID = 1L;
}

