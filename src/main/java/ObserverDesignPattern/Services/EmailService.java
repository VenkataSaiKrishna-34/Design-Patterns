package ObserverDesignPattern.Services;

import ObserverDesignPattern.Observer;

public class EmailService implements Observer {
    public void notify(String stockName, Double price){
        System.out.println("Email Notification: " + stockName + " Stock price changed. New price = " + price);
    }
}
