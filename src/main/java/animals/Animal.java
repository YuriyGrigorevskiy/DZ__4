package animals;

import food.Food;

public abstract class Animal implements Fly,Run,Swim,Voice {

    private int satiety;

    public abstract int eat(Food food);

    public int getSatiety() {
        return 0;
    }

}
