import java.util.Arrays;

/**
 * The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days.
 * For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
 * the maximum profit can earned by buying on day 0, selling on day 3.
 * Again buy on day 4 and sell on day 6.
 * If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
 */
public class MaximumProfit {
    public static void main(String args[]){
//        int[] array = new int[]{100, 180, 260, 310, 40, 535, 695};
        int[] array = new int[]{695, 535, 535};


        MaximumProfit maximumProfit = new MaximumProfit();
        int[] result = maximumProfit.findMaximumProfit(array);

        if(result[0] > 0){
            System.out.printf("A profit of $%d is earned when the stocks are bought on day %d($%d) and sold on day %d($%d)\n",
                    result[0], result[1], array[result[1]], result[2], array[result[2]]);
        }else{
            System.out.printf("No profit is earned\n");
        }

    }

    public int[] findMaximumProfit(int[] array){
        int buyOn = -1;
        int sellOn = -1;
        int maximumProfit = 0;
        int newProfit;

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                newProfit = array[j] - array[i];
                if (newProfit > 0 && newProfit > maximumProfit) {
                    maximumProfit = newProfit;
                    buyOn = i;
                    sellOn = j;
                }
            }
        }

        return new int[]{maximumProfit, buyOn, sellOn};
    }
}
