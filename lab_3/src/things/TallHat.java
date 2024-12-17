package lab3.things;

import lab3.abstracts.Clothes;
import lab3.abstracts.People;
import lab3.exceptions.RemovingException;

public final class TallHat extends Clothes {
    private People owner = null;

    public TallHat() {
        super.setColor("Черный");
        super.setModel("Цилиндр");
    }

    @Override
    public void wear(People people) {
        if (owner != null) {
            try {
                this.remove();
                this.wear(people);
            } catch (RemovingException e) {
                System.out.println(e.getMessage());
            }
        } else {
            people.addClothes(this);
            owner = people;
            System.out.println(people.getName() + " надел цилиндр");
        }
    }

    @Override
    public void remove() throws RemovingException {
        if (owner != null) {
            owner.removeClothes(this);
            System.out.println(owner.getName() + " снял цилиндр");
            owner = null;
        } else {
            throw new RemovingException("Цилиндр невозможно снять, потому что он никому не принадлежит");
        }
    }
}
