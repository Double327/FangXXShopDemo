package cn.doublefloat.fangxxshop.entity;

import java.io.Serializable;

/**
 * 用户类
 * @author 李广帅
 * @Date 2020/4/11 9:23 下午
 */
public class User implements Serializable {
    private String id;
    private String name;
    private String password;
    private String phoneNum;
    private Double money;
    private String avatar;
    private String regTime;
    private String role;
    private Integer status;
    private String email;


    private String loginId;
    private String loginTime;
    private String ip;

    public User() {
    }

    public User(String id, String name, String password, String phoneNum, Double money, String avatar,
                String regTime, String role, Integer status, String email, String loginId, String loginTime, String ip) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
        this.money = money;
        this.avatar = avatar;
        this.regTime = regTime;
        this.role = role;
        this.status = status;
        this.email = email;
        this.loginId = loginId;
        this.loginTime = loginTime;
        this.ip = ip;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", money=" + money +
                ", avatar='" + avatar + '\'' +
                ", regTime='" + regTime + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
