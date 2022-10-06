package MyLinked;

public class MyLinkedList<T> {
    T item;
    Node<T> next;
    Node<T> prev;
    int size = 0;
    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

    Node(Node<T> prev, T item, Node<T> next) {
        this.item = item;
        this.next= next;
        this.prev = prev;
    }
}


    public void add(){

    }
    public void remove(){

    }
    public void clear(){

    }
    public int size(){
        return size;
    }
    public void get(){

    }
}
