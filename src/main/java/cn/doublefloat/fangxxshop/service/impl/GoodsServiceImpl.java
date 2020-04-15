package cn.doublefloat.fangxxshop.service.impl;

import cn.doublefloat.fangxxshop.dao.IGoodsDao;
import cn.doublefloat.fangxxshop.entity.Goods;
import cn.doublefloat.fangxxshop.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/15 5:20 下午
 */
@Service("goodsService")
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    @Qualifier("goodsDao")
    private IGoodsDao goodsDao = null;

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void deleteGoods(String goodsId) {
        goodsDao.deleteGoods(goodsId);
    }

    @Override
    public void updateGoods(Goods goods) {
        goodsDao.updateGoods(goods);
    }

    @Override
    public Goods getGoodsById(String id) {
        return goodsDao.findGoodsById(id);
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsDao.findAllGoods();
    }

    @Override
    public List<Goods> getGoodsBySellNum(Integer n) {
        return goodsDao.findGoodsOrderBySellNum(n);
    }

    @Override
    public List<Goods> getGoodsBySellTime(Integer n) {
        return goodsDao.findGoodsOrderBySellTime(n);
    }

    @Override
    public List<Goods> getGoodsByRole(Integer n) {
        return goodsDao.findGoodsOrderByRole(n);
    }
}
