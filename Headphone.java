public class Headphone extends MusicEquipment{

    private boolean wireless;


    public Headphone(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String strength) {
        super(name, type, price, offer, color, manufacturer, strength);
    }


    public Headphone(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String strength, boolean wireless) {
        super(name, type, price, offer, color, manufacturer, strength);
        this.wireless = wireless;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
