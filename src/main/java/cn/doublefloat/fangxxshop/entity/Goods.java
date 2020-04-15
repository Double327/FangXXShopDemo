package cn.doublefloat.fangxxshop.entity;

import java.io.Serializable;

/**
 * 商品类
 * @author 李广帅
 * @Date 2020/4/11 9:26 下午
 */
public class Goods implements Serializable {
    private String id;
    private String name;
    private String goodsNo;
    private String categoryId;
    private Double price1;
    private Double price2;
    private Integer stock;
    private String thumbnail;
    private String description;
    private Integer role;
    private Integer sellTime;
    private Integer sellNum;
    private Double score;

    public Goods() {
    }

    public Goods(String id, String name, String goodsNo, String categoryId, Double price1, Double price2,
                 Integer stock, String thumbnail, String description, Integer role, Integer sellTime, Integer sellNum, Double score) {
        this.id = id;
        this.name = name;
        this.goodsNo = goodsNo;
        this.categoryId = categoryId;
        this.price1 = price1;
        this.price2 = price2;
        this.stock = stock;
        this.thumbnail = thumbnail;
        this.description = description;
        this.role = role;
        this.sellTime = sellTime;
        this.sellNum = sellNum;
        this.score = score;
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

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice1() {
        return price1;
    }

    public void setPrice1(Double price1) {
        this.price1 = price1;
    }

    public Double getPrice2() {
        return price2;
    }

    public void setPrice2(Double price2) {
        this.price2 = price2;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getSellTime() {
        return sellTime;
    }

    public void setSellTime(Integer sellTime) {
        this.sellTime = sellTime;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", goodsNo='" + goodsNo + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", price1=" + price1 +
                ", price2=" + price2 +
                ", stock=" + stock +
                ", thumbnail='" + thumbnail + '\'' +
                ", description='" + description + '\'' +
                ", role=" + role +
                ", sellTime=" + sellTime +
                ", sellNum=" + sellNum +
                ", score=" + score +
                '}';
    }
}
