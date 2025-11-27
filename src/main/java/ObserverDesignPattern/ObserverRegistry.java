package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public interface ObserverRegistry {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String stockName, Double price);
}
