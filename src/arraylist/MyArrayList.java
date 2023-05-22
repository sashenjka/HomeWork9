package arraylist;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[INIT_SIZE];
        size = 0;
    }

    public void add(T value) {
        if (size == array.length) {
            resizeArray();
        }
        array[size] = value;
        size++;
    }

    private void resizeArray() {
        int newSize = array.length * 2;
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int i) {
        return (T) array[i];
    }

}

