package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Tiger extends Carnivorous implements Run,Voice,Swim {
    private int satiety;

    public Tiger(String name) {
        super(name);
    }

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

    public Size getSize() {
        return Size.MEDIUM;
    }

    @Override
    public int eat(Food food) {
        try {
            if (food instanceof Meat){
                satiety = food.getEnergy();
                System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
            }
            else if (food instanceof Grass){
                throw new WrongFoodException("WrongFoodException");}
        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }
}
