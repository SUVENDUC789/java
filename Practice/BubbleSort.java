import java.util.*;

public class BubbleSort {
    public static void isSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 9, 6, 7, 4, 2, 8, 9, 2, 2, 0 };
        isSort(a);
        System.out.println(Arrays.toString(a));
    }
}
