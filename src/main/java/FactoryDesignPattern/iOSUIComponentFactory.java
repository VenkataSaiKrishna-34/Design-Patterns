package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.iOSButton;
import FactoryDesignPattern.Components.Dropdown.Dropndown;
import FactoryDesignPattern.Components.Dropdown.iOSDropdown;
import FactoryDesignPattern.Components.Menu.Menu;
import FactoryDesignPattern.Components.Menu.iOSMenu;

public class iOSUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new iOSButton();
    }

    public Dropndown createDropdown() {
        return new iOSDropdown();
    }

    public Menu createMenu() {
        return new iOSMenu();
    }
}
