package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Duck extends Herbivore implements Swim,Fly,Voice {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getVoice() {
        return "кря-кря";
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
