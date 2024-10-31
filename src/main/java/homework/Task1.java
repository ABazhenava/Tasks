package homework;

import java.util.Random;

public class Task1 {

//    Циклический сдвиг элементов массива
//    Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
//    циклического сдвига элементов массива на K позиций вправо. Элементы, выходящие
//    за пределы массива, должны перемещаться в начало.

    public static void main(String[] args) {
        int K = 2;
        int n = 10;
        int[] mas = new int[n];
        init(mas);
        print(mas);
        mas = slidingRight(mas, K);
        printNewArray(mas);
    }
    public static void init(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20);
        }
    }

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static int[] slidingRight(int[] array, int K) {
        int n = array.length;
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[(i + K) % n] = array[i];
        }
        return newArray;
    }

    public static void printNewArray(int[] mas) {
        for (int x : mas) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}


