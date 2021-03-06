package net.ScyllaMc.Matan.Clans;




interface IResponseListener {
    void response(ResponseEvent event);
}


public class ResponseEvent {

	private Object response;

	@SuppressWarnings("unchecked")
	public <T> T getResponse() {
		return (T) response;
	}

	public <T> void setResponse(T response) {
		this.response = response;
	}
	
}