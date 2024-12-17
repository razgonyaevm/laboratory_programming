package lab3.cars;

import lab3.abstracts.Cars;
import lab3.abstracts.People;
import lab3.interfaces.Driving;
import java.util.ArrayList;

public final class AstonMartin extends Cars implements Driving {
    private People owner;
    private ArrayList<People> passengers = new ArrayList<People>();

    public AstonMartin(String color, People owner) {
        super.setColor(color);
        super.setCylinders(8);
        super.setModel("Aston Martin");
        to_people(owner);
    }

    @Override
    public void to_people(People people) {
        people.addCar(this);
        this.owner = people;
    }

    @Override
    public void drive() {
        System.out.println("Aston Martin начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Aston Martin остановился");
    }

    @Override
    public People getOwner() {
        return owner;
    }

    @Override
    public void addPassenger(People people) {
        if (passengers.size() < 5) {
            passengers.add(people);
            System.out.println(people.getName() + " сел в Aston Martin");
        } else {
            System.out.println("Невозможно сесть в Aston Martin. Свободных мест нет.");
        }
    }

    @Override
    public void removePassenger(People people) {
        if (passengers.contains(people)) {
            passengers.remove(people);
            System.out.println(people.getName() + " вышел из Aston Martin");
        } else {
            System.out.println("В Aston Martin нет такого пассажира");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " принадлежащий " + owner.getName() + ".";
    }
}
