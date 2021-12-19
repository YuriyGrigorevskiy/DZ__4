package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Lion extends Carnivorous implements Run,Voice,Swim{
    private int satiety;

    public Lion(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Лев бегает");
    }

    @Override
    public String getVoice() { return "Ррррр";
    }

    public Size getSize() {
        return Size.LARGE;
    }

    @Override
    public int eat(Food food) {
        try {
            if (food instanceof Meat){
                satiety = food.getEnergy();
                System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
            }
            else if (food instanceof Grass){
                System.out.println("Животное голодное");
                throw new WrongFoodException("WrongFoodException");}
        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }

    @Override
    public void swim() {

    }
}
