package principle_04_interface_seggregation;

public class ProfessionalBearKeeper implements BearCleaner, BearFeeder, BearPetter {
    public void washTheBear(){
        System.out.println("professional bear keeper: washing the Bear");
    }

    public void feedTheBear(){
        System.out.println("professional bear keeper: feed the Bear");
    }

    public void petTheBear(){
        System.out.println("professional bear keeper: pet the Bear");
    }
}
