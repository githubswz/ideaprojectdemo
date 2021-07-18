package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 创建SqlSession，称为持久化管理器，是MyBatis的核心
         */
        // 1.创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        // 2.创建SqlSessionFactory
        SqlSessionFactory factory = builder.build(Test01.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));

        // 3.创建SqlSession
        SqlSession session = factory.openSession();

        // Connection conn = session.getConnection();
        // System.out.println(conn);


        User user=new User();
        user.setUsername("tom");
        user.setPassword("111");
        user.setPhone("110");
        user.setAddress("南京");

        /**
         * 方式1：纯配置文件的方式，没有接口
         * 直接读取mapper该文件
         */
        // session.insert("aaa.insertUser",user); // 参数1表示当前调用的方法，值为namespace.id，参数2表示方法的实参

        /**
         * 方式2：配置文件+接口
         * 通过代理自动生成DAO的实现类
         */
        UserDao userDao=session.getMapper(UserDao.class); // 参数为接口的Class对象
        // System.out.println(userDao.getClass()); // 代理对象
        userDao.insertUser(user);

        session.commit(); // 提交事务
    }
}
