package com.oa.lxs.dao.MailDao;

import com.oa.lxs.entity.Mail.AoaInMailList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AoaInMailListDao {
    int deleteByPrimaryKey(Long mailId);

    int insert(AoaInMailList record);

    AoaInMailList selectByPrimaryKey(Long mailId);

    int updateStar(Long mailId);

    int updateByPrimaryKey(@Param("mailId")Long mailId,@Param("mailDel") Integer mailDel);

    List<AoaInMailList> selectMail(@Param("userId") Long userId,
                                   @Param("userName") String userName,
                                   @Param("nowPage") int nowPage,
                                   @Param("size") int size);

    List<AoaInMailList> selectInMail(@Param("userId") Long userId,
                                     @Param("userName") String userName,
                                     @Param("nowPage") int nowPage,
                                     @Param("size") int size);

    //垃圾箱
    List<AoaInMailList> selectDelMail(@Param("userId") Long userId,
                                      @Param("userName") String userName,
                                      @Param("nowPage") int nowPage,
                                      @Param("size") int size);

    //草稿箱
    List<AoaInMailList> selectDraftMail(@Param("userId") Long userId,
                                        @Param("userName") String userName,
                                        @Param("nowPage") int nowPage,
                                        @Param("size") int size);
}
