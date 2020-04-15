package cn.doublefloat.fangxxshop.service;

import cn.doublefloat.fangxxshop.entity.Goods;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/15 5:13 下午
 */
public interface IGoodsService {

    /**
     * 添加商品信息
     * @param goods 商品信息
     */
    public void addGoods(Goods goods);


    /**
     * 删除商品信息
     * @param goodsId 商品编号
     */
    public void deleteGoods(String goodsId);


    /**
     * 修改商品信息
     * @param goods 商品信息
     */
    public void updateGoods(Goods goods);


    /**
     * 根据商品ID获取商品信息
     * @param id 商品编号
     * @return 商品信息
     */
    public Goods getGoodsById(String id);


    /**
     * 获取所有商品信息
     * @return 商品信息
     */
    public List<Goods> getAllGoods();



    /**
     * 根据销量获取n条商品信息
     * @param n 商品条数
     * @return 商品信息
     */
    public List<Goods> getGoodsBySellNum(Integer n);


    /**
     * 根据商品上架时间获取商品信息
     * @param n 商品条数
     * @return 商品信息
     */
    public List<Goods> getGoodsBySellTime(Integer n);


    /**
     * 根据商品热度获取商品信息
     * @param n 商品条数
     * @return 商品信息
     */
    public List<Goods> getGoodsByRole(Integer n);
}
