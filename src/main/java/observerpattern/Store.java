package observerpattern;

import observerpattern.observable.IphoneObservableImpl;
import observerpattern.observable.StockObservable;
import observerpattern.observer.EmailAlertObserver;
import observerpattern.observer.MobileAlertObserver;
import observerpattern.observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneObservers = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserver(iphoneObservers, "abc@d.com");
        NotificationAlertObserver observer2 = new EmailAlertObserver(iphoneObservers, "wxy@z.com");
        NotificationAlertObserver observer3 = new MobileAlertObserver(iphoneObservers, "pqrs");

        iphoneObservers.add(observer1);
        iphoneObservers.add(observer2);
        iphoneObservers.add(observer3);

        iphoneObservers.setStockCount(20);

    }
}
