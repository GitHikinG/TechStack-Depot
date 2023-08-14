import java.io.Serializable;
import java.util.List;

public class MusicEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    enum Type {
        HEADPHONE,
        MICROPHONE,
    }
    enum Color {
        YELLOW,
        BLACK,
        GREEN,
        GRAY,
        WHITE,
        BLUE
    }
    private String name;
    private Type type;
    private Double price;

    private List<SpecialOffer> offers;
    private Color color;
    private Manufacturer manufacturer;
    private String strength;


    public MusicEquipment(String name, Type type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, String strength) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offers = offers;
        this.color = color;
        this.manufacturer = manufacturer;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<SpecialOffer> getOffers() {
        return offers;
    }

    public void setOffers(List<SpecialOffer> offers) {
        this.offers = offers;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "MusicEquipment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offers=" + offers +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", strength='" + strength + '\'' +
                '}';
    }
}
