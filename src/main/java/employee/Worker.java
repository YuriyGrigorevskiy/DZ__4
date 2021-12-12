package employee;

import animals.Animal;
import animals.Fish;
import animals.Herbivore;
import animals.Voice;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public void getVoice(Voice animal){
            System.out.println(animal.getVoice());
    }

    public void getVoice(Fish animal){
        System.exit(1);
    }
}
