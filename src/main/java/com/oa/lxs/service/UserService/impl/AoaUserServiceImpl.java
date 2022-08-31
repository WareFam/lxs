package com.oa.lxs.service.UserService.impl;

import com.oa.lxs.dao.UserDao.AoaUserDao;
import com.oa.lxs.entity.Dept.AoaDept;
import com.oa.lxs.entity.Position.AoaPosition;
import com.oa.lxs.entity.User.AoaUser;
import com.oa.lxs.entity.User.AoaUserLoginRecord;
import com.oa.lxs.service.UserService.AoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AoaUserServiceImpl implements AoaUserService {

    @Autowired
    private AoaUserDao aoaUserDao;

    @Override
    public AoaUser selectByPrimaryKeyName(String username) {
        return aoaUserDao.selectByPrimaryKeyName(username);
    }

    @Override
    public AoaUser selectAllByName(String username) {
        return aoaUserDao.selectAllByName(username);
    }

    @Override
    public List<AoaUser> selectAll() {
        return aoaUserDao.selectAll();
    }

    @Override
    public List<AoaUser> selectByDeptIdAndRoleId(Long roleId, Long deptId, String userName, int nowPage, int size) {
        return aoaUserDao.selectByDeptIdAndRoleId(roleId,deptId,userName,(nowPage-1)*size,size);
    }

    @Override
    public List<AoaDept> selectDeptAll() {
        return aoaUserDao.selectDeptAll();
    }

    @Override
    public AoaUser selectByPrimaryKeyId(int id) {
        return aoaUserDao.selectByPrimaryKeyId(id);
    }

    @Override
    public List<AoaPosition> selectBylevel(int deptid) {
        return aoaUserDao.selectBylevel(deptid);
    }

    @Override
    public List<AoaUser> selectAoaRoleAll() {
        return aoaUserDao.selectAoaRoleAll();
    }

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return aoaUserDao.deleteByPrimaryKey(userId);
    }

    @Override
    public int insertSelective(AoaUser record) {
        return aoaUserDao.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(AoaUser record) {
        return aoaUserDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<AoaUserLoginRecord> selectUserLogAll(String userName, int nowPage, int size) {
        return aoaUserDao.selectUserLogAll(userName,(nowPage-1)*size,size);
    }

    @Override
    public AoaUser selectByName(Long userId) {
        return aoaUserDao.selectByName(userId);
    }
}
