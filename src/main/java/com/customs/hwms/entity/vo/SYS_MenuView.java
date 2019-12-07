package com.customs.hwms.entity.vo;

import com.alibaba.fastjson.JSONObject;
import com.customs.hwms.entity.cfg.SYS_Menu;

public class SYS_MenuView extends SYS_Menu {
    private String iconId;
    private String toFileName;
    public String getIconId(){
        return JSONObject.parseObject( getParamlist())==null ? null : JSONObject.parseObject(getParamlist()).getString("iconId");
    }

    public void setIconId(String iconId) {
        this.iconId = JSONObject.parseObject(getParamlist())==null ? null : JSONObject.parseObject(getParamlist()).getString("iconId");
    }
    public String getToFileName(){
        return JSONObject.parseObject(getParamlist())==null ? null : JSONObject.parseObject(getParamlist()).getString("toFileName");
    }
    public void setToFileName(String fileName) {
        this.toFileName = JSONObject.parseObject(getParamlist())==null ? null : JSONObject.parseObject(getParamlist()).getString("toFileName");
    }
}
