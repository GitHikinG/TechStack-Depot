import java.io.Serializable;
import java.util.ArrayList;

public class ComputerEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

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
    private ArrayList<SpecialOffer> offers;
    private Color color;
    private Manufacturer manufacturer;
    private int yearsOfWarranty;

    public ComputerEquipment() {

    }

    public ComputerEquipment(String name, TypeEquipment type, Double price, ArrayList<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offers = offers;
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

    public ArrayList<SpecialOffer> getOffers() {
        return offers;
    }

    public void setOffers(ArrayList<SpecialOffer> offers) {
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

    public int getYearsOfWarranty() {
        return yearsOfWarranty;
    }

    public void setYearsOfWarranty(int yearsOfWarranty) {
        this.yearsOfWarranty = yearsOfWarranty;
    }


    @Override
    public String toString() {
        return "ComputerEquipment{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offers=" + offers +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", yearsOfWarranty=" + yearsOfWarranty +
                '}';
    }

}
