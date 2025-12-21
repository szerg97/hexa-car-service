package com.szalai.hexa.carservice.domain.booking.application;

import com.szalai.hexa.carservice.domain.booking.core.model.NewAppointmentRequest;
import com.szalai.hexa.carservice.domain.booking.core.port.incoming.BookNewAppointment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingDomainController {

    private final BookNewAppointment bookNewAppointment;

    @PostMapping
    public ResponseEntity<String> bookNewAppointment(@RequestBody NewAppointmentRequest request) {
        bookNewAppointment.handle(request);
        return ResponseEntity.status(CREATED).body("Appointment booked successfully");
    }
}
