package com.oa.lxs.service.Mail;

import com.oa.lxs.entity.User.AoaUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaMailReciverService {
    int updateByPrimaryKey(Integer isDel,Long mailId,Long userId);

    int deleteByPrimaryKey(Long userId,Long mailId);

    List<AoaUser> review(String username);

    int insert(@Param("isRead")Long isRead,
               @Param("mailId")Long mailId,
               @Param("list")List<AoaUser> list,
               @Param("isStar")Long isStar,
               @Param("isDel")Long isDel);
}
