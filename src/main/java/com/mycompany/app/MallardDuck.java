package com.mycompany.app;

public class MallardDuck extends Duck{

    /**
     * コンストラクタで振る舞いのオブジェクトを取得します
     */
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void desplay(){
        System.out.println("本物のマガモだよ！");
    }

    @Override
    void display() {
        System.out.println("これはMallardDuckです。");
    }
}
