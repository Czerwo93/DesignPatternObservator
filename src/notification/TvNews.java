package notification;

import order.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TvNews - nowa prognoza pogody: temperatura:" +  weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
