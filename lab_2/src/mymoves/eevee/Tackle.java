package mymoves.eevee;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class Tackle extends PhysicalMove {
    public Tackle(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }


    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
