package mypokemons;

import mymoves.blissey.SoftBoiled;
import mymoves.chansey.SeismicToss;
import mymoves.eevee.WorkUp;
import mymoves.happiny.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Blissey extends Pokemon {
    public Blissey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(255, 10, 10, 75, 135, 55);

        Psychic psychic = new Psychic(90, 100);
        WorkUp workUp = new WorkUp(0, 0);
        SeismicToss seismicToss = new SeismicToss(0, 100);
        SoftBoiled softBoiled = new SoftBoiled(0, 0, 255);

        super.setMove(psychic, workUp, seismicToss, softBoiled);
    }
}
