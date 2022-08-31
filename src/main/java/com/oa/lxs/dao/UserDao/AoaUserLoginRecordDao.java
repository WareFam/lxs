package com.oa.lxs.dao.UserDao;

import com.oa.lxs.entity.User.AoaUserLoginRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AoaUserLoginRecordDao {
    //向数据库中插入用户记录
    int insert(AoaUserLoginRecord record);
    //计数用户量
    int count(@Param("time") String time,@Param("userId") Long userId);
}
