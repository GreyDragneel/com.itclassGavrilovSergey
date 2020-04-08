package com.itclass.HW.CollectionCar;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CarBookTest {

    private CarBook getTestCarBook(){
        CarBook book = new CarBook();
        book.addMark("volkswagen");
        book.addMark("Toyota");
        book.addMark("hyundai");
        return book;
    }

    private void setTestModels(CarBook book){
        book.addModel("volkswagen", "golf");
        book.addModel("volkswagen", "polo");
        book.addModel("volkswagen", "Jetta");
        book.addModel("Toyota", "supra");
        book.addModel("Toyota", "Corolla");
        book.addModel("Toyota", "celica");
        book.addModel("hyundai", "solaris");
        book.addModel("hyundai", "Elantra");
        book.addModel("hyundai", "Sonata");
    }

    @Test
    public void testGetMarks() {
        CarBook book = getTestCarBook();
        Set<String> marks = book.getMarks();
        String[] marksArray = new String[3];
        Iterator<String> iterator = marks.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            marksArray[i] = iterator.next();
        }
        Assert.assertEquals("hyundai", marksArray[0]);
        Assert.assertEquals("Toyota", marksArray[1]);
        Assert.assertEquals("volkswagen", marksArray[2]);
    }

    @Test
    public void testGetModels() {
        CarBook book = getTestCarBook();
        setTestModels(book);
        String[] modelsArray = new String[3];
        TreeSet<String> models = book.getModels("hyundai");
        Iterator<String> iterator = models.iterator();
        for (int i = 0; iterator.hasNext(); i++) {
            modelsArray[i] = iterator.next();
        }
        Assert.assertEquals("Elantra", modelsArray[0]);
        Assert.assertEquals("solaris", modelsArray[1]);
        Assert.assertEquals("Sonata", modelsArray[2]);
    }

    @Test
    public void testAddMark() {
        CarBook book = new CarBook();
        book.addMark("KIA");
        Set<String> marks = book.getMarks();
        Iterator<String> iterator = marks.iterator();
        Assert.assertEquals("KIA", iterator.next());
    }

    @Test
    public void testAddModel() {
        CarBook book = getTestCarBook();
        setTestModels(book);
        TreeSet<String> models = book.getModels("hyundai");
        Assert.assertEquals(true, models.contains("Elantra"));
    }

    @Test
    public void testRemoveMark() {
        CarBook book = getTestCarBook();
        book.removeMark("volkswagen");
        Assert.assertEquals(false, book.getMarks().contains("volkswagen"));
    }

    @Test
    public void testRemoveModel() {
        CarBook book = getTestCarBook();
        setTestModels(book);
        book.removeModel("hyundai", "Elantra");
        TreeSet<String> models = book.getModels("hyundai");
        Assert.assertEquals(false, models.contains("Elantra"));
    }
}