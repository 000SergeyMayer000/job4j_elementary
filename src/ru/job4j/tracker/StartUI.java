package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] allItems = tracker.findAll();
                for (Item allItem : allItems) {
                    System.out.println(allItem);
                }
            } else if (select == 2) {
                System.out.println("=== Replace Item ====");
                int idRaplace = input.askInt("Enter ID: ");
                String newName = input.askStr("Enter new name: ");
                Item replaceItem = new Item(newName);
                if (tracker.replace(idRaplace, replaceItem)) {
                    System.out.println("item is replaced");
                } else {
                    System.out.println("item not replaced");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                int deleteItemId = input.askInt("Enter ID: ");
                if (tracker.delete(deleteItemId)) {
                    System.out.println("item is delete");
                } else {
                    System.out.println("item not delete");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println(tracker.findById(input.askInt("Enter ID: ")));
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] result = tracker.findByName(name);
                for (Item item : result) {
                    System.out.println(item);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item\n" +
                "1. Show all items\n" +
                "2. Edit item\n" +
                "3. Delete item\n" +
                "4. Find item by Id\n" +
                "5. Find items by name\n" +
                "6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}