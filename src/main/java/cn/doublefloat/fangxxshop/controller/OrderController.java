package cn.doublefloat.fangxxshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单控制器
 * @author 李广帅
 * @Date 2020/4/15 11:12 下午
 */
@Controller()
@RequestMapping(path = "/order")
public class OrderController {


    /**
     * 跳转至用户主界面
     * @return
     */
    @RequestMapping(path = "/uindex")
    public String userIndex() {
        return "/admin/index";
    }
}
