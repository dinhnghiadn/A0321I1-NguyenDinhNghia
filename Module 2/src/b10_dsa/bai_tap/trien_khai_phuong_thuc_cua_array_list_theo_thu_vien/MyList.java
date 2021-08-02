package b10_dsa.bai_tap.trien_khai_phuong_thuc_cua_array_list_theo_thu_vien;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity(int minCapacity) {
        int newSize = minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index,E e) {
        if (size == elements.length) {
            ensureCapacity(size+1);
        }
        if (index != size){
            System.arraycopy(elements,index,elements,index+1,size-index);
            elements[index] = e;
            size++;
        }

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E)elements[i];
    }

    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        E e = (E) elements[i];
        for (int j = i; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        size--;
        return e;
    }

    public int size() {
        return size;
    }


    public Object clone() {
        MyList<E> clone = new MyList<E>();
        clone.size = this.size;
        clone.elements = elements;
        return clone;
    }
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println("element: " + elements[i]);
        }
    }
    public boolean contains(E o){
        return indexOf(o) != -1;
    }
    public int indexOf(E o){
        for (int i = size-1; i>=0; i--){
            if( o == elements[i]){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        if (size>0){
            Arrays.fill(elements,0,size,null);
            size = 0;
        }
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size+1);
        }
        elements[size++] = e;
        return true;
    }


}
