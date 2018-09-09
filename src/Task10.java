public class Task10 {
    public boolean isIdentity(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length)
                    throw new IllegalArgumentException("Matrix is not square");
            } }

        boolean isIdentity = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break; }
                else if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                } }
        }
        return isIdentity;

    }
}
