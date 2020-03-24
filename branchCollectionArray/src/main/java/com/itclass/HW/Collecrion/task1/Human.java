package com.itclass.HW.Collecrion.task1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter

public class Human {
    private List<Forfeit> forfeitList = new ArrayList<>();
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void writeOutAForfeit(ForfeitType forfeitTypeName, String messageName) {
        forfeitList.add(new Forfeit(forfeitTypeName, messageName));
    }

    public void removeAForfeit(ForfeitType forfeitTypeName, String messageName) {
        forfeitList.remove(new Forfeit(forfeitTypeName, messageName));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Human{" +
                "forfeitList=" + forfeitList +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Forfeit> getForfeitList() {
        return forfeitList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
