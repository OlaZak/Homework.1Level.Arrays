public class Task4 {
    public int countPositives(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i > 0)
                counter++;
        }
        return counter;
    }
}
