package com.customs.hwms.dao.cfg;

import com.customs.hwms.entity.cfg.SYS_TimerTask;

public interface SYS_TimerTaskMapper {
    int deleteByPrimaryKey(String taskid);

    int insert(SYS_TimerTask record);

    int insertSelective(SYS_TimerTask record);

    SYS_TimerTask selectByPrimaryKey(String taskid);

    int updateByPrimaryKeySelective(SYS_TimerTask record);

    int updateByPrimaryKey(SYS_TimerTask record);
}