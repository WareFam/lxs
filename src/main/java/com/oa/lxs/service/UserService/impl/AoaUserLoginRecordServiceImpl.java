package com.oa.lxs.service.UserService.impl;

import com.oa.lxs.dao.UserDao.AoaUserLoginRecordDao;
import com.oa.lxs.entity.User.AoaUserLoginRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AoaUserLoginRecordServiceImpl implements AoaUserLoginRecordDao {
    @Autowired
    private AoaUserLoginRecordDao aoaUserLoginRecordDao;
    @Override
    public int insert(AoaUserLoginRecord record) {
        return aoaUserLoginRecordDao.insert(record);
    }

    @Override
    public int count(String time, Long userId) {
        return aoaUserLoginRecordDao.count(time,userId);
    }
}
