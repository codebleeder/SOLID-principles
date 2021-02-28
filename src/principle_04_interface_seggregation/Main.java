package principle_04_interface_seggregation;

class Main {
    public static void main(String[] args) {
        ProfessionalBearKeeper bearKeeper = new ProfessionalBearKeeper();
        ZooGuest guest = new ZooGuest();
        bearKeeper.petTheBear();
        bearKeeper.washTheBear();
        guest.feedTheBear();
    }
}
