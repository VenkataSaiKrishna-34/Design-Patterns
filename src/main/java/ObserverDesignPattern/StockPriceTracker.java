package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class StockPriceTracker implements ObserverRegistry {

    private List<Observer> observers;

    StockPriceTracker(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String stockName, Double price) {
        for (Observer observer : observers){
            observer.notify(stockName, price);
        }
    }

    public void updateStockPrice(String stockName, Double price){
        notifyObservers(stockName, price);
    }
}
