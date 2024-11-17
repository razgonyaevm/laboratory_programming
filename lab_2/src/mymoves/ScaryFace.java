package mymoves.flareon;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class ScaryFace extends StatusMove {
    public ScaryFace(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPEED, -2);

        p.addEffect(e);
    }


    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
