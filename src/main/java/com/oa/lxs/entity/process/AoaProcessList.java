package com.oa.lxs.entity.process;

import com.oa.lxs.entity.Attendance.AoaStatusList;
import com.oa.lxs.entity.Attendance.AoaTypeList;
import com.oa.lxs.entity.User.AoaUser;
import lombok.Data;

import java.io.Serializable;

@Data

//员工用户申请事物的实体类

public class AoaProcessList implements Serializable {
    private Long processId;

    private String applyTime;

    private Long deeplyId;

    private String endTime;

    private String processDes;

    private String processName;

    private Integer procseeDays;

    private Integer isChecked;

    private String startTime;

    private Long statusId;

    private String typeName;

    private Long proFileId;

    private Long processUserId;

    private String shenuser;

    private AoaUser aoaUser;

    private AoaTypeList aoaTypeList;

    private AoaStatusList aoaStatusList;

    private static final long serialVersionUID = 1L;
}
