package com.customs.hwms.dao.bus;

import com.customs.hwms.entity.bus.ASN_DTL;
import com.customs.hwms.entity.bus.ASN_DTLKey;

public interface ASN_DTLMapper {
    int deleteByPrimaryKey(ASN_DTLKey key);

    int insert(ASN_DTL record);

    int insertSelective(ASN_DTL record);

    ASN_DTL selectByPrimaryKey(ASN_DTLKey key);

    int updateByPrimaryKeySelective(ASN_DTL record);

    int updateByPrimaryKey(ASN_DTL record);
}