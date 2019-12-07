package com.customs.hwms.dao.bus;

import com.customs.hwms.entity.bus.ASN_HDR;
import com.customs.hwms.entity.bus.ASN_HDRKey;

public interface ASN_HDRMapper {
    int deleteByPrimaryKey(ASN_HDRKey key);

    int insert(ASN_HDR record);

    int insertSelective(ASN_HDR record);

    ASN_HDR selectByPrimaryKey(ASN_HDRKey key);

    int updateByPrimaryKeySelective(ASN_HDR record);

    int updateByPrimaryKey(ASN_HDR record);
}