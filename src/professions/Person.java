package professions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    protected String name;
    protected String secondName;
    protected String lastName;
    protected int experienceYears;
    protected String dateOfBirth;

    public Person(String name, String secondName, String lastName, int experienceYears) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.experienceYears = experienceYears;
    }

    public Person(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthdayDate = LocalDate.parse(getDateOfBirth(), formatter);
        Period period = Period.between(birthdayDate, java.time.LocalDate.now());
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experienceYears=" + experienceYears +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
