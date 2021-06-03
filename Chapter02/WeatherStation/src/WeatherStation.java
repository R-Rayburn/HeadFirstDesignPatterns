public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // State updates
        weatherData.setMeasurements(80, 65, 30.4f);

        // New observer is introduced
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // State updates again
        weatherData.setMeasurements(82, 70, 29.2f);

        // Heat Index and Forecast displays no longer care about state.
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.removeObserver(forecastDisplay);

        // State updates yet again
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
