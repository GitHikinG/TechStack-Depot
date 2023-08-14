import java.io.Serializable;

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
    private SpecialOffer offer;
    private Color color;
    private Manufacturer manufacturer;
    private String strength;


    public MusicEquipment(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String strength) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offer = offer;
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

    public SpecialOffer getOffer() {
        return offer;
    }

    public void setOffer(SpecialOffer offer) {
        this.offer = offer;
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
                ", offer=" + offer +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", strength='" + strength + '\'' +
                '}';
    }
}
