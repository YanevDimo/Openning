package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public void add(Pet pet) {
        if (capacity > data.size()) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)){
                data.remove(pet);
                return true;
            }

}
        return false;
                }

public Pet getPet(String name,String owner){
        Pet currentPet=null;
        for(Pet pet:this.data){
        if(pet.getName().equals(name)&&pet.getOwner().equals(owner)){
        currentPet=pet;
        }
        }
        return currentPet;
        }

public int getCount(){
        return this.data.size();
        }

public String getStatistics(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("The grooming salon has the following clients:%n");
        for(Pet pet:data){
        stringBuilder.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }
        return stringBuilder.toString().trim();

        }
        }
