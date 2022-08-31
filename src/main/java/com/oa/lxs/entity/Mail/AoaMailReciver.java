package com.oa.lxs.entity.Mail;

import lombok.Data;

import java.io.Serializable;

//邮件接收者实体类
@Data
public class AoaMailReciver implements Serializable {
    private Long pkId;

    private Integer isRead;

    private Long mailId;

    private Long mailReciverId;

    private Integer isStar;

    private Integer isDel;

    private static final long serialVersionUID = 1L;
}
