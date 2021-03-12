package ru.job4j.io;


import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Привет, как Вас зовут?");
        String name = scaner.nextLine();
        System.out.println(name + ", что нового?");
    }
}
