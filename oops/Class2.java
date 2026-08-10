
public class Class2 {
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        // Human bhavishya = new Human("Bhavishya", 21, false, 64000f);
        // Human Tanishq = new Human("Tanishq", 22, false, 68000f);
        // System.out.println(Human.population);
        Test obj1 = new Test("Bhavishya");
        Test obj2 = new Test("Tanishq");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }

    Class2() {
        System.out.println("Constructor called");
        printTable(4);
    }
}
