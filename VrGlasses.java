import java.io.Serializable;
import java.util.List;

public class VrGlasses extends VirtualReality implements Serializable {

    private static final long serialVersionUID = 1L;

    public VrGlasses(String name, TypeReality type, Double price, List<SpecialOffer> offer, Color color, Manufacturer manufacturer, String typeOfTechnology) {
        super(name, type, price, offer, color, manufacturer, typeOfTechnology);
    }

    public VrGlasses() {

    }

    enum TypeGlasses {
        NONIMMERSIVE,
        SEMIIMMERSIVE,
        FULLYIMMERSIVE
    }

    private TypeGlasses typeGlasses;


    public VrGlasses(String name, TypeReality type, Double price, List<SpecialOffer> offer, Color color, Manufacturer manufacturer, String typeOfTechnology, TypeGlasses typeGlasses) {
        super(name, type, price, offer, color, manufacturer, typeOfTechnology);
        this.typeGlasses = typeGlasses;
    }


    public TypeGlasses getTypeGlasses() {
        return typeGlasses;
    }

    public void setTypeGlasses(TypeGlasses typeGlasses) {
        this.typeGlasses = typeGlasses;
    }

}
