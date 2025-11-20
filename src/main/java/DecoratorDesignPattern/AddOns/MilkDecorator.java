package DecoratorDesignPattern.AddOns;

import DecoratorDesignPattern.Coffee;

public class MilkDecorator extends AddOn {

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Extra Milk";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 10.0;
    }
}
