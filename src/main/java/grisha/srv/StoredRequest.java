package grisha.srv;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StoredRequest {
	private HttpServletRequest request;
	private HttpServletResponse responce;
	
	public StoredRequest(HttpServletRequest _request, HttpServletResponse _responce)
	{
		request = _request;
		responce = _responce;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponce() {
		return responce;
	}
	


}
