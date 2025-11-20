package DecoratorDesignPattern;

public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino Coffee";
    }

    @Override
    public Double getCost() {
        return 80.0;
    }
}
