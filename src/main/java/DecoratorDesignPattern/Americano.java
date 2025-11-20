package DecoratorDesignPattern;

public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Americano Coffee";
    }

    @Override
    public Double getCost() {
        return 70.0;
    }
}
