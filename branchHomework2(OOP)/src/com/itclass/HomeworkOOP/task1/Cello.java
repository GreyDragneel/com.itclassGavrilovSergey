package com.itclass.HomeworkOOP.task1;

public class Cello extends MusicInstrument {

    public Cello(String name, String sound, String description, String history) {
        super(name, sound, description, history);
    }

    public void sound(){
        System.out.println(super.getSound());
    }

    public void show(){
        System.out.println(super.getName());
    }

    public void desc(){
        System.out.println(super.getDescriotion());
    }

    public void history(){
        System.out.println(super.getHistory());
    }
}
