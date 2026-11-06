package tr.istiklal.edu;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public MyStack() {
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public int search(Object o) {
        return list.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    // Deep copy (Derin kopya) sağlayan clone metodu
    @Override
    public Object clone() {
        try {
            // Önce yüzeysel kopyayı (shallow copy) alıyoruz
            MyStack cloneStack = (MyStack) super.clone();

            // list alanının kendisini değil, yeni bir ArrayList oluşturup
            // içindeki elemanları birebir kopyalayarak derin kopya (deep copy) gerçekleştiriyoruz
            cloneStack.list = new ArrayList<>(this.list);

            return cloneStack;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}