package groomingSalon;

import java.awt.image.TileObserver;
import java.io.StringReader;

public class Pet {
    private String name;
    private int age;
    private  String owner;

    public Pet(String owner, int age, String name) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)",this.owner,this.age,this.name);
    }
}
