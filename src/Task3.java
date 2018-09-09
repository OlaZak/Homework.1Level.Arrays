public class Task3 {
    public int findFirstPositive(int[] arr) {
        int value = -1;
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                first = i;
                break;
            } else
                first = value;
        }
        return first;
    }

    public int findLastPositive(int[] arr) {
        int value = -1;
        int last = 0;
        int i;
        for (i = arr.length-1; i >= 0; i--) {
            if (arr[i] > 0){
                last = i;
                break;}
            else last = value;
        }
        return last;
    }
}
