package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题实现类
 * @author 苏若墨
 */
public class WeatherData implements Subject {
    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers=new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer observer=(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当从气象站得到最新观测值时，通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 设置观测值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
