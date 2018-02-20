package pubSub;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Singleton that is in charge of message delegation. <code>Subscriber</code>s
 * register themselves with <code>MessageBroker</code> in order to receive
 * messages of a given type(s), and <code>Publisher</code>s inform all
 * interested <code>Subscriber</code>s through <code>MessageBroker</code>.
 * 
 * @author Tijana Vislavski
 * 
 */
public class MessageBroker {

	private static MessageBroker instance;

	public static MessageBroker instance() {
		if (instance == null) {
			instance = new MessageBroker();
		}
		return instance;
	}

	private Map<Class<?>, Set<Subscriber>> subscribersByMessageType;
	private SubscriberHandler subscriberHandler;
	private PublisherHandler publisherHandler;

	private MessageBroker() {
		subscribersByMessageType = new HashMap<>();
		subscriberHandler = new SubscriberHandler();
		publisherHandler = new PublisherHandler();
	}

	/**
	 * <code>Subscriber</code>s are registered for message receiving by calling
	 * this method.
	 * 
	 * @param subscriber
	 */
	public void register(Subscriber subscriber) {
		subscriberHandler.register(subscriber);
	}

	/**
	 * <code>Publisher</code> should call this method when it wants to publish a
	 * message of any type. All registered <code>Subscriber</code>s for this
	 * message type would be informed.
	 * 
	 * @param message
	 */
	public void send(Message message) {
		publisherHandler.send(message);
	}

	private class SubscriberHandler {

		void register(Subscriber subscriber) {
			for (Class<?> messageType : subscriber.messageTypes()) {
				register(subscriber, messageType);
			}
		}

		void register(Subscriber subscriber, Class<?> messageType) {
			createMapEntryIfNotExists(messageType);
			subscribersByMessageType.get(messageType).add(subscriber);
		}

		void createMapEntryIfNotExists(Class<?> messageType) {
			if (!subscribersByMessageType.containsKey(messageType)) {
				subscribersByMessageType.put(messageType,
						new HashSet<Subscriber>());
			}
		}
	}

	private class PublisherHandler {

		void send(Message message) {
			if (existsSubscriberForMessage(message.getType())) {
				sendToSubscribers(message);
			}
		}

		boolean existsSubscriberForMessage(Class<?> type) {
			return subscribersByMessageType.containsKey(type);
		}

		void sendToSubscribers(Message message) {
			for (Subscriber subscriber : subscribersByMessageType.get(message
					.getType())) {
				subscriber.onMessageReceived(message);
			}
		}
	}
}
