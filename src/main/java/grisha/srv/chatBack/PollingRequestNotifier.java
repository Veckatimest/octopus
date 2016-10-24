package grisha.srv.chatBack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PollingRequestNotifier implements INotifier {
	private List<Message> messages;
	private UUID sessionId;
	private IJSONResponce resp;
	
	public PollingRequestNotifier(UUID session_id) {
		this.setSessionId(session_id);
		this.messages = new ArrayList<Message>();
	}

	@Override
	public void addMessage(Message msg) {
		messages.add(msg);
		if (this.resp != null)
		{
			resp.sendResponse(messages.toString());
			resp = null;
		}
	}

	@Override
	public void setPollingReuest(IJSONResponce resp) {
		if (this.resp != null)
			this.resp.sendResponse("{\"Error\":\"You've already sent the request\"}");
		this.resp = resp;
	}

	public UUID getSessionId() {
		return sessionId;
	}

	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}
}
