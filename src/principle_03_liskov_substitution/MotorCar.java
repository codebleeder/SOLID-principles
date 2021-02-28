package principle_03_liskov_substitution;

public class MotorCar implements Car, Engine {
    private boolean engineOn;

    public MotorCar() {
        engineOn = false;
    }

    public void startEngine(){
        engineOn = true;
        System.out.println("motor car started");
    }

    public void accelerate(){
        if (engineOn) {
            System.out.println("accelerated motorcar by 10 kmph");
        }
        else {
            System.out.println("please start the engine");
        }
    }
}
