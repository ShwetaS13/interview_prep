import java.util.*;

/**
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
 * The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and
 * cross the least bricks.
 * The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick
 * in this row from left to right.
 * If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to
 * draw the line to cross the least bricks and return the number of crossed bricks.
 * You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously
 * cross no bricks.
 *
 * Example:
 * Input:
 * [[1,2,2,1],
 * [3,1,2],
 * [1,3,2],
 * [2,4],
 * [3,1,2],
 * [1,3,1,1]]
 * Output: 2
 *
 * Explanation:
 * Note:
 * 1. The width sum of bricks in different rows are the same and won't exceed INT_MAX.
 * 2. The number of bricks in each row is in range [1,10,000]. The height of wall is in range [1,10,000]. Total number of bricks
 * of the wall won't exceed 20,000.
 */
public class BrickWallProblem {
    public static void main(String args[]){
        List<List<Integer>> wall = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 2, 1);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 3, 1, 2);
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 1, 3, 2);
        List<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 2, 4);
        List<Integer> list5 = new ArrayList<>();
        Collections.addAll(list5, 3, 1, 2);
        List<Integer> list6 = new ArrayList<>();
        Collections.addAll(list6, 1, 3, 1, 1);
        wall.add(list1);
        wall.add(list2);
        wall.add(list3);
        wall.add(list4);
        wall.add(list5);
        wall.add(list6);
        BrickWallProblem brickWallProblem = new BrickWallProblem();
        System.out.println(brickWallProblem.leastBricks(wall));
    }

    public int leastBricks(List<List<Integer>> wall) {
        HashMap < Integer, Integer > map = new HashMap< >();
        for (List < Integer > row: wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum))
                    map.put(sum, map.get(sum) + 1);
                else
                    map.put(sum, 1);
            }
        }
        int res = wall.size();
        for (int key: map.keySet())
            res = Math.min(res, wall.size() - map.get(key));
        return res;
    }

}
