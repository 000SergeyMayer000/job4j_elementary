package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        int deleteItemId = input.askInt("Enter ID: ");
        if (tracker.delete(deleteItemId)) {
            System.out.println("item is delete");
        } else {
            System.out.println("item not delete");
        }
        return true;
    }
}
