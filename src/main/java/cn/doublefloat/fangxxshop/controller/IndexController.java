package cn.doublefloat.fangxxshop.controller;

import cn.doublefloat.fangxxshop.entity.Category;
import cn.doublefloat.fangxxshop.entity.Goods;
import cn.doublefloat.fangxxshop.service.ICategoryService;
import cn.doublefloat.fangxxshop.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/11 9:38 下午
 */
@Controller
public class IndexController {


    @Autowired
    @Qualifier("categoryService")
    private ICategoryService categoryService = null;


    @Autowired
    @Qualifier("goodsService")
    private IGoodsService goodsService = null;


    /**
     * 首页
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/index")
    public String execute(Model model, HttpSession session) {
        Integer MAX = 8;
        List<Category> categories = categoryService.getCategoryForIndex();
        List<Goods> hotGoodses = goodsService.getGoodsByRole(MAX);
        List<Goods> goodsesLasted = goodsService.getGoodsBySellTime(MAX);
        model.addAttribute("hotGoodses", hotGoodses);
        model.addAttribute("goodsesLasted", goodsesLasted);
        model.addAttribute("categories", categories);

        session.setAttribute("base", session.getServletContext().getContextPath());
        session.setAttribute("site", "新新网上商城");
        return "index";
    }
}
