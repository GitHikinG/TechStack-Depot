import java.io.Serializable;
import java.util.List;

public class KitchenUtensil extends HouseholdItem  implements Serializable {

    private static final long serialVersionUID = 1L;

    public KitchenUtensil(String name, TypeHousehold type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearOfManufacturing, int ecoLevel) {
        super(name, type, price, offers, color, manufacturer, yearOfManufacturing, ecoLevel);
    }

    private double weight;

    public KitchenUtensil(String name, TypeHousehold type, Double price, List<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearOfManufacturing, int ecoLevel, double weight) {
        super(name, type, price, offers, color, manufacturer, yearOfManufacturing, ecoLevel);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
