package HomeWorkApp;

public class AnimalFactory {

    private int animalCounter;
    private int dogCounter;
    private int catCounter;

    public AnimalFactory () {
        animalCounter=0;
        dogCounter=0;
        catCounter=0;
    }

    public Cat newCat(){
        Cat cat=new Cat();
        animalCounter++;
        catCounter++;
        return cat;
    }

    public Dog newDog(){
        Dog dog=new Dog();
        animalCounter++;
        dogCounter++;
        return dog;
    }

    public int getAnimalCounter() {return animalCounter;}
    public int getCatCounter() {return  catCounter;}
    public int getDogCounter() {return dogCounter;}
}
