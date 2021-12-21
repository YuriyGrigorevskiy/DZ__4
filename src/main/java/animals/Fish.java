package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Fish extends Herbivore implements Swim {
    private int satiety;

    public Fish(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }


    public Size getSize() {
        return Size.MEDIUM;
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
