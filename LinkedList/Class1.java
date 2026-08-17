
public class Class1 {

    public static void main(String[] args) {
        SingleLL list = new SingleLL();

        list.insertFirst(10);
        list.insertFirst(1);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(23);
        list.insertLast(44);

        list.insert(13, 3);
        list.display();
    }
}
