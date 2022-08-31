package com.oa.lxs.dao.TaskDao;

import com.oa.lxs.entity.Task.AoaTaskUser;
import com.oa.lxs.entity.User.AoaUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoaTaskUserDao {
    int deleteByPrimaryKey(Long taskId,Long userId);

    int insert(@Param("statusId") long statusId, @Param("taskId")Long taskId,
               @Param("list")List<AoaUser>list);

    int insertSelective(AoaTaskUser record);

    List<AoaTaskUser> selectByPrimaryKey(@Param("userId") Long userId,
                                         @Param("userName") String userName,
                                         @Param("nowPage") int nowPage,
                                         @Param("size") int size,
                                         @Param("type") String type,
                                         @Param("status") String status,
                                         @Param("time") String time);

    int updateByPrimaryKeySelective(AoaTaskUser record);

    int updateByPrimaryKey(Long statusId,Long taskId,Long userId);

    @Select("select * from aoa_task_user where task_id = #{taskId}")
    List<AoaTaskUser> selectStatusId(@Param("taskId") Long taskId);

    @Delete("delete from aoa_task_user where task_id = #{taskId}")
    int deleteTaskUser(Long taskId);

    AoaTaskUser selectStatusOnly(@Param("taskId")Long taskId,@Param("userId")Long userId);

    List<AoaTaskUser> count(Long userId);
}
