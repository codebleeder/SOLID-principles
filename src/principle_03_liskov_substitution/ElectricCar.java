package principle_03_liskov_substitution;

public class ElectricCar implements Car {
    public void accelerate(){
        System.out.println("electric car accelerated by 10 kmph");
    }
}
