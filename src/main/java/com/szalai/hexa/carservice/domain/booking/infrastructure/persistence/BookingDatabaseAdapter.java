package com.szalai.hexa.carservice.domain.booking.infrastructure.persistence;

import com.szalai.hexa.carservice.domain.booking.core.model.Booking;
import com.szalai.hexa.carservice.domain.booking.core.model.Car;
import com.szalai.hexa.carservice.domain.booking.core.model.Driver;
import com.szalai.hexa.carservice.domain.booking.core.service.BookingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingDatabaseAdapter implements BookingRepository {

    private final List<Booking> bookings = new ArrayList<>();

    {
        Driver andy = new Driver("d1", "Andy");
        Driver bill = new Driver("d2", "Bill");

        Car carAndy1 = new Car("c1", andy, "ASD123");
        Car carAndy2 = new Car("c2", andy, "ERT456");
        Car carBill = new Car("c3", bill, "FGH789");

        save(new Booking("b1", carAndy1, LocalDateTime.now()));
        save(new Booking("b2", carAndy2, LocalDateTime.now()));
        save(new Booking("b3", carBill, LocalDateTime.now()));
    }

    @Override
    public void save(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public List<Booking> findAll() {
        return bookings;
    }

    @Override
    public Optional<Booking> findById() {
        return bookings.stream().findFirst();
    }
}
