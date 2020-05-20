package ru.netology.bonus;

public @interface CsvFileSource {
    String[] resources();

    char delimiter();
}
