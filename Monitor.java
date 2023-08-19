import java.io.Serializable;
import java.util.List;

public class Monitor extends VideoEquipment implements Serializable {

    private boolean densitu;
    private static final long serialVersionUID = 1L;


    public Monitor(boolean densitu) {

        this.densitu = densitu;
    }

    public Monitor(String name, Type type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, double diameter, String resolution, boolean densitu) {
        super(name, type, price, offers, color, manufacturer, diameter, resolution);
        this.densitu = densitu;
    }

    public Monitor() {

    }


    public boolean isDensitu() {
        return densitu;
    }

    public void setDensitu(boolean densitu) {
        this.densitu = densitu;
    }
}
