package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] array, int ell) {
        int rsl = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ell) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
            }
        }
        return rst;
    }


}


