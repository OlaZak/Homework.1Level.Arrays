public class Task9 {
    public int [][]findMaxSumRow(int[][] matrix){
        int rowCounter = 0;
        int colCounter = matrix[0].length;
        for (int[] array : matrix) {
            rowCounter++; }
        int[][] matrixTransposed = new int[colCounter][rowCounter];
        for (int i = 0; i < rowCounter; i++) {
            for (int j = 0; j < colCounter; j++) {
                matrixTransposed[j][i] = matrix[i][j];
            }
        }
        return matrixTransposed;

    }
}
