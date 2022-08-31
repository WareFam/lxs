package com.oa.lxs.entity.Task;

import com.oa.lxs.entity.Attendance.AoaStatusList;
import com.oa.lxs.entity.Attendance.AoaTypeList;
import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.User.AoaUser;
import lombok.Data;

import java.io.Serializable;

@Data
public class AoaTaskUser implements Serializable {
    private Long pkId;

    private Long statusId;

    private Long taskId;

    private Long taskReciveUserId;

    private AoaTaskList aoaTaskList;

    private AoaUser aoaUser;

    private AoaTypeList aoaTypeList;

    private AoaDept aoaDept;

    private AoaStatusList aoaStatusList;

    private static final long serialVersionUID = 1L;
}
