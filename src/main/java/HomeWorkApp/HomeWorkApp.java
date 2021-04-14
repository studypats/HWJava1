package HomeWorkApp;


public class HomeWorkApp {


    public static void main(String[] args) {

       AnimalFactory factory=new AnimalFactory();

       Dog dog1=factory.newDog();
       dog1.run(100);
       dog1.run(0);
       dog1.run(-100);
       dog1.run(-600);
       dog1.swim(5);
       Cat cat1=factory.newCat();
       cat1.run(100);
       cat1.run(0);
       cat1.run(-100);
       cat1.run(300);
       cat1.swim(32);

       System.out.println("Всего животных создано "+factory.getAnimalCounter());
       System.out.println("Кошек создано "+factory.getCatCounter());
       System.out.println("Собак создано "+factory.getDogCounter());
    }


}
