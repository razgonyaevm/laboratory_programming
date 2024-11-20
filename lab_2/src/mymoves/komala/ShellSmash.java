package mymoves.komala;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public final class ShellSmash extends StatusMove {
    public ShellSmash(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }


    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect e1 = new Effect().stat(Stat.DEFENSE, -1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        Effect e3 = new Effect().stat(Stat.ATTACK, 2);
        Effect e4 = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
        Effect e5 = new Effect().stat(Stat.SPEED, 2);

        p.addEffect(e1);
        p.addEffect(e2);
        p.addEffect(e3);
        p.addEffect(e4);
        p.addEffect(e5);
    }

    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
