/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjut.group08.sample.entity;

/**
 *
 * @author · 注意 ： bean、pojo 实体类的属性类型 尽量用包装类 ！！！
 */
public class User {
    private Integer uid;
    private String uname;
    private String upass;

    /**
     * @return the id
     */
    public Integer getId() {
        return uid;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @param uname the uname to set
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * @return the upass
     */
    public String getUpass() {
        return upass;
    }

    /**
     * @param upass the upass to set
     */
    public void setUpass(String upass) {
        this.upass = upass;
    }

    public User(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", uname=" + uname + ", upass=" + upass + '}';
    }

    public User() {
    }
}
