package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Elephant extends Herbivore implements Run,Voice {
    private int satiety;


    public Elephant(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Слон бежит");
    }

    @Override
    public String getVoice() {
        return "буууу";
    }

    public Size getSize() {
        return Size.LARGE;
    }

    @Override
    public int eat(Food food) {
        try{
            if (food instanceof Meat){
                throw new WrongFoodException("WrongFoodException");
            }
            else if (food instanceof Grass){
                satiety = food.getEnergy();
                System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
            }}
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }
}
