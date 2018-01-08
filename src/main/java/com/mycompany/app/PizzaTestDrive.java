package com.mycompany.app;

public class PizzaTestDrive {
    static public void main(String[] args){
        /**
         * まずお店を作成します。
         */
        PizzaStore NY = new NYPizzaStore();


        /**
         * そしてそのお店でオーダーしてみます。
         */
        Pizza pizza = NY.orderPizza("チーズ");
        //ifチーズで注文したら、、
        System.out.println("出てくるピザは"+pizza.getName());
    }
}
