package ru.job4j.condition;

public class Max {

    public static int max(int a, int b) {
        return a > b ? a : b;
    }


    public static int max(int a, int b, int c) {
        int res = Max.max(b, c);
        return a > res ? a : res;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 9, -88));
    }
}