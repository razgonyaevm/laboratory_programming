package lab3.peoples;

import lab3.abstracts.People;
import lab3.enums.Classes;
import lab3.enums.Moods;

public final class God extends People {
    public God(Classes classes) {
        super.setName("Бог");
        super.setClasses(classes);
    }

    @Override
    public String say(String text) {
        return "И молвил Бог: " + text;
    }
}
