package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animal implements Fly,Run,Swim,Voice {

    @Override
    public int eat(Food food) {return 0;
    }

    @Override
    public void fly() {
        System.out.println();
    }

    @Override
    public void run() {
        System.out.println();
    }

    @Override
    public void swim() {
        System.out.println();
    }

    @Override
    public String getVoice() {
        return null;
    }
}
