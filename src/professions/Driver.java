package professions;

public class Driver extends Person {

    public Driver(String name, String secondName, String lastName, int experienceYears) {
        super(name, secondName, lastName, experienceYears);
    }

    public Driver(String dateOfBirth) {
        super(dateOfBirth);
    }
}
