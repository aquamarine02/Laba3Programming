package me.masha.Objects;

import me.masha.Interfaces.Movable;

public class Wind extends Essence implements Movable {
    public Wind(String name) {
        super(name);
    }

    @Override
    public void move(String how, String what) {
        System.out.println(getName() + " налетал " + how + " и шевелил " +what);
    }
}
