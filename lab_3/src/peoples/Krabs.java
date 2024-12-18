package lab3.peoples;

import lab3.abstracts.People;
import lab3.enums.Classes;
import lab3.enums.Moods;

public final class Skuperfild extends People {
    public Skuperfild(Moods mood, Classes classes) {
        super.setName("Скуперфильд");
        super.setMood(mood);
        super.setClasses(classes);
    }

    @Override
    public void say(String text) {
        System.out.println("Скуперфильд сказал: " + text);
    }
}
