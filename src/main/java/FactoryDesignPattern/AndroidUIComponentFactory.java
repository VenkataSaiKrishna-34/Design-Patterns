package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.AndroidButton;
import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.AndroidDropdown;
import FactoryDesignPattern.Components.Dropdown.Dropndown;
import FactoryDesignPattern.Components.Menu.AndroidMenu;
import FactoryDesignPattern.Components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    public Button createButton() {
        return new AndroidButton();
    }

    public Dropndown createDropdown() {
        return new AndroidDropdown();
    }

    public Menu createMenu() {
        return new AndroidMenu();
    }
}
