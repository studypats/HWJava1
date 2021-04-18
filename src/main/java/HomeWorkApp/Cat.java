package HomeWorkApp;

public class Cat {

    private String name;
    private int eatAbility;
    private boolean satiety;


    public Cat (String name, int appetite, boolean satiety) {
        this.name = name;
        this.eatAbility = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (satiety) System.out.println("кот "+name+" не голоден и не ест из тарелки");
        else {
            if (plate.food>=eatAbility) {
                System.out.println("кот "+name+" ест из тарелки");
                plate.decreaseFood(eatAbility);
                satiety=true;
            }
            else System.out.println("кот "+name+"  голоден но не ест из тарелки, потому что в тарелке недостаточно еды ");
        }



    }

}
