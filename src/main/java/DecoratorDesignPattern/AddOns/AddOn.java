package DecoratorDesignPattern.AddOns;

import DecoratorDesignPattern.Coffee;

public abstract class AddOn implements Coffee {
    private Coffee coffee = null;

    public AddOn(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public Double getCost() {
        return coffee.getCost();
    }
}
