import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {

    public static Swim[] createPond(){
        Swim[] animalSwim = new Swim[3];
        animalSwim[0] = new Duck();
        animalSwim[1] = new Fish();
        animalSwim[2] = new Tiger();
        return animalSwim;
    }

    public static void main(String[] args){


        Kotik kotik = new Kotik();
        Animal duck = new Duck();
        Fish fish = new Fish();
        Animal lion = new Lion();

        Food grass = new Grass();
        Food meat = new Meat();

        Worker e = new Worker();

        e.feed(kotik,meat);

        e.getVoice(kotik);

        for(Swim a : createPond()){
            a.swim();
        }












    }
}
