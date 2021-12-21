package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal  {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public int eat(Food food) throws WrongFoodException {
            if(food instanceof Grass){
                return 0;
            }
            else{
                throw new WrongFoodException("WrongFoodException");
            }
    }
}
