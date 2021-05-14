package com.zwl.test;

import com.zwl.dao.StudentDao;
import com.zwl.entity.Student;
import com.zwl.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author Weilei Zhang
 * @Program: TestMain
 * @Description: TODO
 * @create 2021-05-14 19:36
 */
public class TestMain {
    public static void main(String[] args) {
        StudentDao dao = SqlSessionFactoryUtils.openSession(true).getMapper(StudentDao.class);
        List<Student> list = dao.selectAll();
        for(Student s : list){
            System.out.println(s);
        }
    }
}
