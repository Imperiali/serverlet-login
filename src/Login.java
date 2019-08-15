import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", urlPatterns="/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF=8");
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("password");

        if (matricula.equals("123") && senha.equals("java")) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("mat", matricula);

            RequestDispatcher rd = request.getRequestDispatcher("/Principal");
            rd.forward(request, response);
        } else {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>\n" +
                        "    <title>$Title$</title>\n" +
                        "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n" +
                        "          integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                        "  </head>");
                out.println("<body>");
                out.println("<nav class=\"navbar navbar-dark bg-dark\">\n" +
                        "      <a class=\"navbar-brand\" href=\"\">Login</a>\n" +
                        "    </nav>");
                out.println("<div class=\"container\">");
                out.println("<p>ERRO</p>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>\n" +
                    "    <title>$Title$</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n" +
                    "          integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                    "  </head>");
            out.println("<body>");
            out.println("<nav class=\"navbar navbar-dark bg-dark\">\n" +
                    "      <a class=\"navbar-brand\" href=\"\">Login</a>\n" +
                    "    </nav>");
            out.println("<div class=\"container\">");
            out.println("<p>AAAAAA</p>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
