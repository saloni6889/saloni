<<<<<<< HEAD
package Controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ConfigServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String configParam = config.getServletContext().getInitParameter("contextParam");
        System.out.println("Fetched Context Parameter: " + configParam);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("ConfigServlet is working");
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

@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ConfigServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String configParam = config.getServletContext().getInitParameter("contextParam");
        System.out.println("Fetched Context Parameter: " + configParam);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("ConfigServlet is working");
    }
}
>>>>>>> 7faeab555ce7a936a451038d30e0dadadcc4b3c3
