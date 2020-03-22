package com.itclass.arrayList.myLinkedList;

import lombok.Getter;

@Getter
class MyLinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public E getLast(){
        return this.last.element;
    }

    public MyLinkedList() {
        size = 0;
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E e, Node<E> next) {
            element = e;
            this.next = next;
            this.prev = prev;
        }
    }


    private void linkFirst(E e) {
        Node<E> first = this.first;
        Node<E> newNode = new Node<E>(null, e, first);
        this.first = newNode;
        if (first == null) {
            this.last = newNode;
        } else {
            first.prev = newNode;
        }
        size++;
    }

    private void linkLast(E e) {
        Node<E> last = this.last;
        Node<E> newNode = new Node<E>(last, e, null);
        this.last = newNode;
        if (last == null) {
            this.first = newNode;
        } else {
            last.next = newNode;
        }

        size++;
    }

    private void linkBefore(E e, Node<E> subsequent) {
        final Node<E> pred = subsequent.prev;
        final Node<E> newNode = new Node<>(pred, e, subsequent);
        subsequent.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    public Node<E> node(int index) {
        Node<E> x;
        if (index > size / 2) {
            x = last;
            for (int i = size; i < index; i--) {
                x = x.prev;
            }
        } else {
            x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        }

        return x;
    }


    public int size() {
        return size;
    }

    public void add(E e) {
        linkLast(e);
    }

    public void add(int index, E e) {
        if (index == size)
            linkLast(e);
        else
            linkBefore(e, node(index));
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public void set(int index, E e) {
        if (index >= 0 && index < size) {
            node(index).element = e;
        } else {
            throw new IllegalArgumentException("Oops!");
        }
    }

    public void remove() {
        this.last.prev.next = null;
        this.last.element = null;
        this.last.prev = null;
        size--;
    }

    public void remove(Object o) {
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.element)) {
                final E element = x.element;
                final Node<E> next = x.next;
                final Node<E> prev = x.prev;

                if (prev == null) {
                    first = next;
                } else {
                    prev.next = next;
                    x.prev = null;
                }

                if (next == null) {
                    last = prev;
                } else {
                    next.prev = prev;
                    x.next = null;
                }

                x.element = null;

            }
        }
        size--;
    }

    public void remove(int index) {
        Node<E> x = node(index);
        final E element = x.element;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.element = null;
        size--;
    }

    public E getByIndex(int index) {
        return node(index).element;
    }

    public int indexOf(Object o) {
        int i = 0;
        Node<E> x;
        if (o == null) {
            for (x = first; x != null; x = x.next) {
                if (x.element == null) {
                    return i;
                }

                i++;
            }
        } else {
            for (x = first; x != null; x = x.next) {
                if (o.equals(x.element)) {
                    return i;
                }

                i++;
            }
        }

        return -1;
    }


}

