package me.masha.Objects;

public class Flowers extends Essence {
    public Flowers(String name) {
        super(name);
    }

    public void dazzle(String where) { //todo
        System.out.println(where + " пестрели " + getName());
    }
}
