package com.techreturners.encapsulation.bankaccount.test;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherReporterTest {
    private WeatherReporter weatherReporterLondon;
    private WeatherReporter weatherReporterCalifornia;
    private WeatherReporter weatherReporterCapeTown;
    private WeatherReporter weatherReporterSeoul;

    @BeforeEach
    public void initEach() {
        weatherReporterLondon = new WeatherReporter("London", 15);
        weatherReporterCalifornia = new WeatherReporter("California", 25);
        weatherReporterCapeTown = new WeatherReporter("Cape Town", 20);
        weatherReporterSeoul = new WeatherReporter("Seoul", 35);
    }

    @Test
    public void getFahrenheitTemperatureTest() {
        // arrange
        double expectedFTemperatureLondon = (9.0d / 5.0d) * 15d + 32d;
        double expectedFTemperatureCalifornia = (9.0d / 5.0d) * 25d + 32d;
        double expectedFTemperatureCapeTown = (9.0d / 5.0d) * 20d + 32d;
        double expectedFTemperatureSeoul = (9.0d / 5.0d) * 35d + 32d;

        // act
        double actualFTemperatureLondon = weatherReporterLondon.getFahrenheitTemperature(15);
        double actualFTemperatureCalifornia = weatherReporterCalifornia.getFahrenheitTemperature(25);
        double actualFTemperatureCapeTown = weatherReporterCapeTown.getFahrenheitTemperature(20);
        double actualFTemperatureSeoul = weatherReporterSeoul.getFahrenheitTemperature(35);

        // assert
        Assertions.assertEquals(expectedFTemperatureLondon, actualFTemperatureLondon);
        Assertions.assertEquals(expectedFTemperatureCalifornia, actualFTemperatureCalifornia);
        Assertions.assertEquals(expectedFTemperatureCapeTown, actualFTemperatureCapeTown);
        Assertions.assertEquals(expectedFTemperatureSeoul, actualFTemperatureSeoul);
    }

    @Test
    public void getWeatherEmojiByLocationTest() {
        // arrange
        String expectedWeatherEmojiLondon = "🌦";
        String expectedWeatherEmojiCalifornia = "🌅";
        String expectedWeatherEmojiCapeTown = "🌤";
        String expectedWeatherEmojiSeoul = "🔆";

        // act
        String actualWeatherEmojiLondon = weatherReporterLondon.getWeatherEmojiByLocation();
        String actualWeatherEmojiCalifornia = weatherReporterCalifornia.getWeatherEmojiByLocation();
        String actualWeatherEmojiCapeTown = weatherReporterCapeTown.getWeatherEmojiByLocation();
        String actualWeatherEmojiSeoul = weatherReporterSeoul.getWeatherEmojiByLocation();

        // assert
        Assertions.assertEquals(expectedWeatherEmojiLondon, actualWeatherEmojiLondon);
        Assertions.assertEquals(expectedWeatherEmojiCalifornia, actualWeatherEmojiCalifornia);
        Assertions.assertEquals(expectedWeatherEmojiCapeTown, actualWeatherEmojiCapeTown);
        Assertions.assertEquals(expectedWeatherEmojiSeoul, actualWeatherEmojiSeoul);
    }

    @Test
    public void getMessageByTemperatureTest() {
        // arrange
        String expectedMessage = "Ahhh...it's just right 😊!";

        // act
        String actualMessage = weatherReporterLondon.getMessageByTemperature();

        // assert
        Assertions.assertEquals(expectedMessage, actualMessage);
    }


}
