package com.oa.lxs.service.UserService;

import com.oa.lxs.entity.User.AoaNotepaper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AoaNotepaperService {
    //便签展示
    List<AoaNotepaper> aoaNotepapers(@Param("userId") Long userId, @Param("nowPage") int nowPage, @Param("size") int size);

    //删除便签
    int deleteByPrimaryKey(Long notepaperId);

    //修改便签
    int updateByPrimaryKeySelective(AoaNotepaper record);

    //插入便签
    int insert(AoaNotepaper record);
}
