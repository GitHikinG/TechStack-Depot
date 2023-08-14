import java.io.Serializable;
import java.util.List;

public class HouseholdItem implements Serializable {

    private static final long serialVersionUID = 1L;


    enum TypeHousehold {
        WASHING,
        UTENSIL,
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
    private TypeHousehold type;
    private Double price;
    private List<SpecialOffer> offers;
    private Color color;
    private Manufacturer manufacturer;
    private int yearOfManufacturing;
    private int ecoLevel;


    public HouseholdItem(String name, TypeHousehold type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearOfManufacturing, int ecoLevel) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.offers = offers;
        this.color = color;
        this.manufacturer = manufacturer;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ecoLevel = ecoLevel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeHousehold getType() {
        return type;
    }

    public void setType(TypeHousehold type) {
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

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public int getEcoLevel() {
        return ecoLevel;
    }

    public void setEcoLevel(int ecoLevel) {
        this.ecoLevel = ecoLevel;
    }


    @Override
    public String toString() {
        return "HouseholdItem{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", offers=" + offers +
                ", color=" + color +
                ", manufacturer=" + manufacturer +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", ecoLevel=" + ecoLevel +
                '}';
    }
}
