package com.oa.lxs.dao.UserDao;

import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.Position.AoaPosition;
import com.oa.lxs.entity.User.AoaUser;
import com.oa.lxs.entity.User.AoaUserLoginRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoaUserDao {
    //通过用户Id删除
    int deleteByPrimaryKey(Long userId);
    //注册用户信息
    int insert(AoaUser record);
    //记录用户信息
    int insertSelective(AoaUser record);

    /**
     * 根据用户名或者手机号查询用户信息
     *
     */
    AoaUser selectByPrimaryKeyName(String username);

    int updateByPrimaryKeySelective(AoaUser record);

    int updateByPrimaryKey(AoaUser record);

    AoaUser selectAllByName(String username);

    List<AoaUser> selectAll();

    List<AoaUser> selectByDeptIdAndRoleId(@Param("roleId") Long roleId,@Param("deptId") Long deptId,
                                        @Param("userName") String userName, @Param("nowPage") int nowPage,@Param("size") int size);

    List<AoaDept> selectDeptAll();

    AoaUser selectByPrimaryKeyId(int id);

    List<AoaPosition> selectBylevel(int deptid);

    List<AoaUser> selectAoaRoleAll();

    List<AoaUserLoginRecord> selectUserLogAll(@Param("userName") String UserName,@Param("nowPage") int nowPage,
                                              @Param("size") int size);
    Long selectUserId(String username);

    @Select("select * from aoa_user where user_id=#{userId}")
    AoaUser selectByName(Long userId);

}
