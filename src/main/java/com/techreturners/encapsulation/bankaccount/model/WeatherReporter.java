package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String weatherReportMessage() {

        double fahrenheitTemperature = (9.0 / 5.0) * temperature + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), fahrenheitTemperature);

    }

    public String checkLocation() {
        if (location == "London") {

            return "🌦";

        } else if (location == "California") {

            return "🌅";

        } else if (location == "Cape Town") {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > 30) {

            return "It's too hot 🥵!";

        } else if (temperature < 10) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
