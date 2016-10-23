package grisha.srv.Oktopus;

import java.util.Map;

public interface INotification {
	Map<String, String> getHeaders();
	String getContents();
}
