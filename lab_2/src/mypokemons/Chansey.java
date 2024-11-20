package mypokemons;

import mymoves.chansey.SeismicToss;
import mymoves.eevee.WorkUp;
import mymoves.happiny.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Chansey extends Pokemon {
    public Chansey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(250, 5, 5, 35, 105, 50);

        Psychic psychic = new Psychic(90, 100);
        WorkUp workUp = new WorkUp(0, 0);
        SeismicToss seismicToss = new SeismicToss(0, 100);

        super.setMove(psychic, workUp, seismicToss);
    }
}
