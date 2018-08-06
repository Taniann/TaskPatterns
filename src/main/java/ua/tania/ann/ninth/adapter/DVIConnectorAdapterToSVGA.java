package ua.tania.ann.ninth.adapter;

/**
 * Created by Таня on 06.08.2018.
 */
public class DVIConnectorAdapterToSVGA extends SVGAConnector implements DVIConnector {
    public void connectDVI() {
        super.connectSVGA();
    }
}
