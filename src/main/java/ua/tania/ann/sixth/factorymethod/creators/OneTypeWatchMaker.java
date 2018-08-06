package ua.tania.ann.sixth.factorymethod.creators;

import ua.tania.ann.sixth.factorymethod.products.OneTypeWatch;
import ua.tania.ann.sixth.factorymethod.products.Watch;

/**
 * Created by Таня on 06.08.2018.
 */
public class OneTypeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new OneTypeWatch();
    }
}
