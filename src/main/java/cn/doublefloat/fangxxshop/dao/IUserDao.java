package cn.doublefloat.fangxxshop.dao;

import cn.doublefloat.fangxxshop.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户持久层接口
 *
 * @author 李广帅
 * @Date 2020/4/12 2:07 下午
 */
@Repository("userDao")
public interface IUserDao {

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    public void addUser(User user);


    /**
     * 删除用户
     *
     * @param id 用户ID
     */
    public void deleteUserById(String id);


    /**
     * 修改用户
     *
     * @param user 用户信息
     */
    public void updateUser(User user);


    /**
     * 修改用户余额
     * @param id
     * @param money
     */
    public void updateUserMoney(@Param("id") String id,@Param("money") Double money);


    /**
     * 修改用户头像
     *
     * @param id     用户ID
     * @param avatar 头像路径
     */
    public void updateAvatar(@Param("id") String id, @Param("avatar") String avatar);


    /**
     * 修改用户密码
     *
     * @param id       用户ID
     * @param password 用户密码
     */
    public void updatePassword(@Param("id") String id, @Param("password") String password);


    /**
     * 修改用户状态
     *
     * @param id     用户ID
     * @param status 用户状态
     */
    public void updateUserStatus(@Param("id") String id, @Param("status") Integer status);


    /**
     * 修改用户角色
     *
     * @param id   用户ID
     * @param role 用户角色
     */
    public void updateUserRole(@Param("id") String id, @Param("role") String role);


    /**
     * 根据ID查找用户
     *
     * @param id 用户ID
     * @return 用户信息
     */
    public User findUserById(String id);


    /**
     * 查找所有用户
     *
     * @return 用户信息
     */
    public List<User> findAllUsers();


    /**
     * 根据用户名和密码查找用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户信息
     */
    public User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);


    /**
     * 查找拥有该用户名的用户数量
     *
     * @param name 用户名
     * @return 用户数量
     */
    public Integer findUserNameNum(String name);

}
