package cn.doublefloat.fangxxshop.service;

import cn.doublefloat.fangxxshop.entity.Category;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/15 5:23 下午
 */
public interface ICategoryService {

    /**
     * 添加分类信息
     * @param category 分类信息
     */
    public void addCategory(Category category);


    /**
     * 删除分类信息
     * @param id 分类编号
     */
    public void deleteCategoryById(String id);


    /**
     * 更新分类信息
     * @param category 分类信息
     */
    public void updateCategory(Category category);

    /**
     * 获取所有分类信息
     * @return 分类信息
     */
    public List<Category> getAllCategory();


    /**
     * 为主页面获取分类信息
     * @return 分类信息
     */
    public List<Category> getCategoryForIndex();


    /**
     * 根据ID获取分类信息
     * @param id 编号
     * @return 分类信息
     */
    public Category getCategoryById(String id);


    /**
     * 根据分类名获取分类信息
     * @param name 分类名
     * @return 分类信息
     */
    public Category getCategoryByName(String name);
}
