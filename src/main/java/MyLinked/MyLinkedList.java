package MyLinked;

public class MyLinkedList<T> {

    private class Node<T>{
        T value;
        Node<T> next;
        Node(T value){
            this.value = value;
            this.next = null;
        }
    }
    private Node<T> head=null;
    public int size() {
        Node<T> p;
        int size=0;
        for(p=head;p!=null;p=p.next){
            size++;
        }
        return size;
    }
    public boolean isEmpty() {
        if(size()==0){
            return true;
        }
        return false;
    }
    public void add(T o){
        if(isEmpty()){
            head=new Node<T>(o);
        }else{
            Node<T> p=head;
            Node<T> node=new Node<T>(o);
            while(p.next!=null){
                p=p.next;
            }
            p.next=node;
            node.next=null;
        }
    }
    public void clear() {
        head=null;
    }
    public T remove(int index) {
        if(isEmpty()){
            return null;
        }
        if(index<0||index>size()){
            return null;
        }
        Node<T> p=head,p1=null;
        int i=-1;
        while(p!=null){
            i++;
            if(i==index){
                if(p1==null){
                    head=head.next;
                }else{
                    p1.next=p.next;
                }
                return p.value;
            }
            p1=p;
            p=p.next;
        }
        return null;
    }
    public T get(int index) {
        int i=-1;
        if(isEmpty()){
            return null;
        }
        if(index<0||index>size()){
            return null;
        }
        Node<T> p=head;
        while(p!=null){
            i++;
            if(i==index){
                return p.value;
            }
            p=p.next;
        }
        return null;
    }

}
