package com.customs.hwms.dao.bus;

import com.customs.hwms.entity.bus.REL_DTL;
import com.customs.hwms.entity.bus.REL_DTLKey;

public interface REL_DTLMapper {
    int deleteByPrimaryKey(REL_DTLKey key);

    int insert(REL_DTL record);

    int insertSelective(REL_DTL record);

    REL_DTL selectByPrimaryKey(REL_DTLKey key);

    int updateByPrimaryKeySelective(REL_DTL record);

    int updateByPrimaryKey(REL_DTL record);
}