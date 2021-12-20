package model;
import animals.Animal;
import java.util.HashMap;

public class Aviary <T extends Animal> {
    public Size size;
    public Size getSize() {
        return size;
    }

    public Aviary(Size size){
        this.size=size;
    }

    public HashMap <String, T > collections = new HashMap<>();

    public void addAnimal(T animal)  {
            if(size.equals(animal.getSize())){
        collections.put(animal.getName(),animal);}
            else {
                throw new WrongSizeException("WrongFoodException");}
    }

    public void getAnimal(String name){
        T animal = collections.get(name);
        System.out.println(animal);
    }

    public boolean removeAnimal(String name){
        if (collections.containsKey(name)){
            collections.remove(name);
            return true;
        }else{
            return false;
        }
    }
}