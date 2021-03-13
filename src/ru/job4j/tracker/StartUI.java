package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] allItems = tracker.findAll();
                for (Item allItem : allItems) {
                    System.out.println(allItem);
                }
            } else if (select == 2) {
                System.out.println("=== Replace Item ====");
                System.out.print("Enter ID: ");
                int idRaplace = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter new name: ");
                String newName = scanner.nextLine();
                Item replaceItem = new Item(newName);
                if (tracker.replace(idRaplace, replaceItem)) {
                    System.out.println("item is replaced");
                } else {
                    System.out.println("item not replaced");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter ID: ");
                int deleteItemId = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(deleteItemId)) {
                    System.out.println("item is delete");
                } else {
                    System.out.println("item not delete");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter ID: ");
                System.out.println(tracker.findById(Integer.parseInt(scanner.nextLine())));
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}