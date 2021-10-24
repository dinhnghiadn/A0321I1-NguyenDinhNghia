package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = {"","/list"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add( new Customer("Nguyễn Văn A", "05/06/1990","Hà Nội","1.jpg"));
        customerList.add( new Customer("Nguyễn Văn B", "12/06/1980","TPHCM","1.jpg"));
        customerList.add( new Customer("Nguyễn Văn C", "29/07/1970","Đà Nẵng","1.jpg"));
        request.setAttribute("customerListServlet", customerList);
        request.getRequestDispatcher("list_customer.jsp").forward(request,response);

    }
}
