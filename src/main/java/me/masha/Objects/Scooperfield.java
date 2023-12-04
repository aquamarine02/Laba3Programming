package me.masha.Objects;

import me.masha.Interfaces.Feelable;
import me.masha.Interfaces.Movable;
import me.masha.Interfaces.Visible;
import me.masha.Interfaces.Watchable;
import me.masha.Interfaces.Body;
import me.masha.Interfaces.Seemable;

public class Scooperfield extends Essence implements Visible, Watchable, Feelable, Movable, Seemable {
    public Scooperfield(){
        super("Скуперфильд ");
    }
    @Override
    public void look(String what){
        System.out.print(getName() + "никогда не видел " + what);
    }

    @Override
    public void feel(Body body) {
        System.out.print(getName() + "не чувствовал");
        switch (body){
            case Arms:
                System.out.print(" руки, ");
                break;
            case Legs:
                System.out.print(" ноги, ");
                break;
            case Torso:
                System.out.print(" туловище, ");
                break;
            case Pain:
                System.out.println(" даже боль.");
                break;
            case FullBody:
                System.out.print(" все тело, ");
                break;
            default:
                break;
        }
    }

    @Override
    public void move(String how, String where) {
        System.out.println(how + getName() + "застыл" + where);
    }

    @Override
    public void watch(String what) {
        System.out.println(", но " + getName() + "наслаждался, глядя " + what);
    }

    @Override
    public void seem(String what) {
        System.out.print(getName() + "подумал, " + what);
    }
}
