package com.oa.lxs.dao.MailDao;

import com.oa.lxs.entity.Mail.AoaMailReciver;
import com.oa.lxs.entity.User.AoaUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoaMailReciverDao {
    int deleteByPrimaryKey(Long userId,Long mailId);

    int insert(@Param("isRead")Long isRead,
               @Param("mailId")Long mailId,
               @Param("list") List<AoaUser> list,
               @Param("isStar")Long isStar,
               @Param("isDel")Long isDel);

    int insertSelective(AoaMailReciver record);

    AoaMailReciver selectByPrimaryKey(Long pkId);

    int updateByPrimaryKeySelective(AoaMailReciver record);

    int updateByPrimaryKey(Integer idDel,Long mailId,Long userId);

    int updateStar(Long pkId);

    int updateIsRead(Long pkId);

    AoaMailReciver selectByMailId(@Param("mailId") Long mailId,@Param("userId") Long userId);
}
