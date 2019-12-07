package com.customs.hwms.dao.cfg;

import com.customs.hwms.entity.cfg.SYS_Employee;

public interface SYS_EmployeeMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(SYS_Employee record);

    int insertSelective(SYS_Employee record);

    SYS_Employee selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(SYS_Employee record);

    int updateByPrimaryKeyWithBLOBs(SYS_Employee record);

    int updateByPrimaryKey(SYS_Employee record);
}