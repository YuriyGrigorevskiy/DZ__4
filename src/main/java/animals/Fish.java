package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Fish extends Herbivore implements Swim {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            System.out.println("животное голодное");
        }else if (food instanceof Grass){
            satiety = food.getEnetgy();
            System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
        }
        return satiety;
    }
}
