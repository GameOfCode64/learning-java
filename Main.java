import java.util.Scanner;

public class Main {
    public static void main(String[] argu) {
        // Find the largest number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest number is: " + max);
    }
}