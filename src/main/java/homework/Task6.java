package homework;

public class Task6 {

    // Дан массив целых чисел A длиной N.
    // Создайте новый массив B, содержащий все уникальные элементы массива A в порядке их первого вхождения.

    public static void main(String[] args) {
        int[] A = {1, 2, 8, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 7, 8};
        int N = A.length;
        int[] B = new int[N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            boolean isYes = true;
            for (int j = 0; j < i; j++) {
                if (A[i] == A[j]) {
                    isYes = false;
                    break;
                }
            }
            if (isYes) {
                B[index++] = A[i];
            }
        }
        int[] result = new int[index];
        System.arraycopy(B, 0, result, 0, index);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }


}

