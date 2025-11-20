package DecoratorDesignPattern;

public class Latte implements Coffee {

    @Override
    public String getDescription() {
        return "Latte Coffee";
    }

    @Override
    public Double getCost() {
        return 65.0;
    }
}
