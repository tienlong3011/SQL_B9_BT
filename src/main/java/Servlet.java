import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float ListPrice = Float.parseFloat(request.getParameter("ListPrice"));
        String DiscountPercent = request.getParameter("DiscountPercent");
        float DiscountPercents = Float.parseFloat(DiscountPercent);

        float DiscountAmount = (float) (ListPrice * DiscountPercents * 0.01);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Giá sản phẩm sau khi chiết khấu</h1>");
        writer.println("<h2>" + DiscountAmount + "</h2>");
        writer.println("</html>");
    }
}
