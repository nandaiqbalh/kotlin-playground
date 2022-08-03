import java.util.*;

public class Main {
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high) {
            return -1;
        }/*from ww  w.  j a va 2s  .c  o m*/
        int middle = (low + high) / 2;

        if (arr[middle] == key) {
            return middle;
        } else if (key > arr[middle]) {
            return binarySearch(arr, middle + 1, high, key);
        } else {
            return binarySearch(arr, low, middle - 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, value, answer;
        int[] array = new int[10000];
        for (i=0; i<10000; i++) {
            array[i] = sc.nextInt();
        }
        for (i=0; i<10000; i++) {
            value = sc.nextInt();
            answer = binarySearch(array, value, 0, 9999);
            System.out.printf("%d\n", answer);
        }
    }
}