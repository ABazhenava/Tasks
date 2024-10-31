package homework;

public class Task3 {

//    Даны два отсортированных по возрастанию массива целых чисел A длиной N и B длиной M.
//    Объедините эти массивы в один отсортированный по возрастанию массив C длиной N + M.

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};
        int[] C = unite(A, B);

            for (int x : C) {
                System.out.print(x + " ");
            }
        }

    public static int[] unite(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[] C = new int[N + M];
        int i = 0, j = 0, k = 0;

        while (i < N && j < M) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < N) {
            C[k++] = A[i++];
        }

        while (j < M) {
            C[k++] = B[j++];
        }

        return C;
    }
}
