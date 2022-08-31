package com.oa.lxs.service.UserService.impl;

import com.oa.lxs.dao.UserDao.AoaNotepaperDao;
import com.oa.lxs.entity.User.AoaNotepaper;
import com.oa.lxs.service.UserService.AoaNotepaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaNotepaperServiceImpl implements AoaNotepaperService {
    @Autowired
    private AoaNotepaperDao aoaNotepaperDao;

    @Override
    public List<AoaNotepaper> aoaNotepapers(Long userId, int nowPage, int size) {
        return aoaNotepaperDao.aoaNotepapers(userId,(nowPage-1)*size,size);
    }

    @Override
    public int deleteByPrimaryKey(Long notepaperId) {
        return aoaNotepaperDao.deleteByPrimaryKey(notepaperId);
    }

    @Override
    public int updateByPrimaryKeySelective(AoaNotepaper record) {
        return aoaNotepaperDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(AoaNotepaper record) {
        return aoaNotepaperDao.insert(record);
    }
}
