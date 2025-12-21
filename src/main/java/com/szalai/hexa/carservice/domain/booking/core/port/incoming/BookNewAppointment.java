package com.szalai.hexa.carservice.domain.booking.core.port.incoming;

import com.szalai.hexa.carservice.domain.booking.core.model.NewAppointmentRequest;

public interface BookNewAppointment {
    void handle(NewAppointmentRequest request);
}
