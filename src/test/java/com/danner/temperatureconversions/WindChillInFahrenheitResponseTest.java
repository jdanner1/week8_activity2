package com.danner.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WindChillInFahrenheitResponseTest {
    @Test
    void getWindChillInFahrenheitResult() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal temperature = BigDecimal.valueOf(20);
        BigDecimal windSpeed = BigDecimal.valueOf(12);
        BigDecimal result = service.windChillInFahrenheit(temperature, windSpeed);

        assertEquals(BigDecimal.valueOf(-1.77111994), result);
    }

}