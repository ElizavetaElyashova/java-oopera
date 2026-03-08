package ru.yandex.practicum.theatre;

import ru.yandex.practicum.theatre.person.*;
import ru.yandex.practicum.theatre.show.Ballet;
import ru.yandex.practicum.theatre.show.Opera;
import ru.yandex.practicum.theatre.show.Show;

public class Theatre {
    public static void main(String[] args) {
        Actor ivanovV = new Actor("Василий", "Иванов", Gender.MALE, 186);
        Actor chernovaA = new Actor("Анастасия", "Чернова", Gender.FEMALE, 175);
        Actor menshikovO = new Actor("Олег", "Меньшиков", Gender.MALE, 174);
        Director smirnovaA = new Director("Авдотья", "Смирнова", Gender.FEMALE);
        Director dodinL = new Director("Лев", "Додин", Gender.MALE);
        MusicAuthor bizeG = new MusicAuthor("Жорж", "Бизе", Gender.MALE);
        Choreographer petrovaN = new Choreographer("Наталья", "Петрова", Gender.FEMALE);

        Show oldestSon = new Show("Старший сын", 120, dodinL);
        Opera karmen = new Opera("Кармен", 190, smirnovaA, bizeG, "У любви нравы дикой птицы", 20);
        Ballet childGames = new Ballet("Детские игры", 100, dodinL, bizeG, "В балете представлен необычный мир оживших игрушек.", petrovaN);

        //добавили актеров в спектакли
        oldestSon.addNewActor(ivanovV);
        oldestSon.addNewActor(chernovaA);
        karmen.addNewActor(chernovaA);
        childGames.addNewActor(ivanovV);
        childGames.addNewActor(chernovaA);
        childGames.addNewActor(menshikovO);
        System.out.println();
        //выводим списки актеров в спектаклях
        System.out.println("Список актеров спектакля \"" + oldestSon.getTitle() + "\":");
        oldestSon.printActors();
        System.out.println("Список актеров оперы \"" + karmen.getTitle() + "\":");
        karmen.printActors();
        System.out.println("Список актеров балета \"" + childGames.getTitle() + "\":");
        childGames.printActors();
        System.out.println();
        //меняем актера в спектакле
        oldestSon.replaceActor(menshikovO, "Иванов");
        System.out.println("Список актеров спектакля \"" + oldestSon.getTitle() + "\":");
        oldestSon.printActors();
        System.out.println();
        childGames.replaceActor(chernovaA, "Светлова");
        System.out.println();
        //Выводим либретто
        karmen.printLibrettoText();
        childGames.printLibrettoText();
    }
}
