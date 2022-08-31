package com.oa.lxs.service.Mail;

import com.oa.lxs.entity.Mail.AoaInMailList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaInMailService {
    List<AoaInMailList> selectMail(@Param("userId") Long userId,
                                   @Param("userName") String userName,
                                   @Param("nowPage") int nowPage,
                                   @Param("size") int size);

    AoaInMailList selectByPrimaryKey(Long mailId);

    List<AoaInMailList> selectInMail(@Param("userId") Long userId,
                                     @Param("userName") String userName,
                                     @Param("nowPage") int nowPage,
                                     @Param("size") int size);

    List<AoaInMailList> selectDelMail(@Param("userId") Long userId,
                                      @Param("userName") String userName,
                                      @Param("nowPage") int nowPage,
                                      @Param("size") int size);

    List<AoaInMailList> selectDraftMail(@Param("userId") Long userId,
                                      @Param("userName") String userName,
                                      @Param("nowPage") int nowPage,
                                      @Param("size") int size);

    int updateByPrimaryKey(Long mailId,Integer mailDel);

    int deleteByPrimaryKey(Long mailId);

    int updateStar(Long mailId);

    int insert(AoaInMailList record);
}
