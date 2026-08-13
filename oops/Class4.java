
public class Class4 {

    static class obj {

        int num;
        int gpa;

        obj(int num, int gpa) {
            this.num = num;
            this.gpa = gpa;
        }

    }

    public static void main(String[] args) {
        Protected obj = new Protected();
        obj a = new obj(123, 4);
        obj b = new obj(456, 3);
        if (a == b) {
            System.out.println("equal");
        }else{
            
            System.out.println("Not equal");
        }
        // obj.display(); // This will work because Class4 is in the same package as Protected
        // System.out.println("Hello, World!");
    }
}
