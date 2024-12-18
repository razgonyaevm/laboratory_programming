package lab3;

import lab3.cars.AstonMartin;
import lab3.exceptions.RemovingException;
import lab3.peoples.Krabs;
import lab3.peoples.SimplePeople;
import lab3.peoples.Skuperfild;
import lab3.enums.Moods;
import lab3.enums.Classes;
import lab3.things.Cloak;
import lab3.things.TallHat;

public class Program {
    public static void main(String[] args) {
        Skuperfild skuperfild = new Skuperfild(Moods.GOOD, Classes.SIMPLE);
        System.out.println(skuperfild);
        Krabs krabs = new Krabs(Moods.NORMAL, Classes.SIMPLE);
        SimplePeople simplePeople = new SimplePeople("Какой-то парень", Moods.NORMAL, Classes.FOOL);
        krabs.sendMessage("С ослами пора кончать. В городе появился брехенвильский скупец Скуперфильд. За последствия не отвечаю.", simplePeople);

        TallHat tallHat = new TallHat();
        Cloak cloak_skuperfild = new Cloak();
        Cloak cloak_simplePeople = new Cloak();
        cloak_skuperfild.wear(skuperfild);
        cloak_simplePeople.wear(simplePeople);
        tallHat.wear(skuperfild);

        AstonMartin astonMartin = new AstonMartin("Черный", krabs);
        System.out.println(astonMartin);

        astonMartin.addPassenger(skuperfild);
        astonMartin.addPassenger(simplePeople);
        astonMartin.drive();
        skuperfild.setMood(Moods.GREAT);
        astonMartin.stop();
        astonMartin.removePassenger(skuperfild);
        astonMartin.removePassenger(simplePeople);

        skuperfild.say("Я рад тому, что бесплатно прокатился на шикарной машине и вдобавок пообедаю на даровщинку, не говоря уже о том, что предстоит возможность обтяпать, как говорится, выгодное дельце");
        System.out.println(skuperfild);

        try {
            tallHat.remove();
            tallHat.remove();
        } catch (RemovingException e) {
            System.out.println(e.getMessage());
        }
    }
}
