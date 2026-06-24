public class Numberscomplement {
    static int findComplement(int num) {
        int temp = num;
        int mask = 0;

        while (temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return num ^ mask;
    }

    public static void main(String[] argu) {
        System.out.println(findComplement(8));
    }
}