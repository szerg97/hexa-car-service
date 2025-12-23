package com.szalai.hexa.carservice.domain.booking.core.service;

import com.szalai.hexa.carservice.domain.booking.core.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingRepository {
    void save(Booking booking);
    List<Booking> findAll();
    Optional<Booking> findById();
}
