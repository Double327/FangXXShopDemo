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

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/15 11:28 下午
 */
@Controller
@RequestMapping(path = "/goods")
public class GoodsController {

    @Autowired
    @Qualifier("goodsService")
    private IGoodsService goodsService = null;

    @Autowired
    @Qualifier("categoryService")
    private ICategoryService categoryService = null;


    @RequestMapping("/view")
    public String goodsView(Model model, String goodsId, HttpSession session) {

        Goods goods = goodsService.getGoodsById(goodsId);

        List<Category> categories = categoryService.getCategoryForIndex();

        model.addAttribute("categories", categories);
        model.addAttribute("goods", goods);
        return "goods_view";
    }
}
