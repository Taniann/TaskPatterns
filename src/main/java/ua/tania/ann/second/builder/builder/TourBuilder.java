package ua.tania.ann.second.builder.builder;

import ua.tania.ann.second.builder.auxiliary.Flight;
import ua.tania.ann.second.builder.auxiliary.HotelReservation;
import ua.tania.ann.second.builder.auxiliary.Insurance;
import ua.tania.ann.second.builder.auxiliary.Transfer;
import ua.tania.ann.second.builder.product.Tour;

/**
 * Created by Таня on 06.08.2018.
 */
public class TourBuilder {
    private Tour tour;

    public void buildTour() {
        tour = new Tour();
    }

    public void buildTransfer(Transfer transfer) {
        tour.setTransfer(transfer);
    }

    public void buidFlight(Flight flight) {
        tour.setFlight(flight);
    }

    public void buildHotelReservation(HotelReservation hotelReservation) {
        tour.setHotelReservation(hotelReservation);
    }

    public void buildInsurance(Insurance insurance) {
        tour.setInsurance(insurance);
    }

    public Tour getTour() {
        return tour;
    }
}
