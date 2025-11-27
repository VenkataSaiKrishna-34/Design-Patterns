package ObserverDesignPattern.Services;

import ObserverDesignPattern.Observer;

public class SmsService implements Observer {
    public void notify(String stockName, Double price){
        System.out.println("SMS Notification: " + stockName + " Stock price changed. New price = " + price);
    }
}
