public class test {

    public static void main(String[] argu) {
        int low = 1;
        int high = 100;
        int count = 0;
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = low; i <= high; i++) {

            int digits = 0;
            int temp = i;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            int divisor = (int) Math.pow(10, digits / 2);
            if (digits % 2 != 0) {
                continue;
            }
            int Fsum = 0;
            int Ssum = 0;
            firstHalf = i / divisor;
            secondHalf = i % divisor;

            while (firstHalf > 0 || secondHalf > 0) {
                int frem = firstHalf % 10;
                int srem = secondHalf % 10;
                firstHalf /= 10;
                secondHalf /= 10;
                Fsum += frem;
                Ssum += srem;
            }
            if (Fsum == Ssum) {
                count++;
            }

        }
        System.out.println(count);

    }
}