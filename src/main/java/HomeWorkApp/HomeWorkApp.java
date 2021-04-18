package HomeWorkApp;


public class HomeWorkApp {


    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Мурзик",5,false),
                new Cat("Бурзик",10,false),
                new Cat("Зурзик",10,true),
                new Cat("Шурзик",10,false)
        };

        Plate plate = new Plate(15);
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate);
        }

        plate.increaseFood(25);
        System.out.println("в тарелку добавлена еда");
        plate.info();

        for (Cat cat: cats) {
            cat.eat(plate);
        }
    }
}
