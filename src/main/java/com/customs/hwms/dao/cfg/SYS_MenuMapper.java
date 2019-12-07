package com.customs.hwms.dao.cfg;

import com.customs.hwms.entity.cfg.SYS_Menu;

import java.util.List;

public interface SYS_MenuMapper {
    int deleteByPrimaryKey(String mid);

    int insert(SYS_Menu record);

    int insertSelective(SYS_Menu record);

    SYS_Menu selectByPrimaryKey(String mid);

    int updateByPrimaryKeySelective(SYS_Menu record);

    int updateByPrimaryKey(SYS_Menu record);

    List<SYS_Menu>selectAuthorizedMenus(String type);
}