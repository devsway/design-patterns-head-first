package com.mycompany.app;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    /**
     * モカには必ずそのトッピングを施す飲み物が必要。
     *
     * @param beverage
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }


    public String getDescription() {
        return beverage.getDescription() + "_ソイ";
    }

    /**
     * 飲み物+ソイの計算を行う
     *
     * @return
     */
    public double cost() {
        return .200 + beverage.cost();
    }
}
