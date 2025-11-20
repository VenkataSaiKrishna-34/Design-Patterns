package DecoratorDesignPattern.AddOns;

import DecoratorDesignPattern.Coffee;

public class CreamDecorator extends AddOn {

    public CreamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Extra Cream";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 15.0;
    }
}
