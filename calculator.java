import java.util.Scanner;

public class calculator {
    public static void main(String[] argu) {
        Scanner sn = new Scanner(System.in);

        while (true) {
            System.out.println("Press 0 for Quit ");
            System.out.println("Press 1 for + ");
            System.out.println("Press 2 for * ");
            System.out.println("Press 3 for / ");
            System.out.println("Press 4 for - ");
            System.out.println("Press 5 for % ");
            int input = sn.nextInt();

            int a, b;
            System.out.print("Enter your First Number: ");
            a = sn.nextInt();
            System.out.print("Enter your Second Number: ");
            b = sn.nextInt();

            if (input == 1) {
                System.out.println(a + b);
            }
            if (input == 2) {
                System.out.println(a * b);
            }
            if (input == 3) {
                System.out.println(a / b);
            }
            if (input == 1) {
                System.out.println(a - b);
            }
            if (input == 1) {
                System.out.println(a % b);
            }
        }
    }

}
