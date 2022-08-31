package com.oa.lxs.entity.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.plaf.nimbus.State;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

//OA系统的角色列表对应的实体类
public class AoaRole implements Serializable {
    private Long roleId;
    private String roleName;
    private Integer roleValue;
    private static final long serialVersionUID = 1L;
}
