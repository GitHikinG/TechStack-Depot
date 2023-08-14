import java.io.Serializable;

public class Microphone extends MusicEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String operatingPrinciple;

    public Microphone(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String strength) {
        super(name, type, price, offer, color, manufacturer, strength);
    }

    public Microphone(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String strength, String operatingPrinciple) {
        super(name, type, price, offer, color, manufacturer, strength);
        this.operatingPrinciple = operatingPrinciple;
    }


    public String getOperatingPrinciple() {
        return operatingPrinciple;
    }

    public void setOperatingPrinciple(String operatingPrinciple) {
        this.operatingPrinciple = operatingPrinciple;
    }

}
