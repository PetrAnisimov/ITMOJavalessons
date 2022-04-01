package Kursovaya;

import java.time.LocalDate;

public class User {
    LocalDate startDate = LocalDate.now();
    private String name;
    private String surname;
    private int yearOfBirthday;

    public User(String name, String surname, int yearOfBirthday) {
        setName(name);
        setSurname(surname);
        setYearOfBirthday(yearOfBirthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length()<2) throw new IllegalArgumentException("name" +
                " не должен быть пусто или меньше 2");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.length()<2) throw new IllegalArgumentException("surname" +
                " не должен быть пусто или меньше 2");
        this.surname = surname;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }
}
