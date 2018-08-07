package ua.tania.ann.eighth.observer.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Таня on 07.08.2018.
 */
public class Subscriber implements Observer {
    String name;
    String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void update(Observable o, Object arg) {
        System.out.println("New issue has been received.");
    }
}
