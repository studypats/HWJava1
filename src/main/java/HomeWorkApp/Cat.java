package HomeWorkApp;

public class Cat extends Animal{

    Cat(){
        super("Кошка",200,0);
    }

    @Override
    protected  void swim (int distance){
        System.out.println("Кошка не будет плавать");
    }
}
