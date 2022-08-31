package com.oa.lxs.entity.Task;

import com.oa.lxs.entity.Attendance.AoaStatusList;
import com.oa.lxs.entity.Attendance.AoaTypeList;
import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.User.AoaUser;
import lombok.Data;

import java.io.Serializable;

@Data
public class AoaTaskList implements Serializable {
    private Long taskId;

    private String comment;

    private String endTime;

    private Integer isCancel;

    private Integer isTop;

    private String modifyTime;

    private String publishTime;

    private String starTime;

    private Integer statusId;

    private String taskDescribe;

    private String ticking;

    private String title;

    private Long typeId;

    private Long taskPushUserId;

    private String reciverlist;

    private AoaUser aoaUser;

    private AoaTypeList aoaTypeList;

    private AoaDept aoaDept;

    private AoaStatusList aoaStatusList;

    private static final long serialVersionUID = 1L;
}
