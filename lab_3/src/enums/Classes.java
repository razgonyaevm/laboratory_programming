package lab3.enums;

public enum Classes {
    JACKASS ("Осёл"),
    FOOL ("Дурак"),
    SIMPLE ("Обычный"),
    SMART ("Умный"),
    ELIT ("Элитa"),
    KING ("Король"),
    GOD ("Бог");

    private String title;

    Classes(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
