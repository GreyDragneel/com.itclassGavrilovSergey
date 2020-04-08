package com.itclass.HW.CollectionCar;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CarBook {

    private TreeMap<String, TreeSet<String>> carMap;

    private Comparator<String> comparator = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return o1.toLowerCase().compareTo(o2.toLowerCase());
        }
    };

    public CarBook() {

        carMap = new TreeMap<String, TreeSet<String>>(comparator);
    }

    public void addMark(String mark) {

        carMap.put(mark, new TreeSet<String>(comparator));
    }

    public void addModel(String mark, String model) {

        carMap.get(mark).add(model);
    }

    public Set<String> getMarks() {

        return carMap.keySet();
    }

    public TreeSet<String> getModels(String mark) {

        return carMap.get(mark);
    }

    public void removeMark(String mark) {

        carMap.remove(mark);
    }

    public void removeModel(String mark, String model) {

        carMap.get(mark).remove(model);
    }

}
