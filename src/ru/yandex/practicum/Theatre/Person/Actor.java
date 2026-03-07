package ru.yandex.practicum.Theatre.Person;

import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(super.getName(), actor.getName()) &&
                Objects.equals(super.getSurname(), actor.getSurname()) &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        if (getGender() == Gender.FEMALE) {
            return "Актриса: " + getName() + " " + getSurname() + " (" + height + ")";
        } else {
            return "Актер: " + getName() + " " + getSurname() + " (" + height + ")";
        }
    }
}
