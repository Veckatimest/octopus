package grisha.srv.chatBack;

import java.util.List;

public class MessageStorage {
	private List<String> messages;
	
	public void setMessages(List<String> messages){
		this.messages = messages;
	}
	
	public List<String> getMessages(){
		return messages;
	}
	
	public void addMessage(String message){
		messages.add(message);
	}
	
}
