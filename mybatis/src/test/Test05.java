package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.Arrays;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            UserDao userDao = session.getMapper(UserDao.class);

            User userParam=new User();
            userParam.setId(2);
            userParam.setUsername("ccc");
            userParam.setPassword("666");
            userParam.setPhone("110");
            // userParam.setAddress("广州");

            // List<User> users = userDao.selectByParams(userParam);
            // List<User> users = userDao.selectByParams2(userParam);
            // List<User> users = userDao.selectByParams4(userParam);
            // System.out.println(users);

            // userDao.updateUser2(userParam);
            // userDao.updateUser3(userParam);

            List<User> users = userDao.selectByIds(Arrays.asList(2, 4, 7));
            System.out.println(users);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        } finally {
            MyBatisUtil.close();
        }

    }
}
