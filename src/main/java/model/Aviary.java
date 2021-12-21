package model;
import animals.Animal;
import animals.Carnivorous;

import java.util.HashMap;

public class Aviary <T extends Animal> {
    private Size size;
    public Size getSize() {
        return size;
    }

    public Aviary(Size size){
        this.size=size;
    }

    private HashMap <String, T > aviaryMap = new HashMap<>();

    public void addAnimal(T animal)  {
            if(size.equals(animal.getSize())){
                aviaryMap.put(animal.getName(),animal);}
            else {
                throw new WrongSizeException("WrongFoodException");}
    }

    public T getAnimal(String name){
        T animal = aviaryMap.get(name);
        System.out.println(animal);
        return animal;
    }

    public boolean removeAnimal(String name){
        if (aviaryMap.containsKey(name)){
            aviaryMap.remove(name);
            return true;
        }else{
            return false;
        }
    }
}