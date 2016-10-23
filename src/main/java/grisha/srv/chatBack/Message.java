package grisha.srv.chatBack;

public class Message {
	private String content;
	private String message_type;
	private String source;
	
	public String getMessageType(){
		return content;
	}
	
	public void setMessageType(String message_type){
		this.message_type = message_type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@Override
	public String toString()
	{
		String result = 
			"{ \"text\": \"" + content + "\", "
			+  "\"message_type\": \"" + message_type + "\", "
			+  "\"source\": \"" + source + "}";
		return result;
	}

}
