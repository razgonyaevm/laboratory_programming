package mymoves.eevee;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public final class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect e1 = new Effect().stat(Stat.ATTACK, 1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);

        p.addEffect(e1);
        p.addEffect(e2);
    }

    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
