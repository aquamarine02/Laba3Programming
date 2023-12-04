package me.masha.Objects;

import me.masha.Interfaces.Movable;
import me.masha.Interfaces.Talkable;

public class Tree extends Essence implements Talkable, Movable {
    public Tree(String name) {
        super(name);
    }

    @Override
    public void talk(String how, String language) {
        System.out.println(" и что-то" + how + " шепчут " + language);
    }

    @Override
    public void move(String who, String how) {
        System.out.print(getName() + "приветливо машут " + who + how);
    }
}
