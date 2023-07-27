public class ComputerEquipment {
    enum TypeEquipment {
        LAPTOP,
        COMPONENT
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
    private TypeEquipment type;
    private Double price;
    private SpecialOffer offer;
    private Color color;
    private Manufacturer manufacturer;
    private int yearsOfWarranty;

    public ComputerEquipment(String name, TypeEquipment type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offer = offer;
        this.color = color;
        this.manufacturer = manufacturer;
        this.yearsOfWarranty = yearsOfWarranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeEquipment getType() {
        return type;
    }

    public void setType(TypeEquipment type) {
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

    public int getYearsOfWarranty() {
        return yearsOfWarranty;
    }

    public void setYearsOfWarranty(int yearsOfWarranty) {
        this.yearsOfWarranty = yearsOfWarranty;
    }

    @Override
    public String toString() {
        return "ComputerEqupiment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offer=" + offer +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", yearsOfWarranty=" + yearsOfWarranty +
                '}';
    }
}
