package grisha.srv.chatBack;

import java.io.PrintWriter;

public class PrintWriterJSONResponce implements IJSONResponce {
	private final PrintWriter writer;
	
	public PrintWriterJSONResponce(PrintWriter wr){
		writer = wr;
	}
	
	
	@Override
	public void sendResponse(String json) {
		writer.print(json);
		writer.flush();
	}

}
