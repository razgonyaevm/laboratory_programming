package lab3.abstracts;

public abstract class Cars {
    private String model;
    private int cylinders;
    private String color;

    public abstract void to_people(People people);
    public abstract People getOwner();
    public abstract void addPassenger(People people);
    public abstract void removePassenger(People people);


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return cylinders + "-цилиндровый " + color + " " + model;
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
        final Cars other = (Cars) obj;
        if (this.cylinders != other.cylinders) {
            return false;
        }
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
        hash = 53 * hash + this.cylinders;
        hash = 53 * hash + this.model.hashCode();
        hash = 53 * hash + this.color.hashCode();
        return hash;
    }
}
