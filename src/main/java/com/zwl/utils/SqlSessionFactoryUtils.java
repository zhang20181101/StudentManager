package com.zwl.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Weilei Zhang
 * @Program: SqlSessionFactoryUtils
 * @Description: TODO
 * @create 2021-05-14 19:37
 */
public class SqlSessionFactoryUtils {
    private static  SqlSessionFactory factory = null;
    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession openSession(boolean ss){
        return factory.openSession(ss);
    }
}
