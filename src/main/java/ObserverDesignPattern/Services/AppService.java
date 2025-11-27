package ObserverDesignPattern.Services;

import ObserverDesignPattern.Observer;

public class AppService implements Observer {

    public void notify(String stockName, Double price){
        System.out.println("App Notification: " + stockName + " Stock price changed. New price = " + price);
    }
}
