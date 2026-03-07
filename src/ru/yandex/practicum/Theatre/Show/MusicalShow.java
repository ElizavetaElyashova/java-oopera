package ru.yandex.practicum.Theatre.Show;

import ru.yandex.practicum.Theatre.Person.Director;
import ru.yandex.practicum.Theatre.Person.MusicAuthor;

import java.util.Objects;

public class MusicalShow extends Show {
    private final MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthor, that.musicAuthor) && Objects.equals(librettoText, that.librettoText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), musicAuthor, librettoText);
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто \"" + getTitle() + "\":");
        System.out.println(librettoText);
    }
}
