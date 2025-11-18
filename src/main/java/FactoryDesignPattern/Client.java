package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Dropdown.Dropndown;
import FactoryDesignPattern.Components.Menu.Menu;

import java.util.Objects;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter a Platform = ");
        String platformName = scanner.nextLine();

        Platform platformInstance = PlatformFactory.createPlatformInstance(platformName);

        UIComponentFactory uiComponentFactory = platformInstance.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        button.click();

        Dropndown dropndown = uiComponentFactory.createDropdown();
        dropndown.showOptions();

        Menu menu = uiComponentFactory.createMenu();
        menu.showMenu();
    }
}
