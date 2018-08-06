package ua.tania.ann.second.builder;

import ua.tania.ann.second.builder.auxiliary.Flight;
import ua.tania.ann.second.builder.auxiliary.HotelReservation;
import ua.tania.ann.second.builder.auxiliary.Insurance;
import ua.tania.ann.second.builder.auxiliary.Transfer;
import ua.tania.ann.second.builder.builder.TourBuilder;
import ua.tania.ann.second.builder.director.TravelAgency;
import ua.tania.ann.second.builder.product.Tour;

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
