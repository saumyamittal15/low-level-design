package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String username;
    StockObservable stockObservable;

    public MobileAlertObserver(StockObservable stockObservable, String username) {
        this.stockObservable = stockObservable;
        this.username = username;
    }

    @Override
    public void update() {
        sendMessage(username);
    }

    private void sendMessage(String username) {
        System.out.println("Msg sent to " + username);
    }
}
