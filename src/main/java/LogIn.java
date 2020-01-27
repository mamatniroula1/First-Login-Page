import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/add")
public class LogIn extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname= request.getParameter("username");
        String pass= request.getParameter("pass");
        PrintWriter printWriter= response.getWriter();
        printWriter.println("you are a user");

        request.setAttribute("uname", uname);
        RequestDispatcher dispatcher= request.getRequestDispatcher("uname");
        dispatcher.forward(request, response);
    }



}
