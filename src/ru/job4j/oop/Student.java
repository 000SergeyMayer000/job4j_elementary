package ru.job4j.oop;

public class Student {

    public  void music() {
        System.out.println("Тра та та!");
    }

    public void song(String name) {
        System.out.println("I can sign a song: " + name);
    }

    public static void main(String[] args) {
        Student petja = new Student();
        petja.music();
        petja.song("Кузнечик");
    }
}
