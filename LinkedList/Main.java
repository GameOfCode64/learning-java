
public class Main {

    public static void main(String[] args) {
        
        SingleLL list = new SingleLL();
        DoublyLL dlist = new DoublyLL();


        dlist.insertFirst(12);
        dlist.insertFirst(13);
        dlist.insertFirst(14);
        dlist.display();
        dlist.reverse();

        // list.insert(13, 3);
        // list.insertFirst(1);
        // list.insertLast(44);
        // list.insertFirst(13);
        // list.insertFirst(12);
        // list.insertFirst(10);
        // list.insertFirst(23);

        
        // list.display();
    }
}
