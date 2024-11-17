package mypokemons;

import mymoves.eevee.WorkUp;
import mymoves.happiny.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(100, 5, 5, 15, 65, 30);

        Psychic psychic = new Psychic(90, 100);
        WorkUp workUp = new WorkUp(0, 0);

        super.setMove(psychic, workUp);
    }
}
