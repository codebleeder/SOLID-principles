# Liskov substitution principle

> If it looks like a duck, quacks like a duck, but needs batteries – you probably have the wrong abstraction

For a given code, if classes are replaced by their sub-classes, then there should be no change in behavior of the code. 

Advantage: helps in code reusability

Example:

Suppose you have Car interface:

```
public interface Car {

    void turnOnEngine();
    void accelerate();
}
```

MotorCar implements the above interface:
```
public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
```

The problem here is that an Electric car doesn't have an engine.

Which means the Car abstraction needs to be re-thought. 

The solution is to create a separate interface for Engine. 