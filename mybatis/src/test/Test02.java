package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

public class Test02 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            User user = new User();
            user.setUsername("秋香");
            user.setPassword("123");
            user.setPhone("119");
            user.setAddress("北京");

            UserDao userDao = session.getMapper(UserDao.class);

            System.out.println("添加前："+user);
            userDao.insert(user);
            System.out.println("添加后："+user);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            MyBatisUtil.close();
        }
    }
}
