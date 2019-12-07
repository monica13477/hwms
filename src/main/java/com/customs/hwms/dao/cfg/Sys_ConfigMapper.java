package com.customs.hwms.dao.cfg;

import com.customs.hwms.entity.cfg.Sys_Config;

public interface Sys_ConfigMapper {
    int deleteByPrimaryKey(String cfgid);

    int insert(Sys_Config record);

    int insertSelective(Sys_Config record);

    Sys_Config selectByPrimaryKey(String cfgid);

    int updateByPrimaryKeySelective(Sys_Config record);

    int updateByPrimaryKey(Sys_Config record);
}