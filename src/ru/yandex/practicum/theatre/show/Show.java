package ru.yandex.practicum.theatre.show;

import ru.yandex.practicum.theatre.person.Actor;
import ru.yandex.practicum.theatre.person.Director;

import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.director.setNumberOfShows(director.getNumberOfShows() + 1);
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration && Objects.equals(title, show.title) && Objects.equals(director, show.director)
                && Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, director, listOfActors);
    }

    @Override
    public String toString() {
        String result = "Спектакль: " +
                "\"" + title + "\"\n" + director + "\n" + "Длительность: " + duration +
                " мин.\n" + "Количество актеров: ";
        if (listOfActors != null) {
            result = result + listOfActors.size() + ".";
        } else {
            result = result + "0.";
        }
        return result;
    }

    //выводит список всех актеров, участвующих в постановке
    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    //добавляет нового актера в список
    public void addNewActor(Actor newActor) {
        if (newActor == null) {
            return;
        } else {
            boolean check = false;
            //проверяем, есть ли такой актер уже в списке
            for (Actor actor : listOfActors) {
                if (newActor.equals(actor)) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Такой актер уже есть в списке.");
            } else {
                listOfActors.add(newActor);
                System.out.println(newActor + " успешно добавлен в список.");
            }
        }
    }

    //заменяет актера из списка на нового актера
    public void replaceActor(Actor newActor, String surname) {
        if (newActor == null || surname == null) {
            return;
        } else {
            //проверяем, есть ли актер с фамилией surname в списке
            for (int i = 0; i < listOfActors.size(); i++) {
                if (surname.equals(listOfActors.get(i).getSurname())) {
                    listOfActors.remove(i);
                    listOfActors.add(i, newActor);
                    System.out.println("Замена " + surname + " на " + newActor.getSurname() + " выполнена.");
                    return;
                }
            }
            System.out.println(surname + " в списке актеров отсутствует.");
        }
    }
}
