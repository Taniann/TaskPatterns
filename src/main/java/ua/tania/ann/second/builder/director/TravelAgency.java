package ua.tania.ann.second.builder.director;

import ua.tania.ann.second.builder.auxiliary.Flight;
import ua.tania.ann.second.builder.auxiliary.HotelReservation;
import ua.tania.ann.second.builder.auxiliary.Insurance;
import ua.tania.ann.second.builder.auxiliary.Transfer;
import ua.tania.ann.second.builder.builder.TourBuilder;
import ua.tania.ann.second.builder.product.Tour;

/**
 * Created by Таня on 06.08.2018.
 */
public class TravelAgency {
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
