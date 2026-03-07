package ru.yandex.practicum.Theatre.Show;

import ru.yandex.practicum.Theatre.Person.Director;
import ru.yandex.practicum.Theatre.Person.MusicAuthor;

import java.util.Objects;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText,
                 int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Opera opera = (Opera) o;
        return choirSize == opera.choirSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choirSize);
    }

    @Override
    public String toString() {
        return "Опера: \"" + getTitle() + "\"\n" + getDirector() + "\n" + getMusicAuthor()
                + "\nДлительность: " + getDuration() + "мин.";
    }
}
