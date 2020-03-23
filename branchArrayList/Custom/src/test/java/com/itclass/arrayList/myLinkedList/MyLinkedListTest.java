package com.itclass.arrayList.myLinkedList;

import org.junit.Assert;
import org.junit.Test;


public class MyLinkedListTest {

    @Test
    public void node() {
    }

    @Test
    public void testSize() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals(4, newList.size());
    }

    @Test
    public void testAdd() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals("ded", newList.getByIndex(2));
    }

    @Test
    public void testAddByIndex() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        newList.add(3,"vnuchka");
        Assert.assertEquals(3, newList.indexOf("vnuchka"));
        Assert.assertEquals("vnuchka", newList.getByIndex(3));

    }

    @Test
    public void testIsEmpty() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals(false, newList.isEmpty());
    }

    @Test
    public void contains() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals(true, newList.contains("ded"));
    }

    @Test
    public void set() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        newList.set(2, "kot");
        Assert.assertEquals("kot", newList.getByIndex(2));
    }

    @Test
    public void testRemove() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        newList.remove();
        Assert.assertEquals(null, newList.getByIndex(3));
    }

    @Test
    public void testRemoveByIndex() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        newList.remove(2);
        Assert.assertEquals("babka", newList.getByIndex(2));
    }

    @Test
    public void testRemoveByObject() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        newList.remove("ded");
        Assert.assertEquals("babka", newList.getByIndex(2));
    }

    @Test
    public void testGetByIndex() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals("ded", newList.getByIndex(2));
        Assert.assertEquals("babka", newList.getByIndex(3));
    }

    @Test
    public void testIndexOf() {
        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add("mama");
        newList.add("papa");
        newList.add("ded");
        newList.add("babka");
        Assert.assertEquals(2, newList.indexOf("ded"));
    }
}