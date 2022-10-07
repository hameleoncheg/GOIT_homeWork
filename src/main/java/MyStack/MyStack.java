package MyStack;

import java.util.Arrays;

public class MyStack {

    private Object data[];

    private int index = 0;

    public MyStack() {
        data = new Object[1];
    }

    public void push(Object obj)  {
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
    public Object pop() {
        Object poll = data[data.length-1];
        Object[] destArray = new Object[data.length - 1];
        System.arraycopy(data, 0, destArray, 0,data.length-1);
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
        return data[data.length-1];
    }
    public Object size(){
        return data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}