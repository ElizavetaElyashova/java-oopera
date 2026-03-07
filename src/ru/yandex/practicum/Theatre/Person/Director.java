package ru.yandex.practicum.Theatre.Person;

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
        Director director = (Director) o;
        return numberOfShows == director.numberOfShows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfShows);
    }

    @Override
    public String toString() {
        return "Режиссер: " + super.getName() + " " + super.getSurname();
    }
}
