package types;

public class Pmd {

    public static void main(String[] args) {
        boolean[][] matrix = getSampleMatrix();

        printMatrix(matrix);

        System.out.println(findFirstTrueCell(matrix));
        System.out.println(countTrueCells(matrix));
        System.out.println(iterateMatrix(matrix));
    }

    private static void printMatrix(boolean[][] sampleMatrix) {
        for (boolean[] row : sampleMatrix) {
            for (boolean element : row) {
                System.out.print(element ? "X" : "O");
            }
            System.out.println();
        }
    }

    // intentionally bad code
    public static int countTrueCells(boolean[][] matrix) {
        int result = 0;
        if (matrix[0][0]) {
            result++;
        }
        if (matrix[0][1]) {
            result++;
        }
        if (matrix[0][2]) {
            result++;
        }
        if (matrix[1][0]) {
            result++;
        }
        if (matrix[1][1]) {
            result++;
        }
        if (matrix[1][2]) {
            result++;
        }
        if (matrix[2][0]) {
            result++;
        }
        if (matrix[2][1]) {
            result++;
        }
        if (matrix[2][2]) {
            result++;
        }

        return result;
    }

    // intentionally bad code
    public static int findFirstTrueCell(boolean[][] matrix) {
        if (matrix[0][0]) {
            return 1;
        }
        if (matrix[0][1]) {
            return 2;
        }
        if (matrix[0][2]) {
            return 3;
        }
        if (matrix[1][0]) {
            return 4;
        }
        if (matrix[1][1]) {
            return 5;
        }
        if (matrix[1][2]) {
            return 6;
        }
        if (matrix[2][0]) {
            return 7;
        }
        if (matrix[2][1]) {
            return 8;
        }
        if (matrix[2][2]) {
            return 9;
        }

        return -1;
    }

    // intentionally bad code
    public static int iterateMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]) {
                    int count = 0;
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[i][k]) {
                            count++;
                        }
                    }

                    return count;
                }
            }
        }
        return -1;
    }

    private static boolean[][] getSampleMatrix() {
        boolean[][] matrix = new boolean[3][3];

        matrix[2][1] = true;
        matrix[2][2] = true;

        return matrix;
    }

}
