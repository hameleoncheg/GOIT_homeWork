package MyQueue;

import java.util.Arrays;

public class MyQueue {

    private Object data[];

    private int index = 0;

    public MyQueue() {
        data = new Object[1];
    }


    public void add(Object obj)  {
        if(index == 0){
            data[0] = obj;
        }
        if (index >= 1){
            Object[] destArray = Arrays.copyOf(data, data.length +1);
           destArray[index] = obj;
            data = destArray;
        }
        index++;
    }
    public Object poll() {
        Object poll = data[0];
        Object[] destArray = new Object[data.length - 1];
        System.arraycopy(data, 1, destArray, 0,data.length-1);
        data = destArray;
        return poll;
    }
    public void remove(int index){
        Object[] destArray = new Object[data.length-1];
        System.arraycopy(data, 0, destArray, 0,index-1);
        System.arraycopy(data, index, destArray, index-1,data.length-index);

        data = destArray;
    }
    public void clear(){
        data = new Object[1];
    }
    public Object peek(){
        return data[0];
    }
    public Object size(){
        return data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}