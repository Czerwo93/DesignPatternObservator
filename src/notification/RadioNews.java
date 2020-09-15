package notification;

import order.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("RadioNews - nowa prognoza pogody: temperatura:" +  weatherForecast.getTemperature() + "stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
