package lab3.peoples;

import lab3.abstracts.People;
import lab3.enums.Classes;
import lab3.enums.Moods;

public final class Krabs extends People {
    public Krabs(Moods mood, Classes classes) {
        super.setName("Крабс");
        super.setMood(mood);
        super.setClasses(classes);
    }

    @Override
    public String say(String text) {
        return "Крабс сказал: " + text;
    }
}
