package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/14 9:23 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGoodsDao {

    @Autowired
    @Qualifier("goodsDao")
    private IGoodsDao goodsDao;

    @Test
    public void addGoods() {

    }

    @Test
    public void deleteGoods() {

    }

    @Test
    public void updateGoods() {

    }

    @Test
    public void findAllGoods() {
        List<Goods> goods = goodsDao.findAllGoods();
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsByNames() {
        String[] names = {"小米4   2GB内存版 白色 移动4G手机", "荣耀 6 (H60-L01) 3GB内存标准版 白色 移动4G手机"};
        List<Goods> goods = goodsDao.findGoodsByNames(names);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsByIds() {
        String[] ids = {"034db61a861345f9bb681b7f283dd1e1", "04ec26885efc45bd9537711f7db8fabe", "0866079a93de4f99a83660abf3d41ddd"};
        List<Goods> goods = goodsDao.findGoodsByIds(ids);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsByCategory() {
        List<Goods> goods = goodsDao.findGoodsByCategory("1d3c3584d6164047acd4cff929a9eeef", 4);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsOrderBySellTime() {
        List<Goods> goods = goodsDao.findGoodsOrderBySellTime(10);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsOrderBySellNum() {
        List<Goods> goods = goodsDao.findGoodsOrderBySellNum(10);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsOrderByRole() {
        List<Goods> goods = goodsDao.findGoodsOrderByRole(10);
        for (Goods goods1 : goods) {
            System.out.println(goods1);
        }
    }

    @Test
    public void findGoodsById() {
        Goods goods = goodsDao.findGoodsById("034db61a861345f9bb681b7f283dd1e1");
        System.out.println(goods);
    }
}
