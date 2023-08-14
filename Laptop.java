import java.io.Serializable;
import java.util.ArrayList;

public class Laptop extends ComputerEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private int ram;
    private int storage;

    public Laptop(String name, TypeEquipment type, Double price, ArrayList<SpecialOffer> offers, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        super(name, type, price, offers, color, manufacturer, yearsOfWarranty);
    }
    public Laptop() {

    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
