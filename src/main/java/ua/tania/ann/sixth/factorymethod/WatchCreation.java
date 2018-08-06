package ua.tania.ann.sixth.factorymethod;

import ua.tania.ann.sixth.factorymethod.creators.OneTypeWatchMaker;
import ua.tania.ann.sixth.factorymethod.creators.TwoTypeWatchMaker;
import ua.tania.ann.sixth.factorymethod.creators.WatchMaker;
import ua.tania.ann.sixth.factorymethod.products.Watch;

/**
 * Created by Таня on 06.08.2018.
 */
public class WatchCreation {
    public static void main(String[] args) {
        WatchMaker watchMaker = getMakerByName("OneType");
        Watch watch = watchMaker.createWatch();
        watch.info();

    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("OneType"))
            return new OneTypeWatchMaker();
        else if (maker.equals("TwoType"))
            return new TwoTypeWatchMaker();
        throw new RuntimeException();
    }
}
