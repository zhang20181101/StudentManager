package com.zwl.servlet;

import com.zwl.dao.StudentDao;
import com.zwl.entity.Student;
import com.zwl.utils.SqlSessionFactoryUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author Weilei Zhang
 * @Program: ${NAME}
 * @Description: TODO ${TODO}
 * @create 2021-05-14 19:50
 */
public class SelectServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        StudentDao dao = SqlSessionFactoryUtils.openSession(true).getMapper(StudentDao.class);
        List<Student> list = dao.selectAll();
        request.setAttribute("students" , list);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}
