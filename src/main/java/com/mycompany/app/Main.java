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


    }
}