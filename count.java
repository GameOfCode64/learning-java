import java.util.*;

class count {
    public static void main(String[] argu) {
        int digit = 1338339; // Ans ---> 3
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter A number to find freq: ");
        int number = sn.nextInt();

        int count = 0;
        while (digit > 0) {
            int rem = digit % 10;
            if (rem == number) {
                count++;
            }
            digit = digit / 10;
        }
        System.out.println("Count: " + count);
    }
}
