package Controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.weddingplannerDao;
import email_servicess.servicess;
import Model.weddingplanner;

/**
 * Servlet implementation class Wp_Controller
 */
@WebServlet("/Wp_Controller")
public class Wp_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Wp_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			weddingplanner u = new weddingplanner();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			String email = request.getParameter("email");
			boolean flag = weddingplannerDao.checkEmail(email);
			if (flag == false) {
				weddingplannerDao.insertUser(u);
				response.sendRedirect("w-login.jsp");
			} else {
				request.setAttribute("msg", "account already registered");
				request.getRequestDispatcher("w-register.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			weddingplanner u = new weddingplanner();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = weddingplannerDao.checkEmail(email);
			if (flag == true) {
				weddingplanner u1 = weddingplannerDao.loginUser(u);
				System.out.println(u1);
				if (u1 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("w-home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password is incorrect");
					request.getRequestDispatcher("w-login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Account not registered");
				request.getRequestDispatcher("w-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			weddingplanner u = new weddingplanner();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			weddingplannerDao.updateUser(u);
			HttpSession session = request.getSession();
			session.setAttribute("data", u);
			request.getRequestDispatcher("w-home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("cp")) {
			String email  = request.getParameter("email");
			String op  = request.getParameter("op");
			String np  = request.getParameter("np");
			String cnp  = request.getParameter("cnp");
			boolean flag= weddingplannerDao.checkPassword(email, op);
			if(flag == true) {
				if(np.equals(cnp)) {
					weddingplannerDao.updatePassword(email, np);
					response.sendRedirect("w-home.jsp");
				}
				else {
					request.setAttribute("msg", "New pass and Confirm new pass not matched");
					request.getRequestDispatcher("w-change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old pass is incorrect");
				request.getRequestDispatcher("w-change-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("getotp")) {
			String email  = request.getParameter("email");
			boolean flag =  weddingplannerDao.checkEmail(email);
			if(flag == true) {
				Random r = new Random();
				int num = r.nextInt(999999);
				servicess s = new servicess();
				s.sendMail(email, num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("wp-verify-otp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "Account not found");
				request.getRequestDispatcher("w-forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify")) {
			String email  = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("w-new-pass.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg", "OTP not matched");
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.getRequestDispatcher("wp-verify-otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("cnp")) {
			String email  = request.getParameter("email");
			String np  = request.getParameter("np");
			String cnp  = request.getParameter("cnp");
			if(np.equals(cnp)) {
				weddingplannerDao.updatePassword(email, np);
				response.sendRedirect("w-login.jsp");
			}
			else {
				request.setAttribute("msg", "NP and CNP not same");
				request.getRequestDispatcher("w-new-pass.jsp").forward(request, response);
			}
		}
	}
}