package ObserverDesignPattern;

import ObserverDesignPattern.Services.AppService;
import ObserverDesignPattern.Services.EmailService;
import ObserverDesignPattern.Services.SmsService;

public class Client {
    public static void main(String[] args) {

        StockPriceTracker stockPriceTracker = new StockPriceTracker();

        Observer appService = new AppService();
        Observer smsService = new SmsService();
        Observer emailService = new EmailService();

        stockPriceTracker.addObserver(appService);
        stockPriceTracker.addObserver(emailService);

        stockPriceTracker.updateStockPrice("Adani", 10.01);

        stockPriceTracker.removeObserver(emailService);
        stockPriceTracker.addObserver(smsService);

        stockPriceTracker.updateStockPrice("Adani", 12.01);
    }
}
