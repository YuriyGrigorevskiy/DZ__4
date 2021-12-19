package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

public class Duck extends Herbivore implements Swim,Fly,Voice,Run {
    private int satiety;

    public Duck(String name) {
        super(name);
    }

    public int getSatiety() {
        return satiety;
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getVoice() {
        return "кря-кря";
    }


    public Size getSize() {
        return Size.SMALL;
    }

    @Override
    public int eat(Food food) {
        try{
        if (food instanceof Meat){
            System.out.println("животное голодное");
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
