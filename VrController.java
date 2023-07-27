public class VrController extends VirtualReality{

    private int numberOfButtons;

    public VrController(String name, TypeReality type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String typeOfTechnology, int numberOfButtons) {
        super(name, type, price, offer, color, manufacturer, typeOfTechnology);
        this.numberOfButtons = numberOfButtons;
    }


    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        this.numberOfButtons = numberOfButtons;
    }

    @Override
    public String toString() {
        return "VrController{" +
                "numberOfButtons=" + numberOfButtons +
                '}';
    }
}
