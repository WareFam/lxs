package com.oa.lxs.service.Mail.Impl;

import com.oa.lxs.dao.MailDao.AoaInMailListDao;
import com.oa.lxs.entity.Mail.AoaInMailList;
import com.oa.lxs.service.Mail.AoaInMailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AoaInMailServiceImpl implements AoaInMailService {
    @Autowired
    private AoaInMailListDao aoaInMailListDao;

    @Override
    public List<AoaInMailList> selectMail(Long userId, String userName, int nowPage, int size) {
        return aoaInMailListDao.selectMail(userId,userName,(nowPage-1)*size,size);
    }

    @Override
    public AoaInMailList selectByPrimaryKey(Long mailId) {
        return aoaInMailListDao.selectByPrimaryKey(mailId);
    }

    @Override
    public List<AoaInMailList> selectInMail(Long userId, String userName, int nowPage, int size) {
        return aoaInMailListDao.selectInMail(userId,userName,(nowPage-1)*size,size);
    }

    @Override
    public List<AoaInMailList> selectDelMail(Long userId, String userName, int nowPage, int size) {
        return aoaInMailListDao.selectDelMail(userId,userName,(nowPage-1)*size,size);
    }

    @Override
    public List<AoaInMailList> selectDraftMail(Long userId, String userName, int nowPage, int size) {
        return aoaInMailListDao.selectDraftMail(userId,userName,(nowPage-1)*size,size);
    }

    @Override
    public int updateByPrimaryKey(Long mailId, Integer mailDel) {
        return aoaInMailListDao.updateByPrimaryKey(mailId,mailDel);
    }

    @Override
    public int deleteByPrimaryKey(Long mailId) {
        return aoaInMailListDao.deleteByPrimaryKey(mailId);
    }

    @Override
    public int updateStar(Long mailId) {
        return aoaInMailListDao.updateStar(mailId);
    }

    @Override
    public int insert(AoaInMailList record) {
        return aoaInMailListDao.insert(record);
    }
}
