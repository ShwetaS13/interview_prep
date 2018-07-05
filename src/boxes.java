/**
 * Created by Shweta on 6/20/2017.
 */
public class boxes {
    public static int minimalNumberOfBoxes(int products, int availableLargeBoxes, int availableSmallBoxes) {
        for(int i = 0; i <= availableLargeBoxes; i++){
            for(int j = 0; j <= availableSmallBoxes; j++) {
                if(((i * 5 ) + j) == products ){
                    System.out.println(i + "" + j+ "");
                    return i + j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfBoxes(12, 3, 3));
    }
}