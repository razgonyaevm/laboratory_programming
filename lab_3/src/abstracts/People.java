package lab3.abstracts;
import lab3.Pair;
import lab3.enums.Moods;
import lab3.enums.Classes;
import lab3.messenger.Mail;
import java.util.ArrayList;

public abstract class People {
    private String name;
    private Moods mood;
    private Classes classes;
    private ArrayList<Pair<String, People>> messages_to = new ArrayList<>();
    private ArrayList<Pair<String, People>> messages_from = new ArrayList<>();
    private ArrayList<Clothes> clothes = new ArrayList<>();
    private ArrayList<Cars> cars = new ArrayList<>();

    abstract public void say(String text);
    public void sendMessage(String text, People people_to) {
        Mail mail = new Mail(this, people_to);
        mail.sendMessage(text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Moods getMood() {
        return mood;
    }

    public void setMood(Moods mood) {
        this.mood = mood;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getMessages() {
        String result = "\nСообщения для " + name + ":\n";
        if (messages_to.isEmpty()) {
            result += "Сообщений нет\n";
        } else {
            for (Pair<String, People> message : messages_to) {
                result += message.x() + " от " + message.y().getName() + "\n";
            }
        }

        result += "Сообщения от " + name + ":\n";
        if (messages_from.isEmpty()) {
            result += "Сообщений нет";
        }
        for (Pair<String, People> message: messages_from) {
            result += message.x() + " к " + message.y().getName() + "\n";
        }
        return result + "\n";
    }

    public void addMessage_to(String message, People people) {
        messages_to.add(new Pair(message, people));
    }

    public void addMessage_from(String message, People people) {
        messages_from.add(new Pair(message, people));
    }

    public void addClothes(Clothes thing) {
        this.clothes.add(thing);
    }

    public void removeClothes(Clothes thing) {
        this.clothes.remove(thing);
    }

    public String getClothes() {
        String result = "Вещи " + name + ":\n";
        if (clothes.isEmpty()) {
            result += "Вещей нет\n";
        } else {
            for (Clothes thing: clothes) {
                result += thing.getColor() + " " + thing.getModel() + "\n";
            }
        }
        return result;
    }

    public void addCar(Cars car) {
        this.cars.add(car);
    }

    public String getCars() {
        String result = "Автомобили " + name + ":\n";
        for (Cars car: cars) {
            result += car.getColor() + " " + car.getModel() + "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return classes + " " + name + ". Его настроение: " + mood;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final People other = (People) obj;
        if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.mood != other.mood) {
            return false;
        }
        if (this.classes != other.classes) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.name.hashCode();
        hash = 53 * hash + this.mood.hashCode();
        hash = 53 * hash + this.classes.hashCode();
        return hash;
    }
}
