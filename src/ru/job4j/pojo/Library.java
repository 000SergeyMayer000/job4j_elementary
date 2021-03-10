package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 379);
        Book book2 = new Book("Чипалино", 186);
        Book book3 = new Book("Как стать богатым?", 15);
        Book book4 = new Book("1984", 289);
        Book[] lib = new Book[]{book1, book2, book3, book4};
        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getSize());
        }
        Book tmp = null;
        tmp = lib[0];
        lib[0] = lib[3];
        lib[3] = tmp;

        for (int i = 0; i < lib.length; i++) {
            System.out.println(lib[i].getName() + " - " + lib[i].getSize());
        }

        for (int i = 0; i < lib.length; i++) {
            if (lib[i].getName().equals("Clean code")) {
                System.out.println("Есть такая книга - " + lib[i].getName() + " - " + lib[i].getSize());
            }
        }
    }
}
