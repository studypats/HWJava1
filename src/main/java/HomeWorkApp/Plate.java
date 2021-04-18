package HomeWorkApp;

public class Plate {

    protected int food;

    public Plate (int food) {
        this.food = food;
    }

    public void info () {
        System.out.println("plate: " + food);
    }

    public void decreaseFood (int appetite) {
        if (food>=appetite) food -= appetite;
        else System.out.println("В тарелке недостаточно еды");
    }

    public void increaseFood (int addition) {
        food += addition;
    }

}
