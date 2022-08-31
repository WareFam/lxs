package com.oa.lxs.entity.Mail;

import com.oa.lxs.entity.Attendance.AoaStatusList;
import com.oa.lxs.entity.Attendance.AoaTypeList;
import com.oa.lxs.entity.User.AoaUser;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.io.Serializable;

//邮件实体类
@Data
public class AoaInMailList implements Serializable {
    private Long mailId;

    private String mailContent;

    private String mailCreateTime;

    private Long mailFileId;

    private String mailTitle;

    private Long mailType;

    private Long mailInPushUserId;

    private String inReceiver;

    private Long mailStatusId;

    private Long mailNumberId;

    private Integer mailDel;

    private Integer mailPush;

    private Integer mailStar;

    private AoaTypeList aoaTypeList;

    private AoaStatusList aoaStatusList;

    private AoaMailReciver aoaMailReciver;

    private AoaUser aoaUser;

    private static final long serialVersionUID = 1L;
}
