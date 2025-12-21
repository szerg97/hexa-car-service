package com.szalai.hexa.carservice.domain.booking.core.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Booking implements Entity{
    private final String id;
    private final Car car;
    private final LocalDateTime appointment;
    private boolean isConfirmed = false;
    private boolean isCancelled = false;

    public Booking(String id, Car car, LocalDateTime appointment) {
        this.id = id;
        this.car = car;
        this.appointment = appointment;
    }
}
