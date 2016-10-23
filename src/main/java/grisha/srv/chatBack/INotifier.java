package grisha.srv.chatBack;

public interface INotifier {
	public void addMessage(Message msg);
	public void setPollingReuest(IJSONResponce resp);
}
