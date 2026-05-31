public class CountDigite {
    // ! Problem
    // ! Given a positive integer, count how many digits it contains.
    public static void main(String[] argu) {
        int num = 123745;
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }

}
