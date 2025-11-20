package DecoratorDesignPattern.AddOns;

import DecoratorDesignPattern.Coffee;

public class SugarDecorator extends AddOn {

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Extra Sugar";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 5.0;
    }
}
