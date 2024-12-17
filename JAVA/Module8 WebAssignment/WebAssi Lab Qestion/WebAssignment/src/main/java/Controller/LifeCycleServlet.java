package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet Constructor Called");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("LifeCycleServlet init() method called");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("LifeCycleServlet doGet() method called");
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet destroy() method called");
    }
}
