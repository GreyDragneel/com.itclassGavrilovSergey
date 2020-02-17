package com.itclass.HomeworkOOP.task1;

public class Main {

    public static void main(String[] args) {

       Violin violin = new Violin("Скрипка", "Пиупиу",
                "На ней играют смычком", "Изобретена в 1577 году");

        Cello cello = new Cello("Виолончель", "Уруру",
                "Очень большая скрипка", "Изобретена в начале 17 века");

       Thrombone thrombone = new Thrombone("Тромбон", "Тудуду",
                "Раздвижная труба", "Изобретен в 15 веке");

        Ukulele ukulele = new Ukulele("Укулеле", "Тррыннь",
                "Маленькая гавайская гитарка", "Изобретено в 1915 году");

        System.out.println(" Играем))");
        violin.sound();
        cello.sound();
        thrombone.sound();
        ukulele.sound();

        System.out.println("Показываем");
        violin.show();
        cello.show();
        thrombone.show();
        ukulele.show();

        System.out.println("История");
        violin.history();
        cello.history();
        thrombone.history();
        ukulele.history();

        System.out.println("Рассказываем o");
        violin.desc();
        cello.desc();
        thrombone.desc();
        ukulele.desc();

    }
}
