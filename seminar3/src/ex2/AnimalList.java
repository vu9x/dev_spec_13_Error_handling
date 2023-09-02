package ex2;

import java.util.ArrayList;

public class AnimalList {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) throws AnimalNotFoundException{
        if (!animals.contains(animal)) {
            throw new AnimalNotFoundException("There is no such animal in the list");
        }
        animals.remove(animal);
    }

    public void printAnimals(){
        for (Animal i: animals) {
            System.out.println(i);
        }
    }
}
