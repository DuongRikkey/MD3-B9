package org.example.md3session09;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//<%-- element a - get / form -> post | get --%>
@WebServlet(name="bt3Servlet", value="/bt3Servlet")
public class BT3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.sendRedirect("bt3.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userAdmin = "duong123";
        String password = "duong123";
        String username = request.getParameter("username");
        String password2 = request.getParameter("password");

        // Kiểm tra null trước khi gọi .equals() để tránh NullPointerException
        if (username != null && password2 != null && username.equals(userAdmin) && password.equals(password2)) {
            response.getWriter().println("Đăng nhập thành công");
        } else {
            // Nếu username hoặc password không đúng, trả về thông báo lỗi
            request.setAttribute("errorMessage", "Tài khoản hoặc mật khẩu không chính xác.");
            request.getRequestDispatcher("bt3.jsp").forward(request, response);
//            Phương thức này cho phép bạn chuyển tiếp yêu cầu đến một tài nguyên khác
//            mà không thay đổi URL trong trình duyệt của người dùng
            response.getWriter().println("");
        }
    }



}
