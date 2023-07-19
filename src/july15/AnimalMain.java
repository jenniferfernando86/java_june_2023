package july15;

public class AnimalMain {
    public static void main(String[] args) {
        System.out.println("Learning about Animals \n");

        Animal lion = new Animal();
        lion.hunt("lion","deer");
        lion.sleep("lion", 12);
        lion.sound("lion", "roar");

        Animal dog = new Animal();
        dog.hunt("dog", "bone");
        dog.sleep("dog", 6);
        dog.sound("dog", "bark");

        Animal cat = new Animal();
        cat.hunt("cat","rat");
        cat.sleep("cat", 3);
        cat.sound("cat","meow");

    }

}
