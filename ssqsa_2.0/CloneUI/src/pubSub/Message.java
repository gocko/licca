package pubSub;


public class Message {
	
	private Class<?> type;
	private Object data;
	private Publisher sender;
	
	public Message(Class<?> type, Object data, Publisher sender) {
		this.type = type;
		this.data = data;
		this.sender = sender;
	}
	
	public Class<?> getType() {
		return type;
	}

	public Object getData() {
		return data;
	}

	public Publisher getSender() {
		return sender;
	}
	
	
}
