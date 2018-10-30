package com.danner.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelsiusResponseTest {
    @Test
    void getFahrenheitToCelsiusResult() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitTemperature = BigDecimal.valueOf(212);
        BigDecimal result = service.fahrenheitToCelsius(fahrenheitTemperature);
        assertEquals(BigDecimal.valueOf(100), result);
    }

}