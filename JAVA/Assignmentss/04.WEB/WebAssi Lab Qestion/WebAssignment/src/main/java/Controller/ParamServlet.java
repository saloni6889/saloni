<<<<<<< HEAD
package Controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ParamServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String paramValue = config.getInitParameter("configParam");
        System.out.println("Fetched Init Parameter: " + paramValue);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("ParamServlet is working");
    }
}
=======
package Controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ParamServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String paramValue = config.getInitParameter("configParam");
        System.out.println("Fetched Init Parameter: " + paramValue);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("ParamServlet is working");
    }
}
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
