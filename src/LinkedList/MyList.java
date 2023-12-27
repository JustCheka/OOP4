package LinkedList;

public interface MyList <T> {
    void addFirst(T element);
    void addLast(T element);
    T get(int index);
    int size();
}