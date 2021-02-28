package principle_04_interface_seggregation;

public class ZooGuest implements BearFeeder {
    public void feedTheBear(){
        System.out.println("zoo guest: feeding the bear");
    }
}
