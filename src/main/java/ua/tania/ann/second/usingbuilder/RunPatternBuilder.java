package ua.tania.ann.second.usingbuilder;

import ua.tania.ann.second.usingbuilder.auxiliary.Flight;
import ua.tania.ann.second.usingbuilder.auxiliary.HotelReservation;
import ua.tania.ann.second.usingbuilder.auxiliary.Insurance;
import ua.tania.ann.second.usingbuilder.auxiliary.Transfer;
import ua.tania.ann.second.usingbuilder.builder.TourBuilder;
import ua.tania.ann.second.usingbuilder.director.TravelAgency;
import ua.tania.ann.second.usingbuilder.product.Tour;

/**
 * Created by Таня on 06.08.2018.
 */
public class RunPatternBuilder {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency();
        TourBuilder tourBuilder = new TourBuilder();

        Transfer transfer = new Transfer();
        transfer.setNeed(true);

        Flight flight = new Flight();
        flight.setNeed(true);

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.setNeed(false);

        Insurance insurance = new Insurance();
        insurance.setNeed(true);

        Tour firstTour = travelAgency.createTour(tourBuilder, transfer, flight, hotelReservation, insurance);
        System.out.println(firstTour);
    }
}
