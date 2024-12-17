package lab3.abstracts;

import lab3.exceptions.RemovingException;

public abstract class Clothes {
    private String model;
    private String color;

    public abstract void wear(People people);
    public abstract void remove() throws RemovingException;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return color + " " + model;
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
        final Clothes other = (Clothes) obj;
        if (!this.model.equals(other.model)) {
            return false;
        }
        if (!this.color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.model.hashCode();
        hash = 53 * hash + this.color.hashCode();
        return hash;
    }
}
