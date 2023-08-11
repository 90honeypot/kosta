package HW.Warehouse;

import java.util.Scanner;

import HW.Shop.Menu;

public class TestMain {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run(new Scanner(System.in));

    }
}
