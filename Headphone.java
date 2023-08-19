import java.io.Serializable;
import java.util.List;

public class Headphone extends MusicEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean wireless;


    public Headphone(String name, Type type, Double price, List<SpecialOffer> offer, Color color, Manufacturer manufacturer, String strength) {
        super(name, type, price, offer, color, manufacturer, strength);
    }


    public Headphone(String name, Type type, Double price, List<SpecialOffer> offer, Color color, Manufacturer manufacturer, String strength, boolean wireless) {
        super(name, type, price, offer, color, manufacturer, strength);
        this.wireless = wireless;
    }

    public Headphone() {

    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
