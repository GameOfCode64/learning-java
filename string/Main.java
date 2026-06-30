public class Main {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder();
        String name = "Bhavishya";
        System.out.println(name.substring(0, 4));
        StringBuilder sb = new StringBuilder("hello");

        sb.deleteCharAt(1);

        System.out.println(sb);
        String str = "Java";

        System.out.println(str.substring(1, 3));
    }
}