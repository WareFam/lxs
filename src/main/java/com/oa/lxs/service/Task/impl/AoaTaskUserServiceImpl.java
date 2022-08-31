package com.oa.lxs.service.Task.impl;

import com.oa.lxs.dao.TaskDao.AoaTaskUserDao;
import com.oa.lxs.dao.UserDao.AoaUserDao;
import com.oa.lxs.entity.Task.AoaTaskUser;
import com.oa.lxs.entity.User.AoaUser;
import com.oa.lxs.service.Task.AoaTaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AoaTaskUserServiceImpl implements AoaTaskUserService {
    @Autowired
    AoaTaskUserDao aoaTaskUserDao;

    @Autowired
    AoaUserDao aoaUserDao;

    @Override
    public int deleteByPrimaryKey(Long taskId, Long userId) {
        return aoaTaskUserDao.deleteByPrimaryKey(taskId,userId);
    }

    @Override
    public int insert(long statusId, Long taskId, List<AoaUser> list) {
        return aoaTaskUserDao.insert(statusId,taskId,list);
    }

    @Override
    public List<AoaUser> review(String username) {
        String[] split = username.split(";");

        List<AoaUser> list = new ArrayList<>();

        for (int i = 0; i <split.length ; i++) {
            AoaUser aoaUser = new AoaUser();
            aoaUser.setUserId(aoaUserDao.selectUserId(split[i]));
            list.add(aoaUser);
        }
        return list;
    }

    @Override
    public List<AoaTaskUser> selectByPrimaryKey(Long userId, String userName, int nowPage, int size, String type, String status, String time) {
        return aoaTaskUserDao.selectByPrimaryKey(userId,userName,(nowPage-1)*size,size,type,status,time);

    }

    @Override
    public List<AoaTaskUser> selectStatusId(Long taskId) {
        return aoaTaskUserDao.selectStatusId(taskId);
    }

    @Override
    public int deleteTaksUser(Long taskId) {
        return aoaTaskUserDao.deleteTaskUser(taskId);
    }

    @Override
    public int updateByPrimaryKey(Long statusId, Long taskId, Long userId) {
        return aoaTaskUserDao.updateByPrimaryKey(statusId,taskId,userId);
    }

    @Override
    public AoaTaskUser selectStatusOnly(Long taskId, Long userId) {
        return aoaTaskUserDao.selectStatusOnly(taskId,userId);
    }
}
