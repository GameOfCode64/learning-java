import java.util.Arrays;

public class MaximumIceCreamBars {
    static int maxIceCream(int[] costs, int coins) {
        int maxBar = 0;
        Arrays.sort(costs);

        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];
                maxBar++;
            }
        }

        return maxBar;
    }

    public static void main(String[] argu) {
        int[] costs = { 1, 3, 2, 4, 1 };
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }
}