package lesson3;

public class Matrix {

    public static void main(String[] args) {

        Integer[][] matrix = new Integer[4][4];

        fillMatrix(matrix);
        printMatrix(matrix);
        getSum(matrix);

    }

    private static void printMatrix(Integer[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int getRandomNumber(int from, int to) {
        return from + (int) (Math.random() * to);
    }

    private static void fillMatrix(Integer[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col > row) {
                    matrix[row][col] = getRandomNumber(1, 10);
                } else if (row > col) {
                    matrix[row][col] = getRandomNumber(10, 10);
                } else {
                    matrix[row][col] = 1;
                }
            }
            System.out.println();
        }
    }

    private static void getSum(Integer[][] matrix) {
        int topSum = 0, bottomSum = 0;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {
                if (col > row) {
                    topSum += matrix[row][col];
                }
                if (row > col) {
                    bottomSum += matrix[row][col];
                }
            }
        }
        System.out.println("Top: " + topSum + ", Bottom: " + bottomSum);
    }

}
