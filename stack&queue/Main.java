public class Main{
    public static void main(String[] args){
        // Stack st = new Stack();
        StackUsingLinkedList st = new StackUsingLinkedList();

        st.push(10);
        st.push(12);
        st.push(14);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());


   
        // st.pop();
        // st.push(10);
        // st.push(12);
        // st.push(14);
        // st.push(16);
        // st.push(18);
        // st.push(20);
        // st.push(22);
        // st.push(24);
        // st.push(26);
        // st.push(28);
        // System.out.println(st.peek());
        // st.push(30);
    }
}