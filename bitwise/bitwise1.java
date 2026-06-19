public class bitwise1 {
    static void checkOddEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    public static void main(String[] argu) {
        checkOddEven(45);
    }
}
