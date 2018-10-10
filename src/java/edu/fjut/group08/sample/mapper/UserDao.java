/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjut.group08.sample.mapper;

import edu.fjut.group08.sample.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *该接口管理用户的行为，学习框架中注解的使用, 注意： 测试Junit NetBeans--》右键--》导航--》测试类 ！！！
 * @author ·
 */
public interface UserDao {
    /**
     * 插入单个用户
     * @param user <br>
     *         #{uname},#{upass} 表示的是 传入参数user中的成员 名称必须相同
     * @return 成功 - true <br>
     *          失败 - false
     */
    @Insert("insert into user(uname,upass) values(#{uname},#{upass})")
    boolean insert(User user);
    
    /**
     * 通过用户主键 Integer id 删除用户
     * @param uid int
     * @return 
     */
    boolean deleteByPrimaryKey(int uid);
    
    /**
     * 修改用户姓名密码信息，通过主键
     * @param user
     * @return 
     */
    @Update("update user set uname=#{uname},upass=#{upass} where uid=#{uid}")
    boolean updateByPrimaryKey(User user);
    
    /**
     * 通过用户uid查询用户信息
     * @param uid
     * @return 
     */
    @Select("select * from user where uid=#{uid}")
    User selectByPrimaryKey(int uid);
    
    /**
     * 查询所有学生
     * @return 
     */
    @Select("select * from user")
    List<User> selectList();
}
