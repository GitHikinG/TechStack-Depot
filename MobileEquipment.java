public class MobileEquipment {
    enum Type {
        PHONE,
        CASE
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
    private double size;

    public MobileEquipment(String name, Type type, Double price, Color color, double size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public MobileEquipment(String name, Type type, Double price, Color color, Manufacturer manufacturer, double size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public MobileEquipment(String name, Type type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, double size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offer = offer;
        this.color = color;
        this.manufacturer = manufacturer;
        this.size = size;
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "MobileEquipment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offer=" + offer +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", size=" + size +
                '}';
    }
}
