public class MyArrayList <E> implements MethodsForMyArrayList <E> {

    private E[] values;
    private int size = 0;
    private int capacity;
    private static final int default_capacity = 10;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        values = (E[]) new Object[capacity];
    }

    public MyArrayList() {
        values = (E[]) new Object[default_capacity];
    }

    @Override
    public void add(E e) {
        if (capacity <= size) {
            E[] temp = values;
            values = (E[]) new Object[temp.length + default_capacity];
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
            throw new IndexOutOfBoundsException("Індекс вказаний не вірно!");
        } else if (size == capacity) {
            E[] temp = values;
            values = (E[]) new Object[temp.length + default_capacity];
            System.arraycopy(temp, 0, values, 0, temp.length);
            capacity = values.length;
        } else if (index == size) {
            values[size] = e;
        } else if (index == 0) {
            E[] temp = values;
            values = (E[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 1, temp.length);
            capacity = values.length;
            values[index] = e;
        } else {
            E[] temp = values;
            values = (E[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 0, index);
            values[index] = e;
            System.arraycopy(temp, index, values, index + 1, temp.length - index);
            capacity = values.length;
        }
        size++;
    }

    @Override
    public void removeAt(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Індекс вказаний не вірно!");
        } else if (index == size - 1) {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, temp.length - 1);
            capacity = values.length;
        } else if (index == 0) {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 1, values, 0, temp.length - 1);
            capacity = values.length;
        } else {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            System.arraycopy(temp, index + 1, values, index, values.length - index);
            capacity = values.length;
        }
        size--;
    }

    @Override
    public void remove(E element){
        int startSize = size;
        for (int i = 0; i < values.length; i++){
            if (element.equals(values[i])) {
                if (i == size - 1) {
                    E[] temp = values;
                    values = (E[]) new Object[temp.length - 1];
                    System.arraycopy(temp, 0, values, 0, temp.length - 1);
                    capacity = values.length;
                    size--;
                    break;
                } else if (i == 0) {
                    E[] temp = values;
                    values = (E[]) new Object[temp.length - 1];
                    System.arraycopy(temp, 1, values, 0, temp.length - 1);
                    capacity = values.length;
                    size--;
                    break;
                } else {
                    E[] temp = values;
                    values = (E[]) new Object[temp.length - 1];
                    System.arraycopy(temp, 0, values, 0, i);
                    System.arraycopy(temp, i + 1, values, i, values.length - i);
                    capacity = values.length;
                    size--;
                    break;
                }
            } else {
                continue;
            }
        }
        if (startSize == size){
            throw new IllegalArgumentException("Вказанний елемент відсутній!");
        }
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Індекс вказаний невірно!");
        }
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void insert(int index, E e) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Індекс вказаний не вірно!");
        } else {
            values[index] = e;
        }
    }
}