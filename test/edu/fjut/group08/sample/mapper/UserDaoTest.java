/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjut.group08.sample.mapper;

import edu.fjut.group08.sample.entity.User;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *注意： 学习使用Junit测试spring项目 两个新注解 ！！！  注解 依赖注入 测试断言 的使用
 * @author ·
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class UserDaoTest {
    
    @Autowired
    UserDao userDao; //依赖注入 ，默认bytype形式,直接根据接口来   byName是指定实现类 @Qualifier("oracleDao") ！！！！
    
    public UserDaoTest() {
    }

    @Test
    public void testInsert() {
//        User user=new User("vvv","123");
//        boolean result=userDao.insert(user);
//        assertTrue(result);
    }

    @Test
    public void testDeleteByPrimaryKey() {
    }

    @Test
    public void testUpdateByPrimaryKey() {
    }

    @Test
    public void testSelectByPrimaryKey() {
        User user= userDao.selectByPrimaryKey(1);
        System.out.println(user.getUname());
        assertNotNull(user);
    }

    @Test
    public void testSelectList() {
        List<User> list=userDao.selectList();
        System.out.println(list.size());
        assertTrue(list.size()>0);
    }

    public class UserDaoImpl implements UserDao {

        public boolean insert(User user) {
            return false;
        }

        public boolean deleteByPrimaryKey(int uid) {
            return false;
        }

        public boolean updateByPrimaryKey(User user) {
            return false;
        }

        public User selectByPrimaryKey(int uid) {
            return null;
        }

        public List<User> selectList() {
            return null;
        }
    }
    
}
