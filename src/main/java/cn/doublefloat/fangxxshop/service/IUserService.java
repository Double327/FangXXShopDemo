package cn.doublefloat.fangxxshop.service;

import cn.doublefloat.fangxxshop.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层接口
 * @author 李广帅
 * @Date 2020/4/12 1:49 下午
 */
public interface IUserService {


    /**
     * 用户注册
     * @param user
     */
    public void register(User user);


    /**
     * 根据用户名、密码查找用户
     * @param username
     * @param password
     * @return
     */
    public User findUser(String username, String password);


    /**
     * 检测用户名是否存在
     * @param username
     * @return
     */
    public boolean isExist(String username);


    /**
     * 根据ID修改用户头像
     * @param id
     * @param avatar
     */
    public void updateAvatar(String id, String avatar);


    /**
     * 修改用户余额
     * @param id
     * @param money
     */
    public void updateMoney(String id, Double money);


    /**
     * 获取所有用户信息
     * @return
     */
    public List<User> getAllUsers();


    /**
     * 删除用户
     * @param id
     */
    public void deleteUserById(String id);


    /**
     * 根据ID获取用户
     * @param id
     * @return
     */
    public User getUserById(String id);


    /**
     * 更新用户状态
     * @param id
     * @param status
     */
    public void updateStatus(String id, Integer status);



}
