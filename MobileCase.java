import java.io.Serializable;

public class MobileCase extends MobileEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String logo;

    public MobileCase(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, double size) {
        super(name, type, price, offer, color, manufacturer, size);
    }

    public MobileCase(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, double size, String logo) {
        super(name, type, price, offer, color, manufacturer, size);
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
