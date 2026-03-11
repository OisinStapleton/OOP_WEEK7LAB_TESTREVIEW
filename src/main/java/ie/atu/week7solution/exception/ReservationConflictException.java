package ie.atu.week7solution.exception;

public class ReservationConflictException extends RuntimeException {
    public ReservationConflictException(String timeSlotAlreadyBooked) {
    }
}
