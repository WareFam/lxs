package com.oa.lxs.entity.Attendance;

import lombok.Data;

import java.io.Serializable;

@Data
//事物分类列表的实体类
public class AoaTypeList implements Serializable {
    private Long typeId;

    private String typeColor;

    private String typeModel;

    private String typeName;

    private Integer sortValue;

    private static final long serialVersionUID = 1L;
}
