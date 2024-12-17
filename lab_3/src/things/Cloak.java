package lab3.things;

import lab3.abstracts.Clothes;
import lab3.abstracts.People;
import lab3.exceptions.RemovingException;

public final class Cloak extends Clothes {
    private People owner = null;

    public Cloak() {
        super.setColor("Серый");
        super.setModel("Плащ");
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
            System.out.println(people.getName() + " надел плащ");
        }
    }

    @Override
    public void remove() throws RemovingException {
        if (owner != null) {
            owner.removeClothes(this);
            System.out.println(owner.getName() + " снял плащ");
            owner = null;
        } else {
            throw new RemovingException("Плащ невозможно снять, потому что он никому не принадлежит");
        }
    }
}
