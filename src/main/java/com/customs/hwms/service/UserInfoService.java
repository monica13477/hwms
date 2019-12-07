package com.customs.hwms.service;

import com.customs.hwms.dao.cfg.SYS_EmployeeMapper;
import com.customs.hwms.dao.cfg.SYS_MenuMapper;
import com.customs.hwms.dao.cfg.SYS_UserMapper;
import com.customs.hwms.entity.cfg.SYS_Employee;
import com.customs.hwms.entity.cfg.SYS_Menu;
import com.customs.hwms.entity.cfg.SYS_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserInfoService {
    @Autowired
    SYS_UserMapper sysUserMapper;
    @Autowired
    SYS_MenuMapper sysMenuMapper;
    public SYS_User Sel(String employeeId){
        return sysUserMapper.selectByPrimaryKey(employeeId);
    }

    public List<SYS_Menu> GetMenus(String type)
    {
       return  sysMenuMapper.selectAuthorizedMenus(type);
    }
    public boolean login(String sno, String password){
        // return userMapper.login(sno, password);
        SYS_User u=sysUserMapper.selectByPrimaryKey(sno);
        if(u!=null)
        {
            return u.getUserpwd()==password?true:false;
        }
        return false;
    }
}
