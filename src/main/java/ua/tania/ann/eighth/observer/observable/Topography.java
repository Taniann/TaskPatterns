package ua.tania.ann.eighth.observer.observable;

import java.util.Observable;

/**
 * Created by Таня on 07.08.2018.
 */
public class Topography extends Observable{

    public void printIssue() {
        System.out.println("new issue has been printed");
        setChanged();
        notifyObservers();
    }
}
