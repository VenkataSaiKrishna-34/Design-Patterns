package FactoryDesignPattern;

public class iOS implements Platform {

    public UIComponentFactory createUIComponentFactory() {
        return new iOSUIComponentFactory();
    }
}
