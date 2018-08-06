package ua.tania.ann.ninth.adapter;

/**
 * Created by Таня on 06.08.2018.
 */
public class RunAdapter {
    public static void main(String[] args) {
        DVIConnector dviConnector = new DVIConnectorAdapterToSVGA();
        dviConnector.connectDVI();
    }
}
