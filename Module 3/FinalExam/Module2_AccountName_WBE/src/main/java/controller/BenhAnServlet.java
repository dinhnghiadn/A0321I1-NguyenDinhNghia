package controller;

import model.bean.BenhAn;
import model.service.BenhAnService;
import model.service.impl.BenhAnServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "BenhAnServlet",urlPatterns = {"","/benhan"})
public class BenhAnServlet extends HttpServlet {
    BenhAnService benhAnService = new BenhAnServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "edit":
                    updateBenhAn(request,response);
                    break;
                case "delete":
                    deleteBenhAn(request,response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void updateBenhAn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String tenBenhNhan = request.getParameter("tenBenhNhan");
        String nhapVien = request.getParameter("nhapVien");
        String xuatVien = request.getParameter("xuatVien");
        String lyDo = request.getParameter("lyDo");
        int idBenhNhan = Integer.parseInt(request.getParameter("idBenhNhan"));
        BenhAn benhAn = new BenhAn(id,idBenhNhan,tenBenhNhan,nhapVien,xuatVien,lyDo);
        benhAnService.save(benhAn);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mainview/benhan/edit.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        try {
            switch (action){
                case "create":
    //                    showNewForm(request,response);
    //                    break;
                case "edit":
                        showEditForm(request,response);
                        break;
                case "delete":
                        showDeleteForm(request,response);
                        break;
                default:
                    showList(request,response);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        BenhAn benhAn = this.benhAnService.findById(id);
        RequestDispatcher dispatcher;
        if (benhAn == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("benhan", benhAn);
            dispatcher = request.getRequestDispatcher("/mainview/benhan/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteBenhAn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
        int id = Integer.parseInt(request.getParameter("id"));
        benhAnService.delete(id);
        List<BenhAn> benhAnList = benhAnService.findAll();
        request.setAttribute("benhAnList", benhAnList);
        request.getRequestDispatcher("/mainview/benhan/list.jsp").forward(request,response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        BenhAn benhAn = benhAnService.findById(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mainview/benhan/edit.jsp");
        request.setAttribute("benhan", benhAn);
        dispatcher.forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<BenhAn> benhAnList = benhAnService.findAll();
        request.setAttribute("benhAnList", benhAnList);
        request.getRequestDispatcher("/mainview/benhan/list.jsp").forward(request,response);
    }
}
