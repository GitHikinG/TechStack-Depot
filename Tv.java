import java.io.Serializable;
import java.util.List;

public class Tv extends VideoEquipment implements Serializable {
    private static final long serialVersionUID = 1L;
    private String typeTv;

    public Tv(String typeTv) {
        this.typeTv = typeTv;
    }

    public Tv(String name, Type type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, double diameter, String resolution, String typeTv) {
        super(name, type, price, offers, color, manufacturer, diameter, resolution);
        this.typeTv = typeTv;
    }

    public Tv() {

    }

    public String getTypeTv() {
        return typeTv;
    }

    public void setTypeTv(String typeTv) {
        this.typeTv = typeTv;
    }
}
