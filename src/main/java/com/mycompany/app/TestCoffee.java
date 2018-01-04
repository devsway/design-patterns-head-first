package com.mycompany.app;

/**
 * コーヒー注文テストプログラム
 */
public class TestCoffee {

    public static void main(String args[]) {
        /**
         * トッピングのないエスプレッソを注文してその料金を出力します
         */
        Beverage beverage = new HouseBlend();
        System.out.printf(beverage.getDescription() + "_コスト_" + beverage.cost());

        /**
         * トッピングを付ける場合
         */
        Beverage my_houseBlend = new HouseBlend();
        my_houseBlend = new Mocha(my_houseBlend);
        my_houseBlend = new Soy(my_houseBlend);

        System.out.println(my_houseBlend.getDescription() + "_コスト_" + my_houseBlend.cost());


    }

}
