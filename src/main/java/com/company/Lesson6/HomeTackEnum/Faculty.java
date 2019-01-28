package com.company.Lesson6.HomeTackEnum;

public enum Faculty {
    FITKI("ФІТКІ" ),
    FETE("ФЕТЕ"),
    FMT("ФМТ");

    private final String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String toString() {
        return facultyName ;
    }
}
