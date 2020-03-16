package com.itclass.arrayList.myCustomList;

public interface CustomList<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    void add(E e);

    void add(int index, E e);

    void set(int index, E e);

    void remove(Object o);

    void remove();

    void remove(int index);
}
