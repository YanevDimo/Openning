package vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public void add(Pet pet) {
        if (capacity > data.size()) {
            data.add(pet);
        }

    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getOldestPet() {
        Pet oldest = null;
        for (Pet datum : data) {
            if (oldest == null || datum.getAge() > oldest.getAge()) {
                oldest = datum;
            }
        }
        return oldest;
    }

    public Pet getPet(String name, String owner) {
        Pet currentPet = null;
        for (Pet pet : data) {
            if (pet.getName().equals(name) || pet.getOwner().equals(owner)) {
                currentPet = pet;
            }
        }return currentPet;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The clinic has the following patients:")
                .append(System.lineSeparator());
        for (Pet pet : this.data) {
            stringBuilder.append(pet.getName()).append(" ");
            stringBuilder.append(pet.getOwner()).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();
    }
}
