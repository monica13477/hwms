package com.customs.hwms.dao.bus;

import com.customs.hwms.entity.bus.SKU;
import com.customs.hwms.entity.bus.SKUKey;

public interface SKUMapper {
    int deleteByPrimaryKey(SKUKey key);

    int insert(SKU record);

    int insertSelective(SKU record);

    SKU selectByPrimaryKey(SKUKey key);

    int updateByPrimaryKeySelective(SKU record);

    int updateByPrimaryKeyWithBLOBs(SKU record);

    int updateByPrimaryKey(SKU record);
}