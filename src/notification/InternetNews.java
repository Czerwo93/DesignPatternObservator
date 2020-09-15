package notification;

import order.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("InternetNews - nowa prognoza pogody: temperatura:" +  weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
