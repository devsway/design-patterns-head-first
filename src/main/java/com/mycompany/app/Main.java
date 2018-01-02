package com.mycompany.app;

/**
 * IDEでrunする場合このクラスをmainクラスに設定する
 */

public class Main {
    static public void main(String arg[]) {
        //System.out.println("Hello new year !!!");
        /**
         * MallardDuckは飛ぶ振る舞いをコンストラクタで設定しているので飛ぶ。
         */
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.desplay();

        /**
         *コンストラクタを渡さない場合。
         */
        WrongDuck wrongDuck = new WrongDuck();
        //wrongDuck.performFly();//エラーになる

        /**
         * 気象情報
         */
        WeatherData weatherData = new WeatherData();
        //オブサーバーへの登録をします
        new CurrentConditionDisplay(weatherData);
        //値を登録してupdateしてnotifyします。値はテスト
        weatherData.setMeasurements(10,20,30);
        weatherData.setMeasurements(100,43,343);
        weatherData.setMeasurements(10,23,234);


    }
}