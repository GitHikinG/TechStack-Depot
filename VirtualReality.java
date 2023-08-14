import java.io.Serializable;

public class VirtualReality implements Serializable {

    private static final long serialVersionUID = 1L;

    enum TypeReality {
        GLASSES,
        CONTROLLER,
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
    private TypeReality type;
    private Double price;
    private SpecialOffer offer;
    private Color color;
    private Manufacturer manufacturer;
    private String typeOfTechnology;

    public VirtualReality(String name, TypeReality type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String typeOfTechnology) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offer = offer;
        this.color = color;
        this.manufacturer = manufacturer;
        this.typeOfTechnology = typeOfTechnology;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeReality getType() {
        return type;
    }

    public void setType(TypeReality type) {
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

    public String getTypeOfTechnology() {
        return typeOfTechnology;
    }

    public void setTypeOfTechnology(String typeOfTechnology) {
        this.typeOfTechnology = typeOfTechnology;
    }


    @Override
    public String toString() {
        return "VirtualReality{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offer=" + offer +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", typeOfTechnology='" + typeOfTechnology + '\'' +
                '}';
    }
}
