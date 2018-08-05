package ua.tania.ann.second.usingbuilder.director;

import ua.tania.ann.second.usingbuilder.auxiliary.Flight;
import ua.tania.ann.second.usingbuilder.auxiliary.HotelReservation;
import ua.tania.ann.second.usingbuilder.auxiliary.Insurance;
import ua.tania.ann.second.usingbuilder.auxiliary.Transfer;
import ua.tania.ann.second.usingbuilder.builder.TourBuilder;
import ua.tania.ann.second.usingbuilder.product.Tour;

/**
 * Created by Таня on 06.08.2018.
 */
public class CreationTour {
    public Tour createTour(TourBuilder tourBuilder, Transfer transfer, Flight flight,
                           HotelReservation hotelReservation, Insurance insurance) {
        tourBuilder.buildTour();
        tourBuilder.buildTransfer(transfer);
        tourBuilder.buidFlight(flight);
        tourBuilder.buildHotelReservation(hotelReservation);
        tourBuilder.buildInsurance(insurance);
        return tourBuilder.getTour();
    }
}
