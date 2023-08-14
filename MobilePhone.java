import java.io.Serializable;
import java.util.List;

public class MobilePhone extends MobileEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean fastCharging;

    public MobilePhone(String name, Type type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, double size) {
        super(name, type, price, offers, color, manufacturer, size);
    }

    public MobilePhone(String name, Type type, Double price, Color color, Manufacturer manufacturer, double size, boolean fastCharging) {
        super(name, type, price, color, manufacturer, size);
        this.fastCharging = fastCharging;
    }

    public MobilePhone(String name, Type type, Double price, Color color, double size, boolean fastCharging) {
        super(name, type, price, color, size);
        this.fastCharging = fastCharging;
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

}
