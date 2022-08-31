package com.oa.lxs.entity.Attendance;

import com.oa.lxs.entity.User.AoaUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

//OA系统员工上下班打卡列表对应的实体类

public class AoaAttendsList implements Serializable {
    private Long attendsId;

    private String attendsIp;

    private String attendsRemark;

    private String attendsTime;

    private Long statusId;

    private Long typeId;

    private Long attendsUserId;

    private String attendHmtime;

    private String weekOfday;

    private Double holidayDays;

    private String  holidayStart;

    private AoaStatusList aoaStatusList;

    private AoaTypeList aoaTypeList;

    private AoaUser aoaUser;

    private static final long serialVersionUID = 1L;
}
