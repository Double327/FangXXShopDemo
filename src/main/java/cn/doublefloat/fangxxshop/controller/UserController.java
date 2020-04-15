package cn.doublefloat.fangxxshop.controller;

import cn.doublefloat.fangxxshop.entity.User;
import cn.doublefloat.fangxxshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 李广帅
 * @Date 2020/4/12 1:46 下午
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private IUserService userService;


    /**
     * 用户登录控制器
     *
     * @param username 用户名
     * @param password 密码
     * @param session
     * @param request
     * @return
     */
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session, HttpServletRequest request) {
        System.out.println(username + password);
        User user = userService.findUser(username, password);
        if (user == null || user.getStatus() == 2) {
            return "login";
        } else {
            user.setStatus(1);
            userService.updateStatus(user.getId(), user.getStatus());
            session.setAttribute("user", user);


            return "redirect:/index";
        }

    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(User user, HttpSession session, HttpServletRequest request) {
        System.out.println(user);
        userService.register(user);
        session.setAttribute("user", user);
        return "index";
    }


    @RequestMapping(path = "/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/index";
    }


    /**
     * 跳转至登录界面
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }
}
