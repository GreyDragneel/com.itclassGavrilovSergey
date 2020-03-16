package com.itclass.arrayList.myCustomList;

public class MyArrayList<E> implements CustomList<E> {
    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[0];
    }


    public E get(int index){
        return elements[index];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < elements.length; i++){
            if(elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(E e) {
        Object[] newArray = new Object[elements.length + 1];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = (E[]) newArray;
        elements[elements.length - 1] = e;
    }

    @Override
    public void add(int index, E e) {
        Object[] newArray = new Object[elements.length + 1];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        newArray[index] = e;
        System.arraycopy(elements, index , newArray, index + 1, elements.length - index);
        elements = (E[]) newArray;
    }

    @Override
    public void set(int index, E e) {
        elements[index] = e;
    }

    @Override
    public void remove(Object o) {
        int length = elements.length;
        for(int i = 0; i < length; i++){
            if(elements[i].equals(o)){
                Object[] newArray = new Object[elements.length - 1];
                System.arraycopy(elements, 0, newArray, 0, i);
                System.arraycopy(elements, i + 1, newArray, i, elements.length - i - 1);
                elements = (E[]) newArray;
                break;
            }
        }
    }

    @Override
    public void remove() {
        Object[] newArray = new Object[elements.length - 1];
        System.arraycopy(elements, 0, newArray, 0, elements.length -1);
        elements = (E[]) newArray;
    }

    @Override
    public void remove(int index) {
        Object[] newArray = new Object[elements.length - 1];
        System.arraycopy(elements, 0, newArray, 0, index);
        System.arraycopy(elements, index + 1, newArray, index, elements.length - index - 1);
        elements = (E[]) newArray;
    }

}

