package ru.job4j.oop;

public class Bug {
    private  String desc;
    private String name;

    public Bug(String text) {
        this.desc = text;
    }

    public static void main(String[] args) {
        String issue = "Fix me ASAP.";
        Bug item = new Bug(issue);
        System.out.println(item.desc);
    }
}