package grisha.srv.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import grisha.srv.chatBack.MessageStorage;

//import grisha.srv.chatBack.*;

/**
 * Servlet implementation class PollingRequestManager
 */
@Controller
@RequestMapping(value={"/polling"})
public class PollingRequestManager{
	@Autowired
	MessageStorage messages;
	
	@RequestMapping(path="",method=RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getJson() {
		List<String> contents = messages.getMessages();
		Iterator<String> it = contents.iterator();
		String result = "[ \"" + it.next() + "\"";
		while (it.hasNext()) {
			result += ",\"" + it.next() + "\""; 
		}
		result += "]";
		return new String("{\"success\":\"true\", \"messages\":" + result + "}"); 
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET, produces = "application/json")
	public @ResponseBody String addJson(@PathVariable("id") String id) {
		messages.addMessage(id);
		return getJson(); 
	}


}
