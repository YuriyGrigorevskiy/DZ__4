package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;
import java.io.IOException;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name){this.name=name;}

    public abstract Size getSize();

    private int satiety;

    public abstract int eat(Food food) throws  WrongFoodException;

    public int getSatiety() {
        return 0;
    }

}
