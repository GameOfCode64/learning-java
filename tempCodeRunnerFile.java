public class tempCodeRunnerFile {

    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long num = 0;
            long sum = 0;

            for (int j = 0; j < queries[i].length; j++) {
                int val = queries[i][j];
                if (val >= queries[i][0] && queries[i][j] <= queries.length) {
                    sum += queries[i][j];
                    if (queries[i][j] > 0) {
                        num = num * 10 + queries[i][j];
                    }
                }
            }
            result[i] = (int) (num * sum);

        }

        return result;
    }

    public static void main(String[] argu) {
        int[] arr = { 1, 0, 3, 0, 5, 0, 7 };
        int[] result = moveleft(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}