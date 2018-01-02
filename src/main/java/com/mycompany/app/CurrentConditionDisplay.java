package com.mycompany.app;

/**
 * 実際に表示する機器オブジェクト
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * weatherデータを登録します。
     *
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData){
        //this.weatherData = weatherData;//この例では使いません。
        weatherData.registerObserver(this);
    }

    /**
     * オブサーバーからupdateの命令を受け取って行う処理の実装
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        //updateするたびにdisplayに移す(更新する)
        this.display();
    }

    public void display() {
        System.out.println("現在の気象状況:温度" + temperature + "湿度" + humidity + "%");
    }

}
