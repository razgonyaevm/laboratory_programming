package mymoves.blissey;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SoftBoiled extends StatusMove {
    private final int health;

    public SoftBoiled(double pow, double acc, int health) {
        super(Type.NORMAL, pow, acc);
        this.health = health;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        p.setMod(Stat.HP, this.health / 2);  // Здоровье должно быть целочисленным
    }

    @Override // Указываем на то, что мы переопределяем класс
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "атакует методом " + pieces[pieces.length - 1];
    }
}
