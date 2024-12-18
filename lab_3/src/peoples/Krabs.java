package lab3.peoples;

import lab3.abstracts.People;
import lab3.enums.Classes;
import lab3.enums.Moods;

public final class SimplePeople extends People {
    public SimplePeople(String name, Moods moods, Classes classes) {
        super.setMood(moods);
        super.setClasses(classes);
        super.setName(name);
    }

    @Override
    public void say(String text) {
        System.out.println(super.getName() + " сказал: " + text);
    }
}
