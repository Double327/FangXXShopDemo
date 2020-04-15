package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李广帅
 * @Date 2020/4/14 5:23 下午
 */
@Repository("categoryDao")
public interface ICategoryDao {

    /**
     * 添加类别
     * @param category 分类"对象"
     */
    public void addCategory(Category category);


    /**
     * 删除类别
     * @param id 类别ID
     */
    public void deleteCategory(String id);


    /**
     * 更新类别信息
     * @param category 分类"对象"
     */
    public void updateCategory(Category category);


    /**
     * 查询所有分类信息
     */
    public List<Category> findAllCategory();


    /**
     * 根据ID查找分类信息
     * @param id
     */
    public Category findCategoryById(String id);
}
