package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品持久层接口
 *
 * @author 李广帅
 * @Date 2020/4/13 6:39 下午
 */
@Repository("goodsDao")
public interface IGoodsDao {

    /**
     * 添加商品
     * @param goods 商品信息
     */
    public void addGoods(Goods goods);


    /**
     * 删除商品
     * @param id 商品ID
     */
    public void deleteGoods(String id);


    /**
     * 更新商品
     * @param goods 商品信息
     */
    public void updateGoods(Goods goods);


    /**
     * 查找所有商品
     * @return 所有商品信息
     */
    public List<Goods> findAllGoods();


    /**
     * 根据多个名称查找商品
     * @param names 商品名称
     * @return 商品信息
     */
    public List<Goods> findGoodsByNames(String[] names);


    /**
     * 根据多个ID查找商品
     * @param ids ID
     * @return 商品信息
     */
    public List<Goods> findGoodsByIds(String[] ids);


    /**
     * 根据分类查找n个商品
     * @param categoryId 分类编号
     * @param n 商品数量
     * @return 商品信息
     */
    public List<Goods> findGoodsByCategory(@Param("categoryId") String categoryId, @Param("n") Integer n);


    /**
     * 按照上架时间排名并返回前n个商品信息
     * @param n 返回商品数量
     * @return 商品信息
     */
    public List<Goods> findGoodsOrderBySellTime(Integer n);


    /**
     * 按照销量排名并返回前n个商品信息
     * @param n 返回商品数量
     * @return 商品信息
     */
    public List<Goods> findGoodsOrderBySellNum(Integer n);


    /**
     * 按照商品热卖程度排名并返回前n个商品信息
     * @param n 返回商品数量
     * @return 商品信息
     */
    public List<Goods> findGoodsOrderByRole(Integer n);


    /**
     * 根据ID查找商品
     * @param id 商品ID
     * @return 商品信息
     */
    public Goods findGoodsById(String id);

}
