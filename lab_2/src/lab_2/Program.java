package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

    // https://pokemondb.net/pokedex/komala
    // https://pokemondb.net/pokedex/eevee
    // https://pokemondb.net/pokedex/flareon
    // https://pokemondb.net/pokedex/happiny
    // https://pokemondb.net/pokedex/chansey
    // https://pokemondb.net/pokedex/blissey


    public static void main(String[] args) {
        Battle b = new Battle();
        Komala komala = new Komala("Twix", 1);
        Eevee eevee = new Eevee("Meow", 1);
        Flareon flareon = new Flareon("Flareon", 1);
        Happiny happiny = new Happiny("Happiny", 1);
        Chansey chansey = new Chansey("Chansey", 1);
        Blissey blissey = new Blissey("Blissey", 1);

        b.addAlly(komala);
        b.addAlly(eevee);
        b.addAlly(flareon);
        b.addFoe(happiny);
        b.addFoe(chansey);
        b.addFoe(blissey);
        b.go();
    }

    public static boolean chance(double d) {
        return d > Math.random();
    }
}
