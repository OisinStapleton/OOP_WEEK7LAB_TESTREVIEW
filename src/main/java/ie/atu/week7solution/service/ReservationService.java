package ie.atu.week7solution.service;

import ie.atu.week7solution.exception.ReservationConflictException;
import ie.atu.week7solution.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private List<Reservation> reservations =  new ArrayList<>();
    private long nextID = 1;

    public Reservation addReservation(Reservation reservation) {

        //Assign ID
        reservation.setReservationId(nextID++);

        //Check time conflicts
        for(Reservation existingReservation : reservations) {

            //same equipment & same date
            if existing.getEquipmentTag().equals(reservation.getEquipmentTag()) &&
                    existingReservation.getReservationDate().equals(reservation.getReservationDate())

            int existingStart = existing.getStartHour();
            int existingEnd = existying.EndHour();

            int newStart = reservation.getStartHour();
            int newEnd = reservation.getDurationHours();

            //Overlap Check

            if (existingStart < newEnd && newStart <= existingEnd) {

                //RemoveID
                reservation.setReservationDate(nextId--);
                throw new ReservationConflictException("Time slot already booked");
            }
        }
        }
    reservations.add(reservation);
    return reservation
}
