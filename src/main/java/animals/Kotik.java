package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Kotik extends Carnivorous implements Run, Voice{
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private final static int METHODS = 5;

    public Kotik() {
        count++;
    }


    public Kotik(String name, String voice, int satiety, int weight) {
        this();
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public boolean play() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean sleep() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean wash() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean walk() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public boolean hunt() {
        if (satiety == 0) {
            return false;
        } else {
            satiety--;
            return true;
        }
    }

    public void eat(int satiety) {
         this.satiety=satiety;
    }

    private String nameOfFood;

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public void eat(int satiety, String nameOfFood) {
        System.out.println(nameOfFood);
         this.satiety=satiety;
    }

    public void eat() {
        eat(satiety, nameOfFood);
    }


    public static String[] result = new String[24];

    public String[] liveAnotherDay() {
        for (int i = 0; i <= 23; i++) {
            int random = (int)(Math.random() * METHODS + 1);
            switch (random) {
                case 1:
                    if (play()) result[i]= (i +"-"+" играет");
                    else { result[i]= (i +"-"+ "ест"); eat(5);}
                    break;
                case 2:
                    if (sleep()) {result[i]= (i +"-"+ "спит");}
                    else { result[i]= (i +"-"+ "ест"); eat(5);}
                break;
                case 3:
                    if (wash()){result[i]= (i +"-"+ "моется");}
                   else{result[i]= (i +"-"+ "ест"); eat(5);}
                    break;
                case 4:
                    if (walk()){result[i]= (i +"-"+ "бегает");}
                    else {result[i]= (i +"-"+ "ест"); eat(5);}
                    break;
                case 5:
                    if (hunt()){result[i]= (i +"-"+ "охотится");}
                    else {result[i]= (i +"-"+ "ест"); eat(5);}
                    break;
            }
        }
        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
     return "мяу-мяу";
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Kotik.count = count;
    }

    @Override
    public void run() {
        System.out.println("Котик бегает");
    }

    @Override
    public int eat(Food food) {
        if (food instanceof Meat){
            satiety = food.getEnergy();
            System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
        }else if (food instanceof Grass){
            System.out.println("Животное голодное");
        }
        return satiety;
    }
}