package com.itclass.arrayList.myCustomList;

import org.junit.Assert;
import org.junit.Test;


public class MyArrayListTest {

    @Test
    public void testSize() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(2);
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testIsEmptyFalse() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(2);
        Assert.assertFalse(list.isEmpty());
    }
    @Test
    public void testIsEmptyTrue() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testContainsTrue() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        Assert.assertTrue(list.contains(23));
    }

    @Test
    public void testContainsFalse() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("baba");
        list.add("ded");
        list.add("kot");
        Assert.assertFalse(list.contains("mama"));
    }

    @Test
    public void testAdd() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        Assert.assertEquals(23, (Object) list.get(2));
    }

    @Test
    public void testAddByIndex() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.add(22);
        list.add(21);
        list.add(3, 56);
        Assert.assertEquals(56, (Object) list.get(3));
        Assert.assertEquals(22, (Object) list.get(4));
        Assert.assertEquals(21, (Object) list.get(5));
    }

    @Test
    public void testSet() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.set(1, 16);
        Assert.assertEquals(16, (Object) list.get(1));
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveLast() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(23);
        list.remove();
        Assert.assertEquals(2, (Object) list.get(2));
    }

    @Test
    public void testRemoveObject() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("baba");
        list.add("ded");
        list.add("mama");
        list.add("papa");
        list.add("kot");
        list.remove("ded");
        Assert.assertFalse(list.contains("ded"));
    }

    @Test
    public void testRemoveByIndex() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("baba");
        list.add("ded");
        list.add("mama");
        list.add("papa");
        list.add("kot");
        list.remove(1);
        Assert.assertFalse(list.contains("ded"));
    }
}