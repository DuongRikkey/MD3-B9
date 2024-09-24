package org.example.md3session09;

import model.UserData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="bt2Servlet", value="/bt2Servlet")
public class BT2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        UserData user = new UserData(1,20,"sosauchin2@gmail.com","Duong");
        request.setAttribute("user", user);
        request.getRequestDispatcher("bt2.jsp").forward(request,response);


    }
}
