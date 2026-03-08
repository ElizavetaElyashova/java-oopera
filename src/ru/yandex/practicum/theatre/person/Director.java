package ru.yandex.practicum.theatre.person;

import java.util.Objects;

public class Director extends Person {
    private int numberOfShows = 0;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Режиссер: " + super.getName() + " " + super.getSurname();
    }
}
