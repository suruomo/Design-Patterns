package observer;

/**
 * 展示明天天气预报观察者
 * @author 苏若墨
 */
public class ForecastDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private  float pressure;
    private  Subject weatherData;
    public ForecastDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast Tomorrow :{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
