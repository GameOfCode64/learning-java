public class MostProfitAssigningWork {

    static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit = 0;
        for (int i = 0; i < worker.length; i++) {
            int bestProfitForThisWorker = 0;
            for (int j = 0; j < difficulty.length; j++) {
                if (worker[i] >= difficulty[j]) {
                    if (profit[j] > bestProfitForThisWorker) {
                        bestProfitForThisWorker = profit[j];
                    }
                }
            }
            maxProfit += bestProfitForThisWorker;
        }
        return maxProfit;
    }

    public static void main(String[] argu) {

        int[] difficulty = { 68, 35, 52, 47, 86 };
        int[] profit = { 67, 17, 1, 81, 3 };
        int[] worker = { 92, 10, 85, 84, 82 };

        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
}