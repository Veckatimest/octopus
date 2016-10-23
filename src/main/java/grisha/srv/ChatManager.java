package grisha.srv;

import java.lang.ClassCastException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import grisha.srv.chatBack.*;

/**
 * Servlet implementation class Basic
 */
@WebServlet(description = "Chat servlet", urlPatterns = { "/login"})
public class ChatManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ChatManager() {
		super();
	}
	
	@Override
	public void init()
	{
		ServletContext ctx = getServletContext(); 
		if (ctx.getAttribute("usermap") == null){
			ctx.setAttribute("usermap", new HashMap<UUID, UserInSession>());
		}
	}

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		if (pathInfo.equals("/"))
		{
			response.sendRedirect("other.jsp");
			return;
		}
		if (pathInfo.equals("/login")){
			HttpSession sess = request.getSession(true);
			if (sess.getAttribute("sid") == null){
				UUID userUID = UUID.randomUUID();
				sess.setAttribute("sid", userUID);
				String username = request.getParameter("user");
				User usr = new User();
				usr.setFirstName(username);
				UserInSession uis = new UserInSession(usr);
				ServletContext ctx = getServletContext();
				Map<UUID, UserInSession> map;
				try {
					map = (Map<UUID, UserInSession>)ctx.getAttribute("usermap");
				}
				catch (ClassCastException ex) {
					ex.getMessage();
					map = new HashMap<UUID, UserInSession>();
					ctx.setAttribute("usermap", map);
				}
				map.put(userUID, uis);
			}
		}
		
		PrintWriter out = response.getWriter();
		out.println("<p>pathInfo = " + pathInfo + "</p>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession sess = request.getSession(true);
//		if (sess.getAttribute("sid") == null)
//			sess.setAttribute("sid", UUID.randomUUID());
//		String data = request.toString();
//		notifyable.put(sess.getAttribute("sid").toString(), new StoredRequest(request, response));
//		for(StoredRequest sr : notifyable.values()){
//			HttpServletResponse resp = sr.getResponce();
//			resp.setContentType("application/json");
//			resp.getWriter().write(data.toString());
//			doGet(sr.getRequest(), resp);
//		}
	}

}
