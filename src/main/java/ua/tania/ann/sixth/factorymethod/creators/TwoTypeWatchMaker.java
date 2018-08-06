package ua.tania.ann.sixth.factorymethod.creators;

import ua.tania.ann.sixth.factorymethod.products.TwoTypeWatch;
import ua.tania.ann.sixth.factorymethod.products.Watch;

/**
 * Created by Таня on 06.08.2018.
 */
public class TwoTypeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new TwoTypeWatch();
    }
}
