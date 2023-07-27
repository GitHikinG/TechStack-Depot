public class VrGlasses extends VirtualReality{


    public VrGlasses(String name, TypeReality type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String typeOfTechnology) {
        super(name, type, price, offer, color, manufacturer, typeOfTechnology);
    }

    enum TypeGlasses {
        NONIMMERSIVE,
        SEMIIMMERSIVE,
        FULLYIMMERSIVE
    }

    private TypeGlasses typeGlasses;


    public VrGlasses(String name, TypeReality type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, String typeOfTechnology, TypeGlasses typeGlasses) {
        super(name, type, price, offer, color, manufacturer, typeOfTechnology);
        this.typeGlasses = typeGlasses;
    }


    public TypeGlasses getTypeGlasses() {
        return typeGlasses;
    }

    public void setTypeGlasses(TypeGlasses typeGlasses) {
        this.typeGlasses = typeGlasses;
    }


    @Override
    public String toString() {
        return "VrGlasses{" +
                "typeGlasses=" + typeGlasses +
                '}';
    }
}
