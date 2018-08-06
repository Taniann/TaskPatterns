package ua.tania.ann.second.builder.product;

import ua.tania.ann.second.builder.auxiliary.Flight;
import ua.tania.ann.second.builder.auxiliary.HotelReservation;
import ua.tania.ann.second.builder.auxiliary.Insurance;
import ua.tania.ann.second.builder.auxiliary.Transfer;

/**
 * Created by Таня on 06.08.2018.
 */
public class Tour {
    private Transfer transfer;
    private Flight flight;
    private HotelReservation hotelReservation;
    private Insurance insurance;

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public HotelReservation getHotelReservation() {
        return hotelReservation;
    }

    public void setHotelReservation(HotelReservation hotelReservation) {
        this.hotelReservation = hotelReservation;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transfer=" + transfer.isNeed() +
                ", flight=" + flight.isNeed() +
                ", hotelReservation=" + hotelReservation.isNeed() +
                ", insurance=" + insurance.isNeed() +
                '}';
    }
}
