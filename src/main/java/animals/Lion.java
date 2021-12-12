package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Lion extends Carnivorous implements Run,Voice,Swim{
    private int satiety;

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

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            satiety = food.getEnetgy();
            System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
        }else if (food instanceof Grass){
            System.out.println("Животное голодное");
        }
        return satiety;
    }
}
