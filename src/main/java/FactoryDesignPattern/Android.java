package FactoryDesignPattern;

public class Android implements Platform {

    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
