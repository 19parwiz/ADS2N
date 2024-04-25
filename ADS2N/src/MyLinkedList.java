
// MyLinkedList implementation
public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next;
        MyNode prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(T item) {
        // Implement add method
    }

    @Override
    public void set(int index, T item) {
        // Implement set method
    }

    @Override
    public void add(int index, T item) {
        // Implement add method with index
    }

    @Override
    public void addFirst(T item) {
        // Implement addFirst method
    }

    @Override
    public void addLast(T item) {
        // Implement addLast method
    }

    @Override
    public T get(int index) {
        // Implement get method
        return null;
    }

    @Override
    public T getFirst() {
        // Implement getFirst method
        return null;
    }

    @Override
    public T getLast() {
        // Implement getLast method
        return null;
    }

    @Override
    public void remove(int index) {
        // Implement remove method
    }

    @Override
    public void removeFirst() {
        // Implement removeFirst method
    }

    @Override
    public void removeLast() {
        // Implement removeLast method
    }

    @Override
    public void sort() {
        // Implement sort method
    }

    @Override
    public int indexOf(Object object) {
        // Implement indexOf method
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        // Implement lastIndexOf method
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        // Implement exists method
        return false;
    }

    @Override
    public Object[] toArray() {
        // Implement toArray method
        return new Object[0];
    }

    @Override
    public void clear() {
        // Implement clear method
    }

    @Override
    public int size() {
        return size;
    }

    // Implement Iterable<T> interface
    @Override
    public java.util.Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements java.util.Iterator<T> {
        private MyNode current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    // Test method
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        // Test your methods here
    }
}