package org.example.md3session09;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bt1Servlet", value = "/bt1Servlet")
public class BT1Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String description = request.getParameter("productDescription");
            double price = Double.parseDouble(request.getParameter("price"));
            double discountPercent = Double.parseDouble(request.getParameter("DiscountPercent"));

            // Calculate discount amount and final price
            double discountAmount = price * (discountPercent / 100);
            double discountPrice = price - discountAmount;

            // Set attributes for forwarding to JSP
            request.setAttribute("des", description);
            request.setAttribute("price", price);
            request.setAttribute("discount", discountPercent);
            request.setAttribute("discountAmount", discountAmount);
            request.setAttribute("discountPrice", discountPrice);

//            request.setAttribute(String name, Object value);
//            truyền dữ liệu giữa các thành phần mà không làm thay đổi URL hoặc tạo ra các yêu cầu HTTP mới
//            name: Tên của thuộc tính mà bạn muốn gán
//            value: Giá trị của thuộc tính,

            // Forward to JSP
            request.getRequestDispatcher("bt1-display.jsp").forward(request, response);
            // chuyển tiếp yêu cầu đến tài nguyên khác
        } catch (NumberFormatException e) {
            // Handle exception in case of invalid input
            response.getWriter().println("Invalid number format for price or discount. Please enter valid values.");
        }
    }
}
