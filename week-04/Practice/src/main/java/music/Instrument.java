package main.java.music;

public abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instrument() {
    }

    public abstract void play();
}
