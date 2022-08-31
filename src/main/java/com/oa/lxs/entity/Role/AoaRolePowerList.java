package com.oa.lxs.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//OA系统用户权限列表对应的实体类

public class AoaRolePowerList {
    private Long pkId;
    private Integer isShow;
    private Long menuId;
    private Long roleId;
    private static final long serialVersionUID = 1L;
}
