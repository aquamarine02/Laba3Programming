package me.masha;
import me.masha.Interfaces.Body;
import me.masha.Interfaces.Direction;
import me.masha.Objects.*;

public class Main {
    public static void main(String[] args) {
        Scooperfield scooperfield = new Scooperfield("Устав ");
        scooperfield.stuck("и убедившись, что попытки освободиться ни к чему не ведут "," на месте.");
        Flowers flowers = new Flowers("розовые и нежно-голубые цветочки.");
        Wind wind = new Wind("Теплый, ласковый  ветерок");
        Tree trees = new Tree("деревья ");
        Bird birds = new Bird("маленькие красногрудые птички ");

        scooperfield.feel(Body.Arms);
        scooperfield.feel(Body.Legs);
        scooperfield.feel(Body.Torso);
        scooperfield.feel(Body.FullBody);
        scooperfield.feel(Body.Pain);

        wind.move("порывами", "на деревьях листочки.");

        scooperfield.seem("что ");
        trees.move("приветливо ", "сотнями своих крошечных зеленых ручек");
        trees.whisper(" потихоньку","на своем лесном языке.");


        flowers.dazzle("В траве");
        scooperfield.look("такие цветочки");
        scooperfield.watch("на них.");

        birds.talk("Вверху в ветвях деревьев ", " чирикая");
        birds.fly("Некоторые из них слетали", Direction.Down);
        birds.fly("что-то клевали", Direction.There);
        birds.fly("а потом опять взмывали", Direction.Up);
        scooperfield.look("лесных птичек");
        scooperfield.watch("на них.");
    }
}