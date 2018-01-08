package com.mycompany.app;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }

    /**
     * ファクトリメソッド！
     * 各店舗で実装する(=製品に対する知識はサブクラスで"決定”される)
     * protected abstractが肝!!!!!!!!!!!!(抽象でない場合もある)
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
