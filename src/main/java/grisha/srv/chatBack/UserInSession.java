package grisha.srv.chatBack;

import java.util.LinkedList;
import java.util.List;

public class UserInSession {
	private List<INotifier> notifiers;
	private final User user;
	
	public UserInSession(User user){
		this.user = user;
		this.notifiers = new LinkedList<INotifier>(); 
	}
	
	public User getUser() {
		return user;
	}
	
	public void getNotification(Message message)
	{
		for (INotifier nt : notifiers) {
			nt.addMessage(message);
		}
	}
	
}
