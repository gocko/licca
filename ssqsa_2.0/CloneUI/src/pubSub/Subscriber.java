package pubSub;


/**
 * Interface used for indicating that type is a part of PubSub
 * communication.
 * 
 * @author Tijana Vislavski
 *
 */
public interface Subscriber {
	Class<?>[] messageTypes();
	void onMessageReceived(Message message);
}
