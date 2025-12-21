package com.szalai.hexa.carservice.domain.booking.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Driver implements Entity{
    private final String id;
    private final String name;
}
