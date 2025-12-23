package com.szalai.hexa.carservice.domain.booking.application.usecase;

import com.szalai.hexa.carservice.domain.booking.core.service.BookingFacade;
import com.szalai.hexa.carservice.domain.booking.infrastructure.rest.NewAppointmentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookNewAppointmentImpl implements BookNewAppointment {

    private final BookingFacade bookingFacade;

    @Override
    public void handle(NewAppointmentRequest request) {

    }
}
