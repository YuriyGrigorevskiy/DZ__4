import animals.*;
import model.Aviary;
import model.Size;
import model.WrongSizeException;


public class Zoo {

    public static Swim[] createPond(){
        Swim[] animalSwim = new Swim[3];
        animalSwim[0] = new Duck("утка");
        animalSwim[1] = new Fish("рыба");
        animalSwim[2] = new Tiger("тигр");
        return animalSwim;
    }
    public static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
    public static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.MEDIUM);

    public static void fillCarnivorousAviary()  {
        Kotik kotik = new Kotik("Вася");
        Lion lion = new Lion("Лёва");
        Lion lion1 = new Lion("Лёва2");
        Lion lion2 = new Lion("Лёва3");
        Duck duck = new Duck("Утка");

        carnivorousAviary.addAnimal(lion);
    }

    public static void fillHerbivoreAviary() {
        Kotik kotik = new Kotik("Вася");
        Lion lion = new Lion("Лёва");
        Duck duck = new Duck("Утка");
        Elephant elephant = new Elephant("Слоник");
        Fish fish = new Fish("Рыбка");

        herbivoreAviary.addAnimal(duck);
    }

    public static void getCarnivorous (String name){
        carnivorousAviary.getAnimal(name);
    }

    public static void getHerbivore (String name){
        herbivoreAviary.getAnimal(name);
    }

    public static void main(String[] args) {

          fillCarnivorousAviary();
          getCarnivorous("Лёва");
    }
}
