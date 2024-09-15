public class MatrixCalculator {
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int rowsMatrix2 = matrix2.length;
        int colsMatrix2 = matrix2[0].length;

        if (colsMatrix1 != rowsMatrix2) {
            throw new IllegalArgumentException("Invalid sizes");
        }

        double[][] result = new double[rowsMatrix1][colsMatrix2];

        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsMatrix1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
