package com.mycompany.app;

public class NYPizzaStore extends PizzaStore {

    /**
     * どのような注文がされたらどのようなPizzaをつくるかを実装する
     *
     * @param olderContent
     * @return
     */
    protected Pizza createPizza(String olderContent) {
        if (olderContent.equals("チーズ")) {
            return new NYStyleCheesePizza();
        } else if (olderContent.equals("野菜")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
