package grisha.srv;

import java.io.IOException;
import java.util.UUID;
import java.util.Map;
import java.util.HashMap;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import grisha.srv.chatBack.*;

/**
 * Servlet implementation class PollingRequestManager
 */
public class PollingRequestManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<UUID, UserInSession> clients;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PollingRequestManager() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		clients = new HashMap<UUID, UserInSession>();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
