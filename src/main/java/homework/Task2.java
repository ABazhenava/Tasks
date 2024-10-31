package homework;

public class Task2 {

//    Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
//(читается одинаково слева направо и справа налево).

    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 2, 1};
        print(mas);

        boolean isPalindrome = isPalindrome(mas);
        System.out.println("Является ли этот массив палиндромом? " + isPalindrome);
    }

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
