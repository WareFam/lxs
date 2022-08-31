package com.oa.lxs.service.Task;

import com.oa.lxs.entity.Task.AoaTaskUser;
import com.oa.lxs.entity.User.AoaUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaTaskUserService {
    int deleteByPrimaryKey(Long taskId,Long userId);


    int insert(@Param("statusId") long statusId, @Param("taskId")Long taskId, @Param("list")List<AoaUser> list);

    List<AoaUser> review(String username);

    List<AoaTaskUser> selectByPrimaryKey(@Param("userId") Long userId,
                                         @Param("userName") String userName,
                                         @Param("nowPage") int nowPage,
                                         @Param("size") int size,
                                         @Param("type") String type,
                                         @Param("status") String status,
                                         @Param("time") String time);

    List<AoaTaskUser> selectStatusId(@Param("taskId") Long taskId);

    int deleteTaksUser(Long taskId);

    int updateByPrimaryKey(Long statusId,Long taskId,Long userId);

    AoaTaskUser selectStatusOnly(@Param("taskId")Long taskId,@Param("userId")Long userId);
}
