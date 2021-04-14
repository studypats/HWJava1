package HomeWorkApp;

public class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    Animal(String name, int maxRunDistance,int maxSwimDistance){
        this.name=name;
        this.maxRunDistance=maxRunDistance;
        this.maxSwimDistance=maxSwimDistance;

    }



    protected void run(int distance){
        distance=Math.abs(distance);
        if (distance==0) System.out.println(name+" осталась на месте");
        else {
            if ((distance > 0) && (distance <= maxRunDistance))
                System.out.println(name + " пробежала " + distance + " метров");
            else System.out.println(name+" может пробежать только "+maxRunDistance+" метров ");
        }
    }

    protected void swim(int distance) {
        distance=Math.abs(distance);
        if (distance==0) System.out.println(name+" осталась на месте");
        else {
            if ((distance > 0) && (distance <= maxSwimDistance))
                System.out.println(name + " проплыла " + distance + " метров");
            else System.out.println(name+" может проплыть только "+maxSwimDistance+" метров ");
        }
    }
}
