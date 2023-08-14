import java.io.Serializable;

public class VideoEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    enum Type {
        MONITOR,
        TV,
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
    private double diameter;
    private String resolution;

    public VideoEquipment(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, double diameter, String resolution) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offer = offer;
        this.color = color;
        this.manufacturer = manufacturer;
        this.diameter = diameter;
        this.resolution = resolution;
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

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "VideoEquipment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offer=" + offer +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", diameter=" + diameter +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
