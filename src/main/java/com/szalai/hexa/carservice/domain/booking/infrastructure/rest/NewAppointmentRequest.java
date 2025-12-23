package com.szalai.hexa.carservice.domain.booking.infrastructure.rest;

import java.time.LocalDateTime;

public record NewAppointmentRequest(String plateNumber, String driver, LocalDateTime at) {
}
