public class MyArrayList <E> implements MethodsForMyArrayList <E> {

    private E[] values;
    private int size = 0;
    private int capacity;

    public MyArrayList(int capacity){
        this.capacity = capacity;
        values = (E[]) new Object[capacity];
    }

    public MyArrayList(){
        capacity = 10;
        values = (E[]) new Object[capacity];
    }

    @Override
    public void add(E e) {
        if (capacity <= size){
            E[] temp = values;
            values = (E[]) new Object[temp.length + 10];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[temp.length] = e;
            capacity = values.length;
        } else {
            values[size] = e;
        }
        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Індекс вказаний не вірно");
        } else if (size == capacity){
            E[] temp = values;
            values = (E[]) new Object[temp.length + 10];
            System.arraycopy(temp, 0, values, 0, temp.length);
            capacity = values.length;
        } else if (index == size){
            values[size] = e;
        } else if (index == 0){
            E[] temp = values;
            values = (E[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 1, temp.length);
            capacity = values.length;
            values[index] = e;
        } else {
            E[] temp = values;
            values = (E[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 0, index - 1);
            values[index] = e;
            System.arraycopy(temp, index, values, index + 1, temp.length - index);
            capacity = values.length;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        /*E[] temp = values;
        values =(E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        System.arraycopy(temp, index + 1, values, index, values.length - index);*/
        // don`t ready
    }

    @Override
    public E get(int index) {
        if (index >= size){
            throw new IndexOutOfBoundsException("Індекс вказаний невірно!");
        }
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insert(int index, E e){
        // if index >= size ?
        values[index] = e;
    }
}
