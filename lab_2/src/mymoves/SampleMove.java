package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class SampleMove extends PhysicalMove {
    public SampleMove(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
    }

    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
