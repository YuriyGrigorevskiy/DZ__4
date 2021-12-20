package employee;

import animals.Animal;
import animals.Fish;
import animals.Herbivore;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

import java.io.IOException;

public class Worker {

    public void feed(Animal animal, Food food) throws Exception {
        animal.eat(food);
    }

    public void getVoice(Voice animal){
            System.out.println(animal.getVoice());
    }
}
