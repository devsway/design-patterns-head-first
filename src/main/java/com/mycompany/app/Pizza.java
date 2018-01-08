package com.mycompany.app;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println(name + "を処理");
        System.out.println("生地をこねる");
        System.out.println("ソースを追加。。");
        System.out.println("トッピングを追加");

        //何をトッピングするかを表示
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("350度で25分間焼く");
    }

    void cut() {
        System.out.println("ピザを形式に切り分ける");
    }

    void box() {
        System.out.println("PizzaStoreの正式な箱にピザを入れる");
    }

    public String getName() {
        return name;
    }
}
