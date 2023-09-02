package ex2;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");
        Animal bird = new Animal("Bird");

        AnimalList list = new AnimalList();
        list.addAnimal(cat);
        list.addAnimal(dog);
        list.addAnimal(bird);

        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }

        list.printAnimals();

        try {
            list.removeAnimal(bird);
        } catch (AnimalNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
