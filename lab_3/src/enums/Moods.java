package lab3.enums;

public enum Moods {
    DELIGHTFUL ("восхитительное"),
    FANTASTIC ("фантастическое"),
    GREAT ("отличное"),
    GOOD ("хорошее"),
    NORMAL ("нормальное"),
    SAD ("грустное"),
    TERRIBLE ("ужасное");

    private String title;

    Moods(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " настроение";
    }
}
