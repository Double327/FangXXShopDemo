package cn.doublefloat.fangxxshop.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 商品分类
 * @author 李广帅
 * @Date 2020/4/11 9:34 下午
 */
public class Category implements Serializable {
    private String id;
    private String name;
    private Integer goodsNum;

    private List<Goods> goodses = null;

    public Category() {
    }

    public Category(String id, String name, Integer goodsNum) {
        this.id = id;
        this.name = name;
        this.goodsNum = goodsNum;
    }

    public Category(String id, String name, Integer goodsNum, List<Goods> goodses) {
        this.id = id;
        this.name = name;
        this.goodsNum = goodsNum;
        this.goodses = goodses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public List<Goods> getGoodses() {
        return goodses;
    }

    public void setGoodses(List<Goods> goodses) {
        this.goodses = goodses;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", goodsNum=" + goodsNum +
                ", goods=" + goodses +
                '}';
    }
}
