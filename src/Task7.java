public class Task7 {
    public double calculateAverage(int[][] matrix){
        int counter=0;
        double avg=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                avg+=matrix[i][j];
                counter++;
            }
        }
        return avg/counter;
    }

}
