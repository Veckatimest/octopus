package grisha.srv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet implementation class Basic
 */
@Controller
public class ChatManager {

	@RequestMapping(value={"/other"},method=RequestMethod.GET)
	public ModelAndView other() {
		String answer = "ind22";
		return new ModelAndView("other", "message", answer);
	}
	
	@RequestMapping(value={""},method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index", "message", "ind22");
	}
	
	@RequestMapping(value={"/testy"},method=RequestMethod.GET)
	public @ResponseBody String testy() {
		return "I'm okay";
	}
	

//    @Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String pathInfo = request.getPathInfo();
//		if (pathInfo.equals("/"))
//		{
//			response.sendRedirect("other.jsp");
//			return;
//		}
//		if (pathInfo.equals("/login")){
//			HttpSession sess = request.getSession(true);
//			if (sess.getAttribute("sid") == null){
//				UUID userUID = UUID.randomUUID();
//				sess.setAttribute("sid", userUID);
//				String username = request.getParameter("user");
//				User usr = new User();
//				usr.setFirstName(username);
//				UserInSession uis = new UserInSession(usr);
//				ServletContext ctx = getServletContext();
//				Map<UUID, UserInSession> map;
//				try {
//					map = (Map<UUID, UserInSession>)ctx.getAttribute("usermap");
//				}
//				catch (ClassCastException ex) {
//					ex.getMessage();
//					map = new HashMap<UUID, UserInSession>();
//					ctx.setAttribute("usermap", map);
//				}
//				map.put(userUID, uis);
//			}
//		}
//		
//		PrintWriter out = response.getWriter();
//		out.println("<p>pathInfo = " + pathInfo + "</p>");
//	}

//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
//	}

}
