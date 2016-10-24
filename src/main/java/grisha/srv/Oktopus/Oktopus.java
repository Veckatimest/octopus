package grisha.srv.Oktopus;

import java.util.ArrayList;
import java.util.List;

public class Oktopus implements IPublisher {
	List<INotification> recentNotifications = new ArrayList<INotification>();
	List<ISubscriber> subscribers = new ArrayList<ISubscriber>();
	
	public List<INotification> getRecentNotifications()	{
		return recentNotifications;
	}
	
	@Override
	public void registerSubscriber(ISubscriber subscriber) {
		this.subscribers.add(subscriber);
	}
	
	@Override
	public void removeSubscriber(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers(INotification notification) {
		recentNotifications.add(notification);
		for (ISubscriber subscriber : subscribers) {
			subscriber.getMessage(notification);
		}
			
	}
}
