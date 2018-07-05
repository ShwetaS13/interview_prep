/**
 * Created by Shweta on 3/28/2017.
 */
public class NumberOfOnes {
    public static void main(String args[]){
        System.out.println(numSetBits(8));
    }

        public static int numSetBits(long a) {
            if (a == 0) {
                return 0;
            }
            if (a == 1) {
                return 1;
            }
            if (a > 0) {
                return (a % 2 == 0 ? 0 : 1) + numSetBits(a >> 1);
            } else {
                a = -a;
                return (a % 2 == 0 ? 0 : 1) + numSetBits(a >> 1) + 1;
            }
        }
}
