import java.util.Arrays;


public class StringCollection implements MyCollection {
    private String[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 1;

    public StringCollection() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length + 1, minCapacity);
            String[] newElements = new String[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public boolean add(String s) {
        ensureCapacity(size + 1);
        elements[size++] = s;
        return true;
    }

    public boolean remove(String s) {
        if (s instanceof String) {
            for (int i = 0; i < size; i++) {
                if (s.equals(elements[i])) {
                    int numMoved = size - i - 1;
                    if (numMoved > 0) {
                        System.arraycopy(elements, i + 1, elements, i, numMoved);
                    }
                    elements[--size] = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public void setByIndex(int index, String s) {
        while (index >= size) {
            this.add(null);
        }
        for (int i = 0; i < elements.length; i++) {
            elements[index] = s;
        }
    }

    boolean contains(String s) {
        if (s instanceof String) {
            for (int i = 0; i < size; i++) {
                if (s.equals(elements[i])) {
                    return true;
                }
            }
        }
        return false;
    }
    public int size() {
        return size;
    }
}
