package com.szalai.hexa.carservice.domain.booking.core.model;

import java.time.LocalDateTime;

public record NewAppointmentRequest(String plateNumber, String driver, LocalDateTime at) {
}
