package com.szalai.hexa.carservice.domain.booking.core.service;

import com.szalai.hexa.carservice.domain.booking.core.model.Booking;
import com.szalai.hexa.carservice.domain.booking.core.model.Car;
import com.szalai.hexa.carservice.domain.booking.core.model.Driver;
import com.szalai.hexa.carservice.domain.booking.infrastructure.rest.NewAppointmentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookingFacade {

    private final BookingRepository bookingRepository;

    public void handle(NewAppointmentRequest request) {
        List<Booking> bookings = bookingRepository.findAll();

        Driver driver = getDriver(request, bookings);

        bookingRepository.save(
                new Booking(UUID.randomUUID().toString(),
                    new Car(UUID.randomUUID().toString(), driver, request.plateNumber()),
                request.at()));
    }

    private static Driver getDriver(NewAppointmentRequest request, List<Booking> bookings) {
        Optional<Car> optionalCar = bookings.stream().map(Booking::getCar).filter(car -> car.getPlateNumber().equals(request.plateNumber())).findFirst();

        if(optionalCar.isPresent()) throw new IllegalArgumentException("Car already booked");

        return bookings.stream().map(booking -> booking.getCar().getDriver())
                .filter(d -> d.getName().equals(request.driver()))
                .findFirst().orElse(
                        new Driver(UUID.randomUUID().toString(), request.driver()));
    }
}
