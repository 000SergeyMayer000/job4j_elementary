package ru.job4j;

import ru.job4j.tracker.StubOutput;

public class Main {

    int a = 10;
    String str = "Строка";

    public  String foo(String str) {

        return this.str;
    }

    public static void main(String[] args) {
       // System.out.println(foo("Строка м методе"));
     //   System.out.println(this.a);
    }
}