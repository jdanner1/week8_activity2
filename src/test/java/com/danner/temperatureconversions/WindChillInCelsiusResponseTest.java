package com.danner.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WindChillInCelsiusResponseTest {
    @Test
    void getWindChillInCelsiusResult() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal temperature = BigDecimal.valueOf(0);
        BigDecimal windSpeed = BigDecimal.valueOf(15);
        BigDecimal result = service.windChillInCelsius(temperature, windSpeed);
        assertEquals(BigDecimal.valueOf(-13.23), result);
    }

}