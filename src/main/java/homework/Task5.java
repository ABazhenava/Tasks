package homework;

public class Task5 {

//Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
//Создайте массив F длиной K, где каждый элемент F[i] содержит количество
//вхождений числа i в массиве A.

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 3, 3, 4, 4};
        int k = 5;
        int[] f = countOccurrences(a, k);

        for (int i = 1; i <= k; i++) {
            System.out.println("Количество вхождений числа " + i + "--> " + f[i]);
        }
    }

    public static int[] countOccurrences(int[] a, int k) {
        int[] f = new int[k + 1];  // Создаю массив f длиной k + 1 -- для индексации от 1 до k

        for (int x : a) {
            if (x >= 1 && x <= k) {
                f[x]++;
            }
        }
        return f;
    }
}
