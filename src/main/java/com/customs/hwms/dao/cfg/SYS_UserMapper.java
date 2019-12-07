package com.customs.hwms.dao.cfg;

import com.customs.hwms.entity.cfg.SYS_User;

public interface SYS_UserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(SYS_User record);

    int insertSelective(SYS_User record);

    SYS_User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(SYS_User record);

    int updateByPrimaryKeyWithBLOBs(SYS_User record);

    int updateByPrimaryKey(SYS_User record);
}