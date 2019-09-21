package observer;

/**测试类
 * @author 苏若墨
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay=new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        //设置预设值，通知各观察者
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,56,20.4f);
    }
}
