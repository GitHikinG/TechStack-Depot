public class WashingMachine extends HouseholdItem {
    private int rotations;

    public WashingMachine(String name, TypeHousehold type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, int yearOfManufacturing, int ecoLevel, int rotations) {
        super(name, type, price, offer, color, manufacturer, yearOfManufacturing, ecoLevel);
        this.rotations = rotations;
    }


    public int getRotations() {
        return rotations;
    }

    public void setRotations(int rotations) {
        this.rotations = rotations;
    }


    @Override
    public String toString() {
        return "WashingMachine{" +
                "rotations=" + rotations +
                '}';
    }
}
