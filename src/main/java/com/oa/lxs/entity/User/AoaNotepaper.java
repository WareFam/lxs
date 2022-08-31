package com.oa.lxs.entity.User;

import lombok.Data;

import java.io.Serializable;

@Data

//用户的备注数据列表的实体类

public class AoaNotepaper implements Serializable {
    private Long notepaperId;
    private String concent;
    private String title;
    private Long notepaperUserId;
    private static final long serialVersionUID = 1L;
}
