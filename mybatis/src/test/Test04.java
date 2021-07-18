package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            UserDao userDao = session.getMapper(UserDao.class);

            // User user = userDao.selectById2(1);
            // User user = userDao.selectById3(1);
            // System.out.println(user);

            // User user = userDao.selectByUsernameAndPassword("alice", "111");
            // User user = userDao.selectByUsernameAndPassword2("alice", "111");

            // User u = new User();
            // u.setUsername("alice");
            // u.setPassword("111");
            // User user = userDao.selectByUsernameAndPassword3(u);

            // Map map=new HashMap<String,Object>();
            // map.put("username","alice");
            // map.put("password","111");
            // User user = userDao.selectByUsernameAndPassword4(map);
            // System.out.println(user);

            String username="a";
            // List<User> users = userDao.selectByUsername("%" + username + "%");
            List<User> users = userDao.selectByUsername2(username);
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
