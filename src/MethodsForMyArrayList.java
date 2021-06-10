public interface MethodsForMyArrayList <E> {
    boolean addElement(E e);
    boolean addWithIndex(int index, E e);
    void remove(int index);
    E get(int index);
    int size();
    void set(int index, E e);
}
