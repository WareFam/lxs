package com.oa.lxs.entity.User;

import lombok.Data;

import java.io.Serializable;

@Data

//记录oa系统中所有登录用户的关键信息

public class AoaUserLoginRecord implements Serializable {
    private String browser;
    private String ipAddr;
    private String loginTime;
    private String sessionId;
    private Long userId;
    private AoaUser aoaUser;
    private static final long serialVersionUID = 1L;
}
