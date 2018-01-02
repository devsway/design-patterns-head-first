package com.mycompany.app;

import java.util.ArrayList;

/**
 * 気象観測所
 */
public class WeatherData implements Subject {

    //オブサーバーによって変化するarrayList
    private ArrayList observers;

    //気象の観測の値
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * インスタンスでオブサーバーをセットできるようにする
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    /**
     * 各オブサーバーの管理下にあるオブジェクトをupdateする
     */
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 気象観測所から更新されるたびに呼び出されます。
     * 通知を送ります
     */
    public void measurementsChanged() {
        notifyObserver();
    }

    /**
     * 値をセットして更新を行います
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
