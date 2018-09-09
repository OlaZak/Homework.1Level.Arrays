import java.util.Scanner;

public class Task5 {
    public int[] createSequenceArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;

    }
}
