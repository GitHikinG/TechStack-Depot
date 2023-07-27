public class Laptop extends ComputerEquipment {

    private int ram;
    private int storage;

    public Laptop(String name, TypeEquipment type, Double price, SpecialOffer offer, Color color, Manufacturer manufacturer, int yearsOfWarranty) {
        super(name, type, price, offer, color, manufacturer, yearsOfWarranty);
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
