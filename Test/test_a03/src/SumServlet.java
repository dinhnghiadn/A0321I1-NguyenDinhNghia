import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SumServlet", urlPatterns = {"/sum"})
public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("number1");
        String b = request.getParameter("number2");
        int c = Integer.parseInt(a) + Integer.parseInt(b);
        request.setAttribute("resultFromServlet",c);
        request.getRequestDispatcher("result.jsp").forward(request,response);
    }
}
