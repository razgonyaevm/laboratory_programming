package mypokemons;

import mymoves.eevee.Confide;
import mymoves.eevee.Tackle;
import mymoves.eevee.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Eevee extends Pokemon {
    public Eevee(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(55, 55, 50, 45, 65, 55);

        WorkUp workUp = new WorkUp(0, 0);
        Confide confide = new Confide(0, 0);
        Tackle tackle = new Tackle(40, 100);

        super.setMove(workUp, confide, tackle);
    }
}
