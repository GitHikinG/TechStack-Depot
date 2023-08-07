import java.io.Serializable;
import java.util.ArrayList;

public class Component extends ComputerEquipment implements Serializable {


    private static final long serialVersionUID = 1L;

    public Component(String name, TypeEquipment type, Double price, ArrayList<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        super(name, type, price, offers, color, manufacturer, yearsOfWarranty);
    }


    public Component ( ) {

    }
    enum Type {
        SSD,
        VIDEOCARD,
        RAM,
        COOLING
    }

    private Type type;


    public Component(String name, TypeEquipment type, Double price, ArrayList<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearsOfWarranty, Type type1) {
        super(name, type, price, offers, color, manufacturer, yearsOfWarranty);
        this.type = type1;
    }

    public Component (ComputerEquipment base, Component.Type type) {

    }


    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Component{" +
                "type=" + type +
                '}';
    }
}
