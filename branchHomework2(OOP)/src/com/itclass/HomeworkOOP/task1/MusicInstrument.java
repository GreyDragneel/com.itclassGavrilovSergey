package com.itclass.HomeworkOOP.task1;

public abstract class MusicInstrument {

    private String name;
    private String sound;
    private String description;
    private String history;

    public MusicInstrument(String name, String sound, String description, String history) {
        this.name = name;
        this.sound = sound;
        this.description = description;
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getDescriotion() {
        return description;
    }

    public void setDescriotion(String description) {
        this.description = description;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public abstract void sound();

    public abstract void show();

    public abstract void desc();

    public abstract void history();
}
