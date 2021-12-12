package animals;

import food.Food;

public abstract class Animal implements Fly,Run,Swim,Voice {

    public abstract int eat(Food food);
}
