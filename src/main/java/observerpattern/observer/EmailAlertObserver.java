package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String email;
    StockObservable stockObservable;

    public EmailAlertObserver(StockObservable stockObservable, String email) {
        this.stockObservable = stockObservable;
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email) {
        System.out.println("Mail sent to " + email);
    }
}
