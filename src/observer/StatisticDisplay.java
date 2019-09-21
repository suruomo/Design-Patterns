package observer;

/**
 * 展示统计数据观察者
 * @author 苏若墨
 */
public class StatisticDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private  float pressure;
    private  Subject weatherData;
    public StatisticDisplay(Subject weatherData) {
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
        System.out.println("Statistic Condition :{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
