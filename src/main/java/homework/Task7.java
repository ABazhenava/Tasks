package homework;

public class Task7 {
    //7. Дан массив целых чисел A длиной N и два индекса L и R, где 0 ≤ L ≤ R < N. Разверните
    //элементы массива между индексами L и R включительно, оставив остальные
    //элементы без изменений.

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int L = 1;
        int R = 3;
        subArray(array, L, R);

        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void subArray(int[] array, int L, int R) {
        while (L < R) {
            int mas = array[L];
            array[L] = array[R];
            array[R] = mas;
            L++;
            R--;
        }

    }

}
