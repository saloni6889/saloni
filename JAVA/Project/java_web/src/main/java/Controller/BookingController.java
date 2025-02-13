package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BookingDao;
import Model.Booking;
import Model.User;

/**
 * Servlet implementation class BookingController
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("booknow")) {
			Booking b = new Booking();
			b.setPid(Integer.parseInt(request.getParameter("pid")));
			b.setCus_id(Integer.parseInt(request.getParameter("cusid")));
			b.setBooking_status("pending");
			b.setPayment_status("pending");
			BookingDao.insertBooking(b);
			response.sendRedirect("c-home.jsp");
		}
		else if(action.equalsIgnoreCase("confirm")) {
			int bid= Integer.parseInt(request.getParameter("bid"));
			BookingDao.updateBookingStatus(bid);
			response.sendRedirect("w-home.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
