package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Elephant extends Herbivore implements Run,Voice {
    private int satiety;

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

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            System.out.println("животное голодное");
        }else if (food instanceof Grass){
            satiety = food.getEnergy();
            System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
        }
        return satiety;
    }
}
