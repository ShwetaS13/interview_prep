package interviewQuestions;

/**
 * Find the number of islands | Set 1 (Using DFS)
 * Given a boolean 2D matrix, find the number of islands. A group of connected 1s forms an island.
 * For example, the below matrix contains 5 islands
 */
public class IslandProblem {
    public static void main(String args[]) {
        int[][] array = new int[][]{{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        IslandProblem islandProblem = new IslandProblem();
        System.out.printf("Number of islands is %d.\n", islandProblem.countIslands(array));
    }

    public int countIslands(int[][] array) {
        boolean[][] visited = new boolean[array.length][array.length];

        int count = 0;
        for (int row = 0; row < array.length; ++row) {
            for (int column = 0; column < array.length; ++column) {
                if (!visited[row][column] && array[row][column] == 1) {
                    checkAdjacent(array, visited, row, column);
                    ++count;
                }
            }
        }

        return count;
    }

    private void checkAdjacent(int[][] array, boolean[][] visited, int row, int column) {
        int xaxis[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int yaxis[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};

        visited[row][column] = true;

        for (int index = 0; index <  8; ++index) {
            if (isAccepted(array, visited, row + xaxis[index], column + yaxis[index])) {
                checkAdjacent(array, visited, row + xaxis[index], column + yaxis[index]);
            }
        }
    }

    private boolean isAccepted(int[][] array, boolean[][] visited, int row, int column) {
        return (row < array.length && row >= 0 &&
                column < array.length && column >= 0 &&
                (!visited[row][column] &&
                array[row][column] == 1)) ;
    }
}
