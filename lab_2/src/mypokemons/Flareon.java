package mypokemons;

import mymoves.eevee.Confide;
import mymoves.flareon.ScaryFace;
import mymoves.eevee.Tackle;
import mymoves.eevee.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Flareon extends Pokemon {
    public Flareon(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(65, 130, 60, 95, 110, 65);

        WorkUp workUp = new WorkUp(0, 0);
        Confide confide = new Confide(0, 0);
        Tackle tackle = new Tackle(40, 100);
        ScaryFace scaryFace = new ScaryFace(0, 100);

        super.setMove(workUp, confide, tackle, scaryFace);
    }
}
