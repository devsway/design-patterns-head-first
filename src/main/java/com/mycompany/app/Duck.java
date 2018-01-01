package com.mycompany.app;

public abstract class Duck {

    /**
     * 各DuckクラスはQuackBehavior等振る舞いインターフェイスを実装した何かへの参照を持ちます。
     * 何らかの形で振る舞いオブジェクトを渡します。
     */
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        /**
         * 振る舞い自体を実装する、、わけではない。
         * その振る舞いをquackBehaviorオブジェクトに委譲する。
         */
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    abstract void display();

}
