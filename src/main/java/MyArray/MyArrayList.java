package MyArray;

public class MyArrayList<E> {
    private final int I_SIZE = 16;
    private final int CUT_RATE = 4;
    private int pointer = 0;
    private Object[] array = new Object[I_SIZE];

    public void add(E element) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = element;
    }
    public void add(int index, E element) {
        if(pointer == array.length-1)
            resize(array.length*2);
        Object[] arrayDestination = new Object[array.length];
        System.arraycopy(array, 0, arrayDestination, 0, index);
        arrayDestination[index] = element;
        System.arraycopy(array, index, arrayDestination, index+1, (array.length -1)-index);
        array = arrayDestination;

    }


    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > I_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }
    public void clear() {
        for (int to = pointer, i = pointer = 0; i < to; i++)
            array[i] = null;
    }
    public int size() {
        return pointer;
    }

    public E get(int index) {
        return (E) array[index];
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
