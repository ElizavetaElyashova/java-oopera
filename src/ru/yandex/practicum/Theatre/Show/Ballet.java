package ru.yandex.practicum.Theatre.Show;

import ru.yandex.practicum.Theatre.Person.Choreographer;
import ru.yandex.practicum.Theatre.Person.Director;
import ru.yandex.practicum.Theatre.Person.MusicAuthor;

import java.util.Objects;

public class Ballet extends MusicalShow {
    private final Choreographer choreographer;

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor,
                  String librettoText, Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ballet ballet = (Ballet) o;
        return Objects.equals(choreographer, ballet.choreographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choreographer);
    }

    @Override
    public String toString() {
        return "Балет: \"" + getTitle() + "\"\n" + getDirector() + "\n" + getMusicAuthor()
                + "\n" + choreographer + "\nДлительность: " + getDuration() + " мин.";
    }
}
