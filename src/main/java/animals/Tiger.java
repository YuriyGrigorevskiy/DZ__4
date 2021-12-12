package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Tiger extends Carnivorous implements Run,Voice,Swim {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Тигр бегает");
    }

    @Override
    public void swim() {
        System.out.println("Тигр решил поплавать");
    }

    @Override
    public String getVoice() {
        return "рррР - мяу";
    }

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            satiety = food.getEnergy();
            System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
        }else if (food instanceof Grass){
            System.out.println("животное голодное");
        }
        return satiety;
    }
}
