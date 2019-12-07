package com.customs.hwms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.customs.hwms.Redis.RedisUtil;
import com.customs.hwms.entity.cfg.SYS_Menu;
import com.customs.hwms.entity.cfg.SYS_User;
import com.customs.hwms.entity.vo.SYS_MenuView;
import com.customs.hwms.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    public UserInfoService userInfoService;

    @Autowired
    private RedisUtil redisUtil;


    @RequestMapping(value = "/login", method = {POST, GET})
    public String login(Model model) {
        model.addAttribute("user", new SYS_User());
        return "/login";
    }

    @RequestMapping(value = "/loginIn", method = {POST, GET})
    public String loginIn(@ModelAttribute SYS_User user, RedirectAttributes attr) {

        String userId = user.getUserid();
        String password = user.getUserpwd();
        Boolean pwd = userInfoService.login(userId, password);

        attr.addFlashAttribute("userId", "lmz");
        // session.setAttribute("tname", tname);
        if (pwd) {
            return "redirect:goIndex";
        } else {
            return "redirect:goIndex";
        }
    }

    @RequestMapping(value = "/goIndex", method = {POST, GET})
    public String goIndex(Model model, ModelMap map, HttpServletRequest request) {
//        map.get("userId").toString();
        String userId = "lmz";
        model.addAttribute("userId", userId);
        List<SYS_Menu> menuList1 = userInfoService.GetMenus("Customs");
        redisUtil.set("allMenu", JSON.toJSONString(JSONArray.parseArray(JSON.toJSONString(menuList1), SYS_MenuView.class)));
        HttpSession session = request.getSession();
        session.setAttribute("userId", userId);
        List<SYS_Menu> menuList = menuList1.stream().filter(t -> t.getPid().equals("/")).collect(Collectors.toList());
        List<SYS_MenuView> menuListVO = JSONArray.parseArray(JSON.toJSONString(menuList), SYS_MenuView.class);
        model.addAttribute("menuList", menuListVO);
        return "index";
        // session.setAttribute("tname", tname);

    }

    @RequestMapping(value = "/goIndexIframe", method = {POST, GET})
    public String goIndexIframe(Model model, ModelMap map, HttpServletRequest request) {
        //  String userId=  map.get("userId").toString();
//        String userId=  request.getParameter("userId");
//
//        List<SYS_Menu> menuList1=userInfoService.GetMenus("Customs");
////        for(SYS_Menu menu : menuList1) {
////
////        }
//        redisUtil.set("allMenu", JSON.toJSONString(menuList1));
//        HttpSession session= request.getSession();
//        session.setAttribute("userId",userId);
//        List<SYS_Menu> menuList= menuList1.stream().filter(t ->t.getPid().equals("/")).collect(Collectors.toList());
//
//        model.addAttribute("menuList", menuList);
        return "index_frame1";
        // session.setAttribute("tname", tname);

    }

    //
    @RequestMapping(value = "/goMenuIframe", method = {POST, GET})
    public String goMenuIframe(Model model, ModelMap map, HttpServletRequest request) {
        HttpSession session = request.getSession();

        String userId = session.getAttribute("userId").toString();
        String mid = request.getParameter("mid");
        //model.addAttribute("fileName", fileName);
        String redisStr = (String) redisUtil.get("allMenu");
        List<SYS_MenuView> menuList = JSON.parseArray(redisStr, SYS_MenuView.class);
        List<SYS_MenuView> menuList1 = menuList.stream().filter(t -> t.getMid().equals(mid)).collect(Collectors.toList());
        session.setAttribute("menuViewNow", menuList1.get(0));
        session.setAttribute("menuViewNow", "service_manager.html");

//        return menuList1.get(0).getToFileName();
        return "service_manager.html";


    }

    @RequestMapping(value = "/queryMenu", method = {POST, GET})
    @ResponseBody
    public Map<String, String> queryMenu(@RequestBody JSONObject json, HttpServletResponse response) {
        Map<String, String> map = new HashMap<String, String>();
        String redisStr = (String) redisUtil.get("allMenu");
        String pid = json.getString("pid");
        String mType = json.getString("mType");
        List<SYS_MenuView> menuList = JSON.parseArray(redisStr, SYS_MenuView.class);
        List<SYS_MenuView> menuList1 = menuList.stream().filter(t -> t.getPid().equals(pid)).collect(Collectors.toList());
        map.put("menu", JSON.toJSONString(menuList1));

        return map;


    }


//    public static <T> String toJSONString(List<T> list) {
//        JSONArray jsonArray = JSONArray.fromObject(list);
//
//        return jsonArray.toString();
//    }


//    public static void main(String[] args) {
//        String jstr = "[{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"Import Customs\",\"memo\":\"\",\"mid\":\"MM1\",\"mname\":\"进口关务管理\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"/\",\"shortcut\":\"Customs\",\"subsystem\":2},{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"Account\",\"memo\":\"\",\"mid\":\"MM1001\",\"mname\":\"备案信息\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"MM1\",\"shortcut\":\"Customs\",\"subsystem\":2},{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"Account Inventory\",\"memo\":\"\",\"mid\":\"MM1002\",\"mname\":\"账册库存\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"MM1\",\"shortcut\":\"Customs\",\"subsystem\":2},{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"CheckIn\",\"memo\":\"\",\"mid\":\"MM1003\",\"mname\":\"入区核注\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"MM1\",\"shortcut\":\"Customs\",\"subsystem\":2},{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"CheckOut\",\"memo\":\"\",\"mid\":\"MM1004\",\"mname\":\"出区核注\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"MM1\",\"shortcut\":\"Customs\",\"subsystem\":2},{\"filename\":\"\",\"filetype\":\"0\",\"islastlevel\":0,\"issystem\":1,\"layer\":0,\"mcode\":\"Export Customs\",\"memo\":\"\",\"mid\":\"MM2\",\"mname\":\"出口关务管理\",\"modifydate\":1538125528313,\"morder\":0,\"openname\":\"\",\"paramlist\":\"\",\"pid\":\"/\",\"shortcut\":\"Customs\",\"subsystem\":2}]";
//        List<SYS_Menu> menuList = JSON.parseArray(jstr, SYS_Menu.class);
//        for (SYS_Menu tmp : menuList) {
//            System.out.println(tmp.getPid());
//
//        }
//
//    }
}
