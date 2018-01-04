package com.mycompany.app;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    /**
     * モカには必ずそのトッピングを施す飲み物が必要。
     *
     * @param beverage
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "_モカ";
    }

    /**
     * 飲み物+モカの計算を行う
     *
     * @return
     */
    public double cost() {
        return .100 + beverage.cost();
    }
}
