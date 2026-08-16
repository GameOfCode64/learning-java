
public class Class6 {

    static class CustomeArrayList {

        private int[] arr;
        private int size;

        public CustomeArrayList() {
            arr = new int[10];
            size = 0;
        }

        public void add(int value) {
            if (size == arr.length) {
                resize();
            }
            arr[size++] = value;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return arr[index];
        }

        public int size() {
            return size;
        }

        private void resize() {
            int[] newArr = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }

    static class CustomeArrayListWithGenerics<T> {

        private Object[] arr;
        private int size;

        public CustomeArrayListWithGenerics() {
            arr = new Object[10];
            size = 0;
        }

        public void add(T value) {
            if (size == arr.length) {
                resize();
            }
            arr[size++] = value;
        }

        @SuppressWarnings("unchecked")
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (T) arr[index];
        }

        public int size() {
            return size;
        }

        private void resize() {
            Object[] newArr = new Object[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }

    static int divide(int a, int b) throws Exception {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Can't divide By Zero");
        }
        return a / b;
    }

    public static void main(String[] args) throws Exception {

        CustomeArrayList list = new CustomeArrayList();
        list.add(10);
        list.add(20);
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Size of the list: " + list.size());
        System.err.println(divide(4, 0));
    }
}
