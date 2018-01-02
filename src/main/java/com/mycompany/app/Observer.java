package com.mycompany.app;

/**
 * 全てのオブサーバーが実装する。
 * 測定値をオブサーバーに渡します。
 */
public interface Observer {
    /**
     *オブサーバーは必ずupdate処理を行う
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
