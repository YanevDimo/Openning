package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Person> roster;
    private final String name;
    private final int capacity;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        roster = new ArrayList<>();
    }

    public void add(Person person) {
        if (capacity > roster.size()) {
            roster.add(person);
        }
    }


    public int getCount() {
        return roster.size();
    }

    public boolean remove(String name) {
        return roster.removeIf(person -> person.getName().equals(name));
    }

    public Person getPerson(String name, String hometown) {
        return roster.stream().filter(person -> person.getName().equals(name)
                && person.getHometown().equals(hometown)).findFirst().orElse(null);
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the hotel %s are:%n", name));
        for (Person person : this.roster) {
            sb.append(person.toString())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
        // StringBuilder builder = new StringBuilder(String.format("The people in the hotel %s are:%n", this.name));
        //        this.roster.forEach(e -> builder.append(e).append(System.lineSeparator()));
        //        return builder.toString().trim();
    }
}
