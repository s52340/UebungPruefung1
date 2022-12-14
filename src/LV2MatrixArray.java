public class LV2MatrixArray {
    public static void main(String[] args) {
        int size = 3;

        int[][] matrix;

        matrix = generateIdentityMatrix(size);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int[][] generateIdentityMatrix(int size){
        int[][] intMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            intMatrix[i][i] = 1;
        }
        return intMatrix;
    }
}
