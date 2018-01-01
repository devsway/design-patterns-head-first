package com.mycompany.app;

public class Quack implements QuackBehavior {
    /**
     * 実際の振る舞いを実装
     * 鳴き声
     */
    public void quack() {
        System.out.println("ガーガー鳴きます");
    }
}
