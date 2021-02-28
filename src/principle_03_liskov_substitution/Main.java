package principle_03_liskov_substitution;

class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        MotorCar motorCar = new MotorCar();
        electricCar.accelerate();
        motorCar.startEngine();
        motorCar.accelerate();
    }
}
