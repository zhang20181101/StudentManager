package com.zwl.servlet;

import com.zwl.dao.StudentDao;
import com.zwl.entity.Student;
import com.zwl.utils.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Weilei Zhang
 * @Program: ${NAME}
 * @Description: TODO ${TODO}
 * @create 2021-05-14 21:02
 */
public class SelectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        StudentDao dao = SqlSessionFactoryUtils.openSession(true).getMapper(StudentDao.class);
        List<Student> list = dao.selectAll();
        request.setAttribute("students" , list);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}
