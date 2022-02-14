package professions;

public class Person {
    protected String name;
    protected String secondName;
    protected String lastName;
    protected int experienceYears;

    public Person(String name, String secondName, String lastName, int experienceYears) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.experienceYears = experienceYears;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
