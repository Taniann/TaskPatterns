package ua.tania.ann.eighth.observer;

import ua.tania.ann.eighth.observer.observable.Topography;
import ua.tania.ann.eighth.observer.observer.Subscriber;

/**
 * Created by Таня on 07.08.2018.
 */
public class RunObserverPattern {
    public static void main(String[] args) {
        Topography topography = new Topography();
        Subscriber subscriber = new Subscriber();
        topography.addObserver(subscriber);
        topography.printIssue();
    }
}
