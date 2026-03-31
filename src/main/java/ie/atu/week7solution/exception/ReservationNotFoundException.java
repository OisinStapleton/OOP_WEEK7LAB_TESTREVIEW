package ie.atu.week7solution.exception;

public class ReservationNotFoundException extends RuntimeException {

    public ReservationNotFoundException(String reservationNotFound)
    {
        super(reservationNotFound);
    }
}
