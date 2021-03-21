package ru.job4j.ex;

public class Fact {

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println(Fact.calc(-4));
    }

    public static int calc(int n) throws IllegalArgumentException {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Число меньше нуля");
        }
        for (int i = 1; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }
}