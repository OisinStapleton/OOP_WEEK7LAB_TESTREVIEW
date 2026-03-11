package ie.atu.week7solution.service;

import ie.atu.week7solution.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ReservationService {

    public Reservation addReservation(@Valid @RequestBody Reservation reservation) {
        return reservation;
    }
}
