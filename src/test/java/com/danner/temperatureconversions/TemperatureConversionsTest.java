package com.danner.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    void getTemperatureConversionsSoap121() {
    }

}