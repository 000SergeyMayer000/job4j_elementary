package ru.job4j.ex;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(del(0));
        } catch (ArithmeticException e) {
            System.out.println("Делит на ноль нельзя");
        }

    }

    public static int del(int n)  {
        return 10 / n;
    }
}
