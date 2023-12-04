package me.masha.Objects;

public class Flowers extends Essence{
    public Flowers(String name) {
        super(name);
    }
    public void Dazzle(String where){
        System.out.println(where + " пестрели " + getName());
    }
}
