package com.oa.lxs.entity.User;

import com.oa.lxs.entity.Attendance.AoaAttendsList;
import com.oa.lxs.entity.Attendance.AoaStatusList;
import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.Position.AoaPosition;
import com.oa.lxs.entity.Role.AoaRole;
import com.oa.lxs.entity.process.AoaProcessList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

// OA系统的用户列表的实体类

public class AoaUser implements Serializable {
    private Long userId;
    private String address;
    private String bank;
    private String birth;
    private String eamil;
    private Long fatherId;
    private String hireTime;
    private String userIdcard;
    private String imgPath;
    private Integer isLock;
    private String lastLoginIp;
    private Date lastLoginTime;
    private Date modifyTime;
    private Long modifyUserId;
    private String password;
    private String realName;
    private Double salary;
    private String userSchool;
    private String sex;
    private String themeSkin;
    private String userEdu;
    private String userName;
    private String userSign;
    private String userTel;
    private Long deptId;
    private Long positionId;
    private Long roleId;
    private Integer holiday;
    private String pinyin;
    private AoaDept aoaDept;
    private AoaRole aoaRole;
    private AoaPosition aoaPosition;
    private List<AoaAttendsList> aSet;
    private AoaStatusList aoaStatusList;
    private AoaProcessList aoaProcessList;
    private Integer quantity;
    private static final long serialVersionUID =1L;
}
