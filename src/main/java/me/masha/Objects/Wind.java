package me.masha.Objects;

import me.masha.Interfaces.Direction;
import me.masha.Interfaces.Flyable;
import me.masha.Interfaces.Movable;

public class Wind extends Essence implements Flyable, Movable {
    public Wind(String name) {
        super(name);
    }
    @Override
    public void fly(String which, Direction direction) {
        System.out.print(which + getName() + " налетал ");
        switch (direction){
            case Up:
                System.out.print("Вверх");
                break;
            case Down:
                System.out.print("вниз");
                break;
            case There:
                System.out.print("там");
                break;
            case Impulses:
                System.out.print("порывами");
                break;
            default:
                break;
        }
    }
    @Override
    public void move(String where, String what) {
        System.out.println(" и шевелил " + where + what);
    }
}
