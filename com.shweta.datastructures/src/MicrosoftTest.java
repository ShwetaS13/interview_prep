/**
 * Program to swap a matrix over a diagonal in a two-dimensional matrix
 */
public class MicrosoftTest {

    public static void main(String args[]) {
        int[][] a = new int[][]{{1, 2, 3, 4}, {11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};
        print(a, 4);
        int[][] b = ab(a, 4);
        System.out.println();
        print(b, 4);

        int[][] c = new int[][]{{1, 2, 3, 4}, {11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};
        int[][] d = abc(c, 4);
        System.out.println();
        print(d, 4);
    }

    //better solution
    private static int[][] ab(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {        // j starts from i+1 to skip the comparison (i == j)
//                if (i != j) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
//                    }
                }
        }
        return matrix;
    }

    private static int[][] abc(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i ; j < size; j++) {
                if (i != j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                    }
            }
        }
        return matrix;
    }

    private static void print(int[][] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("{");
            for (int j = 0; j < size; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.print("}");
        }
    }
}
