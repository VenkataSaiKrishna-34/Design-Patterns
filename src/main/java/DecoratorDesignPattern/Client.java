package DecoratorDesignPattern;

import DecoratorDesignPattern.AddOns.CreamDecorator;
import DecoratorDesignPattern.AddOns.SugarDecorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new Americano();
        coffee = new CreamDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Description = " + coffee.getDescription());
        System.out.println("Cost = " + coffee.getCost());
    }
}
