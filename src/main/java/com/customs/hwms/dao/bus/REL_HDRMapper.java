package com.customs.hwms.dao.bus;

import com.customs.hwms.entity.bus.REL_HDR;
import com.customs.hwms.entity.bus.REL_HDRKey;

public interface REL_HDRMapper {
    int deleteByPrimaryKey(REL_HDRKey key);

    int insert(REL_HDR record);

    int insertSelective(REL_HDR record);

    REL_HDR selectByPrimaryKey(REL_HDRKey key);

    int updateByPrimaryKeySelective(REL_HDR record);

    int updateByPrimaryKey(REL_HDR record);
}