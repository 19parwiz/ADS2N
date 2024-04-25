
// MyArrayList implementation
public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[10]; // Initial capacity
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
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements java.util.Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return (T) elements[currentIndex++];
        }
    }

    // Test method
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        // Test your methods here
    }
}