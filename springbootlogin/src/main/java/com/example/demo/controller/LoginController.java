package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    //登陆
    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @RequestMapping("/addLogin")
    public String addLogin(HttpServletRequest request, Model model, Map<String,Object> map){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userMapper.Identify(username,password);

        if(user!=null)
        {
            //传给下个页面个username，可添加
           // model.addAttribute("user",username);
            return "index";
        }
        else
        {
            map.put("msg","登录失败");
            return "login";
        }


    }

}
