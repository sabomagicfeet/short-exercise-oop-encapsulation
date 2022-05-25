package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    private final String WEATHER_EMOJI_LONDON = "🌦";
    private final String WEATHER_EMOJI_CALIFORNIA = "🌅";
    private final String WEATHER_EMOJI_CAPETOWN = "🌤";
    private final String WEATHER_EMOJI_OTHERS = "🔆";

    private final String WEATHER_MESSAGE_OVER30 = "It's too hot 🥵!";
    private final String WEATHER_MESSAGE_UNDER10 = "It's too cold 🥶!";
    private final String WEATHER_MESSAGE_BETWEEN30AND10 = "Ahhh...it's just right 😊!";

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getWeatherReportMessage() {

        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location,
                getWeatherEmojiByLocation(),
                getMessageByTemperature(),
                getFahrenheitTemperature(temperature)
        );

    }

    public double getFahrenheitTemperature(double temperature) {
        return (9.0d / 5.0d) * temperature + 32d;
    }

    public String getWeatherEmojiByLocation() {
        if (location == "London") {

            return WEATHER_EMOJI_LONDON;

        } else if (location == "California") {

            return WEATHER_EMOJI_CALIFORNIA;

        } else if (location == "Cape Town") {

            return WEATHER_EMOJI_CAPETOWN;

        }
        return WEATHER_EMOJI_OTHERS;
    }

    public String getMessageByTemperature() {
        if (temperature > 30) {

            return WEATHER_MESSAGE_OVER30;

        } else if (temperature < 10) {

            return WEATHER_MESSAGE_UNDER10;

        }
        return WEATHER_MESSAGE_BETWEEN30AND10;
    }

}
