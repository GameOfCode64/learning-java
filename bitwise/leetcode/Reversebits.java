public class Reversebits {
    static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] argu) {
        System.out.println(reverseBits(43261596));
    }

}