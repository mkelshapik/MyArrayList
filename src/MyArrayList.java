public class MyArrayList <E> implements MethodsForMyArrayList <E> {

    private E[] values;

    MyArrayList(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean addElement(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
            } catch (ClassCastException ex){
                ex.printStackTrace();
                    }
        return false;
    }

    @Override
    public boolean addWithIndex(int index, E e) {
        if (index < values.length){
            values[index] = e;
            return true;
        } else {
            E[] temp = values;
            values = (E[]) new Object[index + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[index] = e;
            return true;
            }
    }

    @Override
    public void remove(int index) {
        E[] temp = values;
        values =(E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        System.arraycopy(temp, index + 1, values, index, values.length - index);
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void set(int index, E e){
        values[index] = e;
    }
}
