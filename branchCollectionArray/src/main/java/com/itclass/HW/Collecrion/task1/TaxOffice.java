package com.itclass.HW.Collecrion.task1;

import java.util.ArrayList;
import java.util.List;

public class TaxOffice {
    private List<Human> humans = new ArrayList<>();

    public List<Human> getFullListingOfTheDatabase() {
        return humans;
    }

    public  Human printOutOfDataForASpecificCode(int Id, Human human) {
        if (IsThereSpecificCode(Id)) {
            return findHumanById(Id);
        } else {
            throw new IllegalArgumentException("Isn't same ID");
        }
    }

    private boolean IsThereSpecificCode(int Id) {
        for (Human human : humans) {
            if (human.getId() == Id) {
                return true;
            }
        }
        return false;
    }

    private Human findHumanById(int Id) {
        for (Human human : humans) {
            if (human.getId() == Id) {
                return human;
            }
        }
        throw new IllegalArgumentException("This is not the same identifier.");
    }

    public void addingANewHumanWithInfo(int id, String name) {
        if (!IsThereSpecificCode(id)) {
            humans.add(new Human(id, name));
        } else {
            throw new IllegalArgumentException("This is wrong. Is no human ");
        }
    }

    public void addingANewForfeitForHuman(int ID, String messageName, ForfeitType forfeitTypeName) {
        if (IsThereSpecificCode(ID)) {
            findHumanById(ID).writeOutAForfeit(forfeitTypeName, messageName);

        } else {
            throw new IllegalArgumentException("This is wrong ");
        }
    }

    public void removingAForfeitByHuman(int ID, String messageName, ForfeitType forfeitTypeName) {
        if (IsThereSpecificCode(ID)) {
            findHumanById(ID).removeAForfeit(forfeitTypeName, messageName);

        } else {
            throw new IllegalArgumentException("This is wrong ");
        }
    }
}


