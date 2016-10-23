package grisha.srv.Oktopus;

public interface IPublisher {
	void registerSubscriber(ISubscriber subscriber);
	void removeSubscriber(ISubscriber subscriber);
	void notifySubscribers(INotification notification);
}
