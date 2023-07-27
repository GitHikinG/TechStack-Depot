public class Component extends ComputerEquipment {
    public Component(String name, TypeEquipment type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        super(name, type, price, offer, color, manufacturer, yearsOfWarranty);
    }

    enum Type {
        SSD,
        VIDEOCARD,
        RAM,
        COOLING
    }

    private Type type;


    public Component(String name, TypeEquipment type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, int yearsOfWarranty, Type type1) {
        super(name, type, price, offer, color, manufacturer, yearsOfWarranty);
        this.type = type1;
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
