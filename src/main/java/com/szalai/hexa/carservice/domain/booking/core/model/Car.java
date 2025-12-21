package com.szalai.hexa.carservice.domain.booking.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car implements Entity{
    private final String id;
    private final Driver driver;
    private final String plateNumber;
}
