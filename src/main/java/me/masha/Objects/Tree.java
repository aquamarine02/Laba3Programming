package me.masha.Objects;

import me.masha.Interfaces.Movable;
import me.masha.Interfaces.Whisperable;

public class Tree extends Essence implements Whisperable, Movable {
    public Tree(String name) {
        super(name);
    }

    @Override
    public void whisper(String how, String language) {
        System.out.println(" и что-то" + how + " шепчут " + language);
    }

    @Override
    public void move(String how, String what) {
        System.out.print(getName() + how + "машут ему" + what);
    }

}
