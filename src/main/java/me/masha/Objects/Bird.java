package me.masha.Objects;

import me.masha.Interfaces.Flyable;
import me.masha.Interfaces.Talkable;
import me.masha.Interfaces.Direction;

public class Bird extends Essence implements Flyable, Talkable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly(String action, Direction direction) {
        System.out.print(action);
        switch (direction){
            case Up:
                System.out.println(" кверху.");
                break;
            case Down:
                System.out.print(" в траву,");
                break;
            case There:
                System.out.print(" там, ");
                break;
            case Impulses:
                System.out.println("порывами");
                break;
            default:
                break;
        }
    }

    @Override
    public void talk(String where, String what) {
        System.out.println(where + what + getName() + "наполняя воздух веселым чириканьем.");
    }
}
