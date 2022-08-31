package com.oa.lxs.service.UserService;

import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.Position.AoaPosition;
import com.oa.lxs.entity.User.AoaUser;
import com.oa.lxs.entity.User.AoaUserLoginRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaUserService {

    AoaUser selectByPrimaryKeyName(String username);

    AoaUser selectAllByName(String username);

    List<AoaUser> selectAll();

    List<AoaUser> selectByDeptIdAndRoleId(@Param("roleId") Long roleId, @Param("deptId") Long deptId,
                                          @Param("userName") String userName, @Param("nowPage") int nowPage, @Param("size") int size);

    List<AoaDept> selectDeptAll();

    AoaUser selectByPrimaryKeyId(int id);

    List<AoaPosition> selectBylevel(int deptid);

    List<AoaUser> selectAoaRoleAll();

    int deleteByPrimaryKey(Long userId);

    int insertSelective(AoaUser record);

    int updateByPrimaryKeySelective(AoaUser record);

    List<AoaUserLoginRecord> selectUserLogAll(String userName,int nowPage,int size);

    AoaUser selectByName(Long userId);
}

