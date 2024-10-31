package homework;

import java.util.Random;

public class Task4 {
//    Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива
//   без использования встроенных функций сортировки.
   public static void main(String[] args) {
  //     int[] mas = {12, 35, 1, 10, 34, 1};
       int n = 5;
       int[] mas = new int[n];
       init(mas);
       print(mas);
       int secondLargest = findingSecondLarge(mas);
       if (secondLargest != Integer.MIN_VALUE) {
           System.out.println("Второй по величине элемент массива это - " + secondLargest);
       } else {
           System.out.println("Нет второго по величине элемента массива!!!");
       }
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
    public static int findingSecondLarge(int[] array) {
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = num;
            } else if (num > secondLarge && num != firstLarge) {
                secondLarge = num;
            }
        }

        return secondLarge;
    }
}
