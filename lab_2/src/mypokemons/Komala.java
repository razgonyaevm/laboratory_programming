package mypokemons;

import mymoves.komala.ConfuseRay;
import mymoves.komala.RockSlide;
import mymoves.komala.ShellSmash;
import mymoves.komala.Swift;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Komala extends Pokemon {

    public Komala(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(65, 115, 65, 75, 95, 65);

        RockSlide rockSlide = new RockSlide(75, 90);
        ConfuseRay confuseRay = new ConfuseRay(0, 100);
        ShellSmash shellSmash = new ShellSmash(0, 0);
        Swift swift = new Swift(60, Math.pow(10, 10));  // equal infinity

        super.setMove(rockSlide, confuseRay, shellSmash, swift);
    }
}
