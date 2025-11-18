package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropndown;
import FactoryDesignPattern.Components.Menu.Menu;

public interface UIComponentFactory {

    public Button createButton();

    public Dropndown createDropdown();

    public Menu createMenu();
}
