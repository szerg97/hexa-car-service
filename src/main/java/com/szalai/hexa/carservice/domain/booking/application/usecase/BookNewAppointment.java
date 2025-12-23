package com.szalai.hexa.carservice.domain.booking.application.usecase;

import com.szalai.hexa.carservice.domain.booking.infrastructure.rest.NewAppointmentRequest;

public interface BookNewAppointment {
    void handle(NewAppointmentRequest request);
}
